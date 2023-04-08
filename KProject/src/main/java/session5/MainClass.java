package session5;

public class MainClass {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmpName("Sunil");
        emp1.setEmpId(1234);

        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getEmpName());
    }
}

// Encapsulation , attributes private, getters and setters

class Employee {
    private String empName;
    private int empId;

    public void setEmpName(String name) {
        this.empName = name;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpId(int id) {
        this.empId = id;
    }

    public int getEmpId() {
        return this.empId;
    }
}