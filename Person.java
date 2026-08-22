class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("الاسم: " + name);
        System.out.println("العمر: " + age);
    }
}


class Student extends Person {
    int studentId;
    String major;

    void displayStudent() {
        displayPerson();
        System.out.println("الرقم الجامعي: " + studentId);
        System.out.println("التخصص: " + major);
    }
}


class Teacher extends Person {
    String subject;
    int experienceYears;
    void displayTeacher() {
        displayPerson();
        System.out.println("المادة: " + subject);
        System.out.println("سنوات الخبرة: " + experienceYears);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "خالد";
        student.age = 20;
        student.studentId = 441001;
        student.major = "علوم حاسب";

        Teacher teacher = new Teacher();
        teacher.name = "د. محمد";
        teacher.age = 45;
        teacher.subject = "برمجة كائنية";
        teacher.experienceYears = 12;

        System.out.println("=== بيانات الطالب ===");
        student.displayStudent();

        System.out.println("\n=== بيانات المدرس ===");
        teacher.displayTeacher();
    }
}
