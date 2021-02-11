package employeeManagmentSystem;

public class TechnicalStaff extends Employee{
    private Lab workingInLab;
    private int noOfWorkingHours;
    private boolean isTeaching = false;

    public Lab getWorkingInLab() {
        return this.workingInLab;
    }

    public void setWorkingInLab(Lab workingInLab) {
        this.workingInLab = workingInLab;
    }

    public int getNoOfWorkingHours() {
        return this.noOfWorkingHours;
    }

    public void setNoOfWorkingHours(int noOfWorkingHours) {
        this.noOfWorkingHours = noOfWorkingHours;
    }

    public boolean isIsTeaching() {
        return this.isTeaching;
    }

    public void setIsTeaching(boolean isTeaching) {
        this.isTeaching = isTeaching;
    }

    public TechnicalStaff(String name, String id, int age, int salary, int noOfWorkingHours, College c) {
        super(name, id, age, salary);
        this.noOfWorkingHours = noOfWorkingHours;
        c.addEmployee(this);
    }
    public void getDetails() {
        super.getDetails();
        System.out.println("Working in  : " + this.workingInLab.getLabName());
        System.out.println("No of Working Hours : " + this.noOfWorkingHours);
    }

    public void getWorkingInLabDetails() {
        this.workingInLab.getLabDetails();
    }
}
