package Oopspkg;


class Employdetails {
    private String empName;
    private int empId;

    public void changeName(String newName) {
        this.empName = newName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employdetails emp = new Employdetails();

        emp.setEmpName("Naveena");
        emp.setEmpId(12345);

        // Use getter methods to retrieve and display the employee name and ID
        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee ID: " + emp.getEmpId());
    }
}


