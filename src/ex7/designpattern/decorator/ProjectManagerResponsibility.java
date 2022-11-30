package ex7.designpattern.decorator;

public class ProjectManagerResponsibility extends Responsibility {
    public ProjectManagerResponsibility(Employee decorated, String office) {
        super(decorated, office);
    }
    @Override
    protected String getResponsibilityDescription() {
        return "project manager";
    }
}
