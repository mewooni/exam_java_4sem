interface Printable {
    void print();
}

public class Main {
    public static void main(String[] args) {
        // Создаем лямбда-выражение для интерфейса Printable
        Printable printable = () -> {
            System.out.println("Hello, World!");
        };

        // Вызываем метод print для объекта, реализующего интерфейс Printable
        printable.print();
    }
}