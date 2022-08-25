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
}

//           Задание 2
//        public static int getClientOS (String name){
//            if (name.equals("iOS")) {
//                return 0;
//            } else {
//                return 1;
//            }
//        }

//            public static void releaseYear(int clientDeviceYear) {
//
//                if (clientDeviceYear >= 2015) {
//                } else {
//                    String name1 = "iOS";
//                    System.out.println("Установите обычную версию приложения для iOS по ссылке");
//                }
//                if (clientDeviceYear < 2015) {
//                } else {
//                    String name1 = "iOS";
//                }
//                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
//
//                if (clientDeviceYear >= 2015) {
//                } else {
//                    String name2 = "Android";
//                }
//                System.out.println("Установите обычную версию приложения для Android по ссылке");
//
//                if (clientDeviceYear < 2015) {
//                } else {
//                    String name2 = "Android";
//                }
//                System.out.println("Установите облегченную версию приложения для Android по ссылке");
//            }
//
//
//            public static void main(String[] args) {
//                int clientDeviceYear = 2018;
//                String name = "0";
//                String name2 = "1";
//                releaseYear(clientDeviceYear);
//                releaseYear(clientDeviceYear);
//            }
//        }
//