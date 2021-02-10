package employeeManagmentSystem;

public class Employee {
    // attributes
    private String name;
    private String id;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public Employee(String name, String id, int age, int salary) {
        this.name = name;
        this.id = id;
        this.age = age;

        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
