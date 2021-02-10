package employeeManagmentSystem;


public class Teaching extends Employee{
    // variables
    private Course course;
    private boolean isTeaching = true;
    private int noOfWorkingHours;

    public Teaching(String name, String id, int age, int salary, Course course, int noOfWorkingHours) {
        super(name, id, age, salary);
        this.course = course;
        this.isTeaching = true;
        this.noOfWorkingHours = noOfWorkingHours;
    }

    // getters and setters
    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isIsTeaching() {
        return this.isTeaching;
    }

    public int getNoOfWorkingHours() {
        return this.noOfWorkingHours;
    }

    public void setNoOfWorkingHours(int noOfWorkingHours) {
        this.noOfWorkingHours = noOfWorkingHours;
    }    


}
