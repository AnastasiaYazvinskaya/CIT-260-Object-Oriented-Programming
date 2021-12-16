package W11;
/*
This program creates instances for each employee in the list of employees and calculate their payroll.

(Employee.java)
public class Employee:
    protected String name;
    protected int serialNumber;
    public Employee()
    public Employee(String name, int serialNumber)
    public String getName()
    public int getSerialNumber()
    public double getGrossPay()
    public double getFedWithholding()
    public double getStateWithholding()

(Salaried.java)
public class Salaried extends Employee:
    private double annualSalary;
    public Salaried()
    public Salaried(double annualSalary)
    public double getSalary()
    @Override
    public double getGrossPay()
    @Override
    public double getFedWithholding()
    @Override
    public double getStateWithholding()

(Hourly.java)
public class Hourly extends Employee:
    private double hourlyWage;
    private double hoursWorked;
    public Hourly()
    public Hourly(double hourlyWage, double hoursWorked)
    public double getHourlyWage()
    public double getHoursWorked()
    @Override
    public double getGrossPay()
    @Override
    public double getFedWithholding()
    @Override
    public double getStateWithholding()
*/

import java.util.ArrayList;
/* Create a driver class that contains your main( ) method. Your main( ) method should do the following: */
public class W11dot1 {
    public static void main(String[] args) {
        //Tells the user what the program does.
        System.out.format("This program creates instances for the employees and calculate their payroll.%n%n");
        //Creates an ArrayList<Employee>.
        ArrayList<Employee> employees = new ArrayList<Employee>();
        //Create instances for the following employees and add them to the ArrayList:
        //  Hourly employee Harry Hacker, serial number 123. Harry earns $15.00 and hour and works 30 hours a week.
        Hourly employee1 = new Hourly(15, 30);
        employee1.name = "Harry Hacker";
        employee1.serialNumber = 123;
        employees.add(employee1);
        //  Hourly employee Isabel Intern, serial number 233. Isabel earns $12.50 and hour and works 20 hours a week.
        Hourly employee2 = new Hourly(12.5, 20);
        employee2.name = "Isabel Intern";
        employee2.serialNumber = 233;
        employees.add(employee2);
        //  Salaried employee Cathy Coder, serial number 611. Cathy earns $80,000 a year.
        Salaried employee3 = new Salaried(80000);
        employee3.name = "Cathy Coder";
        employee3.serialNumber = 611;
        employees.add(employee3);
        //Using an appropriate loop to go through the Employees in the ArrayList, print out a payroll report as shown in the following diagram:
        System.out.println("Payroll Report");
        for (int i = 0; i < employees.size(); i++) {
            double netPay =   employees.get(i).getGrossPay() - employees.get(i).getStateWithholding() -  employees.get(i).getFedWithholding();
            System.out.format("Employee: %s Serial: %d" +
                            "%nGross Pay: $%,.2f" +
                            "%nFederal Withholding: $%,.2f" +
                            "%nState Withholding: $%,.2f" +
                            "%nNet Pay: $%,.2f%n%n", 
                            employees.get(i).getName(), employees.get(i).getSerialNumber(), employees.get(i).getGrossPay(), employees.get(i).getFedWithholding(), employees.get(i).getStateWithholding(), netPay);
        }
        //Display a goodbye message.
        System.out.format("%nGoodbye.");
    }
}
