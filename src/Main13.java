import java.util.function.Predicate;
//используя функциональный интерфейс Predicate

public class Main13 {
    public static void main(String[] args) {
        //лямбда выражение, которое возвращает значение true, если строка не null
        Predicate<String> isNotNull = str -> str != null;

        System.out.println(isNotNull.test("Hello")); // true
        System.out.println(isNotNull.test(null)); // false
    }
}