import java.util.Scanner;

public class cc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the currency converter");

        while (true) {
            System.out.println("\n");
            System.out.println("1.convert USD to EUR");
            System.out.println("2.Convert EUR to USD");
            System.out.println("3.quit");
            System.out.println("enter your choice");

            // redd user
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    convertUSDToEUR();
                    break;
                case 2:
                    convertEURToUSD();
                    break;
                case 3:
                    System.out.println("thank you for using the CC");

                    scanner.close();
                    return;

                default:
                    System.out.println("invalid choice.please try again ");
            }
        }

    }

    private static double usdToEurRate = 0.85;

    private static double eurToUsdRate = 0.85;

    private static void convertUSDToEUR() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount in usd ");
        double usdAmount = scanner.nextDouble();

        @SuppressWarnings("unused")
        double eurAmount = usdAmount * usdToEurRate;
        System.out.println(usdAmount + "USD is equivalent to EUR");
    }

    private static void convertEURToUSD() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount in eur ");
        double eurAmount = scanner.nextDouble();
        double usdAmount = eurAmount * eurToUsdRate;
        System.out.println(usdAmount + "EUR is equivalent to USD");
    }

}