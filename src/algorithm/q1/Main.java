package algorithm.q1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "123 Main St", 50000, 123456789);
        Manager manager = new Manager("John Doe", "123 Main St", 50000, 123456789, 5000);


        System.out.println(manager.toString());
        manager.test();
    }
}
