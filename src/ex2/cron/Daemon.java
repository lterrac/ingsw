package ex2.cron;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Daemon {
    private static final int MAXIMUM_ACTIONS = 10;
    private final Action[] todo;
    private final boolean[] done;
    private int actionsSize;

    public Daemon() {
        actionsSize = 0;
        todo = new Action[MAXIMUM_ACTIONS];
        done = new boolean[MAXIMUM_ACTIONS];
    }

    public void addAction(Action a) {
        todo[actionsSize++] = a;
    }

    public void go() {
        int i = 0;
        boolean ended, earlyStop;
        do {
            Date now = new Date();
            if (todo[i] != null && now.after(todo[i].getWhen()) && !done[i]) {
                todo[i].getWhat().doIt();
                done[i] = true;
            }

            if (i == MAXIMUM_ACTIONS - 1)
                i = 0;
            else
                i++;

            ended = true;
            earlyStop = false;

            for (int k = 0; k < MAXIMUM_ACTIONS && !earlyStop; k++)
                if (todo[k] != null && !done[k]) {
                    ended = false;
                    earlyStop = true; // questo ci permette di uscire prima dal ciclo for
                }
        } while (!ended);
    }

    public static void main(String[] args) {
        Daemon m = new Daemon();
        Calendar ca1 = new GregorianCalendar();
        ca1.set(2022,Calendar.OCTOBER,9,18,45,1);
        Calendar ca2 = new GregorianCalendar();
        ca1.set(2022,Calendar.OCTOBER,9,18,44,1);

        m.addAction(new Action(new Op1(), ca1.getTime()));
        m.addAction(new Action(new Op2(), ca2.getTime()));
        m.go();

    }

}

