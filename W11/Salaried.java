package W11;
/*
This clas contain Salaried Employee annualSalary.
And override getGrossPay, getFedWithholding and 
getStateWithholding methods according to the data

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

/* Design a class named Salaried that inherits from Employee. Your Salaried class should include: */
public class Salaried extends Employee {
    //A double, annualSalary, that holds the annual salary for this person.
    private double annualSalary;
    //An appropriate no-arg constructor.
    public Salaried() {
        annualSalary = 0;
    }
    //An appropriate parameterized constructor.
    public Salaried(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    //A Getter for salary. 
    public double getSalary() {
        return annualSalary;
    }
    //Override the getGrossPay( ), getFedWithholding( ) and getStateWithholding( ) methods from the Employee class. The gross pay for a Salaried employee is calculated as annualSalary / 52. Use a state tax rate of 0.07 and a federal tax rate of 0.15.
    @Override
    public double getGrossPay() {
        return annualSalary / 52;
    }
    @Override
    public double getFedWithholding() {
        return getGrossPay() * 0.15;
    }
    @Override
    public double getStateWithholding() {
        return getGrossPay() * 0.07;
    }
}
