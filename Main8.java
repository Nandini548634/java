class Employee {
    double baseSalary;

    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    double bonus;

    @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Main8 {
    public static void main(String[] args) {
        SalesEmployee s = new SalesEmployee();

        s.baseSalary = 25000;
        s.bonus = 5000;

        System.out.println("Total Salary: " + s.calculateSalary());
    }
}