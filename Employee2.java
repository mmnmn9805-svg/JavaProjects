class Employee {
    String name;
    int id;

    
    void display() {
        System.out.println("الاسم: " + name);
        System.out.println("الرقم الوظيفي: " + id);
    }
}


class Manager extends Employee {
    String department;

    
    void displayManager() {
        display(); // استدعاء دالة عرض بيانات الموظف
        System.out.println("القسم: " + department);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "أحمد";
        m.id = 101;
        m.department = "الموارد البشرية";

        m.displayManager();
    }
}
