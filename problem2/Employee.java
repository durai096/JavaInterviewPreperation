package JavaCommonQA.problem2;

public class Employee {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmpId(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Employee(String name, int empId, String role) {
        this.name = name;
        this.salary = empId;
        this.role = role;
    }

    private String name;
    private int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + salary +
                ", role='" + role + '\'' +
                '}';
    }

    private String role;
}
