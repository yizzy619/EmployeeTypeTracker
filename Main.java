import java.util.Scanner;

//Parent Class
class Employee{
    public double calculateSalary() {
        return 0.0;
    }
}

//Child Class
class FullTimeEmployee extends Employee {
    double basePay;
    double bonus;

    @Override

    public double calculateSalary() {
        return basePay + bonus;
    }
}

//Child Class 2
class PartTimeEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;

    @Override

    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}

//Main Class
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Employee Salary Calculator");
        System.out.println("Enter employee type (full-time or part-time): ");
        String type = input.nextLine();

        Employee employee;

        if (type.equalsIgnoreCase("full-time")) {
            FullTimeEmployee fullTime = new FullTimeEmployee();

            System.out.print("Enter base pay: $ ");
            fullTime.basePay = input.nextDouble();

            System.out.print("Enter bonus: $ ");
            fullTime.bonus = input.nextDouble();

            employee = fullTime;

        } else if (type.equalsIgnoreCase("part-time: ")){
        PartTimeEmployee partTime = new PartTimeEmployee();

        System.out.print("Enter hourly rate: ");
        partTime.hourlyRate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        partTime.hoursWorked = input.nextDouble();

        employee = partTime;

    } else{

        System.out.print("Invalid employee type!");
        input.close();
        return;
    }

        System.out.printf("Monthly Salary: $%.2f%n",
                employee.calculateSalary());
        input.close();
    }
}