import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class dz5_1 {
   // Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
    public static int choice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите какую операцию хотите совершить:\n1 - добавление данных в телефонный справочник\n2 - выход");
        String operation = sc.nextLine();
        switch (operation) {
            case ("1"):
                return 1;
            case ("2"):
                return 2;
        }
        return 0;
    }
    public static void add() {
        Scanner sc = new Scanner(System.in);
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        add: while (true) {
            int choice = choice();
            if (choice == 1) {
                System.out.print("Введите имя: ");
                String name = sc.nextLine();
                System.out.print("Введите номер телефона: ");
                String number = sc.nextLine();
                if (!map.containsKey(name)) {
                    ArrayList<String> numbers = new ArrayList<String>();
                    numbers.add(number);
                    map.put(name, numbers);
                } else {
                    var numbers = map.get(name);
                    numbers.add(number);
                    map.put(name, numbers);
                }
            }
            if (choice == 2) {
                break add;
            }
            System.out.println(map);
        }
        sc.close();
    }
    public static void main(String[] args) {
        add();
    }
} 

