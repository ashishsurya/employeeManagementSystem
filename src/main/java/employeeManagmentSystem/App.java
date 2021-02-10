package employeeManagmentSystem;




/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        College c = new College("ABC", "Kerala");
        Employee e1 = new Employee("John", "56522387374335", 24, 90000);
        Employee e2 = new Employee("Dennis", "62779283566383", 27, 100000);
        Teaching t1 = new Teaching("Craig", "26399545449369", 32, 130000,  8);
        Course c_1 = new Course("Web Development","gtgenkvs3hjpp3", t1);
        if (t1.isTeacher()) { 
            System.out.println("Is a Teacher");
        } else { 
            System.out.println("Not a Teacher");
        }
    }
}
