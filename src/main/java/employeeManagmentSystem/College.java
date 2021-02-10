package employeeManagmentSystem;

import java.util.ArrayList;

public class College {
    private String name;
    private String state;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public College(String name, String state) {
        this.name = name;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        employees.remove(e);
    }

    public void printAllEmployeeDetails() {
        for (Employee e : employees) {
            System.out.println(e.getName() + "\t\t" + "id : " + e.getId());
            System.out.println("\t\t\t" + "age : " + e.getAge());
            System.out.println("\t\t\t" + "salary : " + e.getSalary());
        }
    }

}
