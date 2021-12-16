package W11;
/*
This clas contain Hourly Employee wage and hoursWorked.
And override getGrossPay, getFedWithholding and 
getStateWithholding methods according to the data.

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
*/

/* Design a class named Hourly that inherits from Employee. Your Hourly class should include: */
public class Hourly extends Employee {
    //A double, hourlyWage,  that holds this person's hourly wage.
    private double hourlyWage;
    //A double, hoursWorked, that holds the number of hours this person worked.
    private double hoursWorked;
    //An appropriate no-arg constructor.
    public Hourly() {
        hourlyWage = 0;
        hoursWorked = 0;
    }
    //An appropriate parameterized constructor.
    public Hourly(double hourlyWage, double hoursWorked) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    //Getters for hourlyWage and hoursWorked.
    public double getHourlyWage() {
        return hourlyWage;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
    //Override the getGrossPay( ), getFedWithholding( ) and getStateWithholding( ) methods from the Employee class. The gross pay for an Hourly employee is calculated as hoursWorked x hourlyWage. Use a state tax rate of 0.07 and a federal tax rate of 0.15.
    @Override
    public double getGrossPay() {
        return hoursWorked * hourlyWage;
    }
    @Override
    public double getFedWithholding() {
        return getGrossPay() * 0.15;
    }
    @Override
    public double getStateWithholding() {
        return getGrossPay() *  0.07;
    }
}
