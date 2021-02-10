package employeeManagmentSystem;

public class Course {
    private String courseName;
    private String courseId;
    private Teaching taughtBy;

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Teaching getTaughtBy() {
        return this.taughtBy;
    }

    public void setTaughtBy(Teaching taughtBy) {
        this.taughtBy = taughtBy;
        taughtBy.setCourse(this);
    }

    Course(String courseName, String courseId, Teaching taughtBy) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.taughtBy = taughtBy;
        taughtBy.setCourse(this);
    }

    public void getCourseDetails() {
        System.out.println("Course Name : " + this.courseName);
        System.out.println("COurse Id : " + this.courseId);
        System.out.println("Taught By : " + this.taughtBy.getName());
    }
    public void getLecturerDetails() {
        this.taughtBy.getDetails();
    }

}
