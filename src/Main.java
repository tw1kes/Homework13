//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void outputsYear(int year) {
        if ((year % 400 == 0) || ((year > 1584) && year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год не високосный год");
        }
    }

    public static void installApp(int clientDeviceYear, int clientOS) {
        int clientOperSystem = 1;
        if (clientOperSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOperSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOperSystem == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOperSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    {
        int clientOS = 0;
        int clientDeviceYear = 2015;
    }

    public static int printDeliveryTime(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance < 20) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        return deliveryTime;
    }

    public static void main(String[] args) {
        outputsYear(2025);

        installApp(2015, 1);

        printDeliveryTime(95);
    }
}
