import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newString = new Scanner(System.in);
        //Exercise 1
        System.out.print("Введите имя сотрудника: ");
        String firstName = newString.nextLine();

        System.out.print("Введите фамилию сотрудника: ");
        String middleName = " " + newString.nextLine();

        System.out.print("Введите отчество сотрудника: ");
        String lastName = " " + newString.nextLine();

        String fullName = firstName + middleName + lastName;
        System.out.println("Ф. И. О. сотрудника - " + fullName + "\n-----------------------------");

        //Exercise 2
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчёта - " +
                upperFullName + "\n-----------------------------");

        //Exercise 3
        String notEndedFullName = fullName.replace("ё", "е");
        String endedFullName = notEndedFullName.replace("Ё", "Е");
        System.out.println("Данные Ф. И. О. сотрудника - " + endedFullName);
    }
}