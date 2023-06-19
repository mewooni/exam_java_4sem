import java.util.function.Predicate;
//использует интерфейс Predicate из стандартной библиотеки Java для определения того,
// что строка не является null и не пустая

public class CheckString {

    public static void main(String[] args) {
        String testString = "";
        Predicate<String> isEmpty = s -> s != null && !s.isEmpty();
        //класс CheckString, который проверяет, является ли строка null или пустой
        if (isEmpty.test(testString)) {
            System.out.println("String is not null and not empty");
        } else {
            System.out.println("String is null or empty");
        }
        //если строка проходит эту проверку, код выводит "String is not null and not empty",
        // а если нет, то "String is null or empty"
    }
}