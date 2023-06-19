import java.util.function.Predicate;
//использует интерфейс Predicate из стандартной библиотеки Java


public class Main14 {
    public static void main(String[] args) {
        String str = "Hello, world!";
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        //лямбда выражение, которое проверяет, что строка не пуста

        if (isNotEmpty.test(str)) {
            System.out.println("The string is not empty");
        } else {
            System.out.println("The string is empty");
        }
    }
}