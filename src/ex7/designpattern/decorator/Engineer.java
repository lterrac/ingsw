package ex7.designpattern.decorator;

public class Engineer implements Employee {
    private String name;
    public Engineer(String name){
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getOffice() {
        return "Office personale";
    }

    @Override
    public String getDescription() {
        return "Ing. "+getName();
    }

    public static void main(String[] args){
        Employee e = new Engineer("Andrea");
        e = new ProjectManagerResponsibility(e, "Cremona");
        e = new ProjectManagerResponsibility(e, "Milano");
        e = new AdminResponsibility(e, "Mantova");

        System.out.println(e.getDescription());
        e = ((Responsibility) e).getDecorated();
        System.out.println(e.getDescription());

    }
}
