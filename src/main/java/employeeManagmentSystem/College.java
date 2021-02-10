package employeeManagmentSystem;

import java.util.ArrayList;

public class College {
    private String name;
    private String state;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayList<Lab> labs = new ArrayList<Lab>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Lab> getLab() {
        return labs;
    }

    public void addLab(Lab l) {
        labs.add(l);
    }

    public void removeLab(Lab l) {
        labs.remove(l);
    }

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
    // add employee
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    //add teaching employee
    public void addTeacher(Teaching t) {
        employees.add(t);
    }


    // remove employee
    public void removeEmployee(Employee e) {
        employees.remove(e);
    }
    // remove teaching employee
    public void removeTeacher(Teaching t) {
        employees.remove(t);
    }

    public void printAllEmployeeDetails() {
        for (Employee e : employees) {
            System.out.println(e.getName() + "\t\t" + "id : " + e.getId());
            System.out.println("\t\t\t" + "age : " + e.getAge());
            System.out.println("\t\t\t" + "salary : " + e.getSalary());
        }
    }

}
