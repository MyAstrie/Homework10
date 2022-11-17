import java.util.Locale;

public class Main {

    public static String task1(){
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName =  firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        return fullName;
    }

    public static void task2(String fullName){
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3(String fullName){
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё','e'));
    }

    public static void main(String[] args) {
        String fullName = task1();
        task2(fullName);
        fullName = "Иванов Семён Семёнович";
        task3(fullName);
    }
}