import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static void main(String[] args) throws IOException {


        //создается объект HashMap для хранения количества встретившихся символов
        Map<Character, Integer> charCountMap = new HashMap<>();

        // чтение параметра с именем файла
        if (args.length == 0) {
            System.out.println("Не указано имя файла для подсчета символов");
            return;
        }
        String fileName = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        //открывается файл и читается построчно
        String line = reader.readLine();
        while (line != null) {
            //Для каждой строки производится подсчет количества встретившихся символов,
            // каждый найденный символ добавляется в HashMap, а количество его вхождений
            // сохраняется в соответствующем значении
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (!charCountMap.containsKey(c)) {
                    charCountMap.put(c, 1);
                } else {
                    int count = charCountMap.get(c);
                    charCountMap.put(c, count + 1);
                }
            }
            line = reader.readLine();
        }
        reader.close();

        // вывод результатов
        System.out.println("Символов найдено в файле: " + charCountMap.size());
        System.out.println("Подробный счет символов:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}