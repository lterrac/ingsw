package ex1.competition;

import java.util.Arrays;

public class Competition {
    private static final int RANKING_SIZE = 10;
    private String name;
    private String place;
    private String presenter;
    private String startDate;
    private String endDate;

    private Singer[] singers;
    private int singersIndex;

    public Competition(String name, String place,
                       String presenter, String startDate,
                       String endDate)	{
        this.name = name;
        this.place = place;
        this.presenter = presenter;
        this.startDate = startDate;
        this.endDate = endDate;

        singersIndex =0;
        singers =new Singer[RANKING_SIZE];
    }

    @Override
    public String toString() {
        return name +" at "+ place
                +" presented by "+ presenter
                +" from "+ startDate +" to "+ endDate;
    }

    public void print() {
        System.out.println(this);
    }

    public void addSinger(Singer s,int atPosition) {
        int pos=atPosition-1;
        for(int i = RANKING_SIZE -1; i>pos; i--)
        {
            singers[i]= singers[i-1];
        }

        singers[pos]=s;

        if(singersIndex < RANKING_SIZE -1)
            singersIndex++;
    }

    public void addSinger(Singer s)
    {
        if(singersIndex < RANKING_SIZE -1)
        {
            singers[singersIndex]=s;
            singersIndex++;
        }
    }

    /* * cerca il cantante	 */
    public Singer findSinger(String surname,String name) {
        for(int i = 0; i< singersIndex; i++)
        {
            if(singers[i].getSurname().equals(surname)
                    && singers[i].getName().equals(name))
            {
                return singers[i];
            }
        }

        return null;
    }

    public void deleteSinger(Singer s) {
        for(int i = 0; i< singersIndex; i++)
        {
            if(singers[i].equals(s))
            {
                for(int j = i; j< singersIndex -1; j++)
                {
                    singers[j]= singers[j+1];
                }
                singers[singersIndex]=new Singer();
                singersIndex--;
            }
        }
    }

    public void deleteSinger(String surname,String name) {
        deleteSinger(findSinger(surname,name));
    }

    public String generateRanking()
    {
        String str=toString();

        for(int i = 0; i< singersIndex; i++)
            str+="\n"+ singers[i];  //viene chiamato toString()

        return str;
    }

    public void printRanking() {
        System.out.println(generateRanking());
    }

    public String generateOrderedList() {
        Singer[] orderedSingers=new Singer[RANKING_SIZE];

        for(int i = 0; i< singersIndex; i++) {
            orderedSingers[i]= singers[i];
        }

        for(int i = 0; i< singersIndex -1; i++)  {
            for(int j = 0; j< singersIndex -1; j++) {
                if(orderedSingers[j+1].isLessThan(orderedSingers[j]))  {
                    Singer temp=orderedSingers[j+1];
                    orderedSingers[j+1]=orderedSingers[j];
                    orderedSingers[j]=temp;
                }
            }
        }
        String str=toString();
        for(int i = 0; i< singersIndex; i++)
            str+="\n"+orderedSingers[i];
        return str;
    }


}
