package algorithm.q1;

public class Manager extends Employee {
    private int bonus;

    public Manager(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    public void test() {
        System.out.println("This is a test method in the Manager class.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager[bonus=" + bonus + "]";
    }
}

