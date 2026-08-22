class Vehicle {
    String brand;
    String model;

    void displayInfo() {
        System.out.println("الشركة المصنعة: " + brand);
        System.out.println("الموديل: " + model);
    }
}


class Car extends Vehicle {
    int doors;

    void displayCar() {
        displayInfo();
        System.out.println("عدد الأبواب: " + doors);
    }
}


class Motorcycle extends Vehicle {
    String type;

    void displayMotorcycle() {
        displayInfo();
        System.out.println("نوع الدراجة: " + type);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.doors = 4;
        System.out.println("--- بيانات السيارة ---");
        car.displayCar();

        Motorcycle bike = new Motorcycle();
        bike.brand = "Yamaha";
        bike.model = "R1";
        bike.type = "رياضية";
        System.out.println("\n--- بيانات الدراجة النارية ---");
        bike.displayMotorcycle();
    }
}
