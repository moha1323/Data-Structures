package hash;

public class Employee {
    int employeeSSN;
    String employeeName;

    public Employee(int employeeSSN, String employeeName) {
        this.employeeSSN = employeeSSN;
        this.employeeName = employeeName;
    }

    public String toString(){
        return "Employee SSN: " + employeeSSN + " EmployeeName: " + employeeName;
    }

    public int getEmployeeSSN() {
        return employeeSSN;
    }

    public void setEmployeeSSN(int employeeSSN) {
        this.employeeSSN = employeeSSN;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
