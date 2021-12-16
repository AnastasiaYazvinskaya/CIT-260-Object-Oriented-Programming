package W11;
/*
This clas contain Employee name and serialNumber.
And base for getGrossPay, getFedWithholding and 
getStateWithholding methods.

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

/*Design a parent class named Employee. Your Employee class should include:*/
public class Employee {
    //A String, name,  that holds the employee's name.
    protected String name;
    //an integer serialNumber, that holds the employee's serial number.
    protected int serialNumber;
    //A no-arg constructor that initializes name to "none" and serialNumber to 0.
    public Employee() {
        name = "none";
        serialNumber = 0;
    }
    //A parameterized constructor that initializes name and serialNumber using arguments passed to the constructor.
    public Employee(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }
    //Getters for name and serialNumber.
    public String getName() {
        return name;
    }
    public int getSerialNumber() {
        return serialNumber;
    }
    //A method named getGrossPay( ) that returns a zero;
    public double getGrossPay() {
        return 0;
    }
    //A method named getFedWithholding( ) that returns a zero.
    public double getFedWithholding() {
        return 0;
    }
    //A method named getStateWithholding( ) that returns a zero.
    public double getStateWithholding() {
        return 0;
    }
}
