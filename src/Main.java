import java.time.LocalDate;

public class Main {

    public static boolean isLeapYear(int year){
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
    }

    public static void printIsLeapYear(int year){
        if (isLeapYear(year)){
            System.out.println(year + " год - високосный.");
            return;
        }
        System.out.println(year + " год - не високосный.");
    }

    public static void printVersionForOS(int typeOS, int yearOS){
        int currentYear = LocalDate.now().getYear();
        if (yearOS >= currentYear){
            System.out.println("Установите полную версию приложения для "+ identifyOS(typeOS)+" по ссылке»");
            return;
        }
        System.out.println("Установите облегченную версию приложения для "+ identifyOS(typeOS)+" по ссылке»");
    }

    public static String identifyOS(int typeOS){
        if (typeOS == 0){
            return "iOS";
        } else if (typeOS == 1) {
            return "Android";
        }
        return "неизвестная ОС";
    }

    public static void printTimeDelivery(int deliveryDistance){
        System.out.println("Потребуется дней: " + ((deliveryDistance+20)/40 + 1));
    }

    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int year1900 = 1900;
        int year2000 = 2000;
        int year2022 = 2022;
        printIsLeapYear(year1900);
        printIsLeapYear(year2000);
        printIsLeapYear(year2022);

        //Задача 2
        System.out.println("\nЗадача 2");
        int clientDeviceYear = 2015;
        int typeOS = 0;
        printVersionForOS(typeOS, clientDeviceYear);

        //Задача 3
        System.out.println("\nЗадача 3");
        int deliveryDistance = 95;
        printTimeDelivery(deliveryDistance);
    }
}