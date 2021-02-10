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

    public TechnicalStaff(String name, String id, int age, int salary, int noOfWorkingHours) {
        super(name, id, age, salary);
        this.noOfWorkingHours = noOfWorkingHours;
    }
        
}
