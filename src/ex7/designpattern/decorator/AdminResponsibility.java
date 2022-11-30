package ex7.designpattern.decorator;

public class AdminResponsibility extends Responsibility {

    public AdminResponsibility(Employee decorated, String office) {
        super(decorated, office);
    }

    @Override
    protected String getResponsibilityDescription() {
        return "admin";
    }
}
