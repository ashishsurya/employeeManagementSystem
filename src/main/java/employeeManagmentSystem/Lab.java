package employeeManagmentSystem;

public class Lab {
    private String labName;
    private String labId;
    private TechnicalStaff labInstructor;

    public String getLabName() {
        return this.labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getLabId() {
        return this.labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public TechnicalStaff getLabInstructor() {
        return this.labInstructor;
    }

    public void setLabInstructor(TechnicalStaff labInstructor) {
        this.labInstructor = labInstructor;
        labInstructor.setWorkingInLab(this);
    }

    public Lab(String labName, String labId, TechnicalStaff labInstructor) {
        this.labName = labName;
        this.labId = labId;
        this.labInstructor = labInstructor;
        labInstructor.setWorkingInLab(this);
    }

    public void getLabDetails() {
        System.out.println("Lab Name : " + this.labName);
        System.out.println("Lab Id : " + this.labId);
    }

    public void getLabInstructorDetails() {
        this.labInstructor.getDetails();
    }
}
