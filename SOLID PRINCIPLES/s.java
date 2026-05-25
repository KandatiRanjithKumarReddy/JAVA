//1. Single Responsibility Principle (SRP)
//Definition:
//A class should have only one reason to change, meaning it should have only a single responsibility.

//1. Single Responsibility Principle (SRP)

public class s {
    public static void main(String[] args) {

        Employee emp = new Employee();

        SalaryCalculator sc = new SalaryCalculator();
        System.out.println(sc.calculateSalary(emp));

        ReportGenerator rg = new ReportGenerator();
        rg.generateReport(emp);
    }
}

class Employee {
    int salary = 50000;
    int bonus = 1000;
}

class SalaryCalculator {
    // only salary logic
    public int calculateSalary(Employee emp) {
        return emp.salary + emp.bonus;
    }
}

class ReportGenerator {
    // only report logic
    public void generateReport(Employee emp) {
        System.out.println("Report Generated");
    }
}
