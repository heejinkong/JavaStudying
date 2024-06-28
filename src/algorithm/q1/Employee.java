package algorithm.q1;

public class Employee {
    String name;
    String address;
    int salary;
    int rrn;

    public Employee(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
    }
}
