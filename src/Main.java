import java.sql.SQLOutput;

public class Main {
    // Задание 1
    public static void determineYear(int year) {
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void main(String[] args) {

        int year = 2000;
        determineYear(year);
    }

     //Задание 2
    public static int getClientOS(String name, int clientDeviceYear) {
        if (name.equals("iOS") && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
            if (name.equals("iOS") && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void main(String[] args) {
        String name = "iOS";
        int clientDeviceYear = 2018;
        getClientOS(name, clientDeviceYear);
    }

      //Задание 3
   public static void calculateTheNumberOfDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
        System.out.println("Потребуется один день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется два дня");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется три дня");
        }
        }
    public static void main(String[] args) {
        int deliveryDistance = 95;
        calculateTheNumberOfDays(deliveryDistance);
        }
        }