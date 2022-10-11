package ex2.cron;

import java.util.Date;

public class Action {
    private final Date when;
    private final Actionable what;

    public Action(Actionable what, Date when) {
        this.when = when;
        this.what = what;
    }

    public Date getWhen() {
        return when;
    }

    public Actionable getWhat() {
        return what;
    }
}
