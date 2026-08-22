class Product {
    String name;
    double price;
    int quantity;

    void displayProduct() {
        System.out.println("المنتج: " + name);
        System.out.println("السعر: " + price + " ريال");
        System.out.println("الكمية: " + quantity);
    }
}


class Book extends Product {
    String author;
    int pages;

    void displayBook() {
        displayProduct();
        System.out.println("المؤلف: " + author);
        System.out.println("عدد الصفحات: " + pages);
    }
}


class Electronics extends Product {
    String manufacturer;
    String warrantyPeriod;

    void displayElectronics() {
        displayProduct();
        System.out.println("الشركة المصنعة: " + manufacturer);
        System.out.println("مدة الضمان: " + warrantyPeriod);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "مقدمة في البرمجة";
        book.price = 50.0;
        book.quantity = 10;
        book.author = "سعود العتيبي";
        book.pages = 300;

        Electronics phone = new Electronics();
        phone.name = "هاتف ذكي";
        phone.price = 2500.0;
        phone.quantity = 5;
        phone.manufacturer = "Samsung";
        phone.warrantyPeriod = "سنتان";

        System.out.println("--- تفاصيل الكتاب ---");
        book.displayBook();

        System.out.println("\n--- تفاصيل المنتج الإلكتروني ---");
        phone.displayElectronics();
    }
}
