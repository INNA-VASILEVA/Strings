import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
// Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
//        System.out.println(
//        String.join(" ", firstName, middleName, lastName)
//        );
// альтернативный вариант без использования оператора сложения

// Задание 2
        System.out.println("Задание 2");
        String name = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + name);

// Задание 3
        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        if ((fullName1.contains("ё"))) {
            String name1 = fullName1.replace('ё', 'е');
            System.out.println("Данные ФИО сотрудника — " + name1);
        } else if ((fullName1.contains("Ё"))) {  // если вдруг ФИО начинается с заглавной буквы Ё, или опечатался - ПЁтр."
            String name1 = fullName1.replace('Ё', 'Е');
            System.out.println("Данные ФИО сотрудника — " + name1);
        } else { //если никаких запрещенных символов нет в ФИО то переменная выводится как есть
            System.out.println("Данные ФИО сотрудника — " + fullName1);
        }

    }
}