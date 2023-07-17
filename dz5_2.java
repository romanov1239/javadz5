
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class dz5_2 {
    public static void main(String[] args) {
        
        sortByTree();
    }


    public static void sortByTree() {
    /*
    Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
    Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова,
    Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников,
    Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся имена
    с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
    */
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, " +
                "Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        s = s.replace(",", "");
        String[] arr = s.split(" ");
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            names.add(arr[i]);
        }
        TreeMap<Object, Integer> map = new TreeMap<>();
        for (Object name : names) {
            if (map.containsKey(name)) {
                int count = map.get(name) + 1;
                map.put(name, count);
            } else {
                map.put(name, 1);
            }
        }
        System.out.println(names);
        map.entrySet().stream().sorted(Map.Entry.<Object, Integer>comparingByValue().reversed()).forEach(System.out::println);
    }
}

