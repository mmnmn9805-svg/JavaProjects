class Student {
    private String name;
    private double grade;

    public void setName(String studentName) {
        name = studentName;
    }

    
    public void setGrade(double studentGrade) {
        if (studentGrade >= 0 && studentGrade <= 100) {
            grade = studentGrade;
        } else {
            System.out.println("خطأ: الدرجة يجب أن تكون بين 0 و 100!");
        }
    }

    public void displayInfo() {
        System.out.println("اسم الطالب: " + name);
        System.out.println("الدرجة: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();

      
        s1.setName("أحمد");
        s1.setGrade(85);

      
        s1.displayInfo();
    }
}
