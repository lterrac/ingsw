package ex7.designpattern.decorator;

public abstract class Responsibility implements Employee {

    private Employee decorated;
    private String office;

    public Responsibility(Employee decorated, String office){
        this.decorated = decorated;
        this.office = office;
    }

    public Employee getDecorated() {
        return decorated;
    }

    public String getName(){
        return decorated.getName();
    }

    @Override
    public String getOffice() {
        return office;
    }

    @Override
    public String getDescription() {
        return decorated.getDescription()+
                " "+getResponsibilityDescription()+
                " area: "+getOffice();
    }

    protected abstract String getResponsibilityDescription();
}
