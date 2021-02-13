package employeeManagmentSystem;




/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        College c = new College("ABC", "Kerala");
        Teaching e1 = new Teaching("John", "56522387374335", 24, 90000, 8, c);
        Teaching e2 = new Teaching("Dennis", "62779283566383", 27, 100000, 8, c);
        Teaching t1 = new Teaching("Craig", "26399545449369", 32, 130000,  8, c);
        Course c_1 = new Course("Web Development","gtgenkvs3hjpp3", t1);
        TechnicalStaff ts1 = new TechnicalStaff("Quincy", "isob34dkebback", 24, 100000, 9, c);
        Lab l1 = new Lab("LAB1", "@52545%^#$^34", ts1);
        c.printAllEmployeeDetails();
        Mess m = new Mess();
        m.getFoodItems();
    }
}
