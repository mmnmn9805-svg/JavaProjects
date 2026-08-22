class Employee {
    private String name;
    private double salary;

    public void setName(String empName) {
        name = empName;
    }

    
    public void setSalary(double empSalary) {
        if (empSalary > 0) {
            salary = empSalary;
        } else {
            System.out.println("خطأ: الراتب يجب أن يكون أكبر من صفر!");
        }
    }

    public void displayInfo() {
        System.out.println("اسم الموظف: " + name);
        System.out.println("الراتب: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
      
        Employee emp = new Employee();

        
        emp.setName("سارة");
        emp.setSalary(3000);

      
        emp.displayInfo();
    }
}
