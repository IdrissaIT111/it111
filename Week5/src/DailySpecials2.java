import java.util.Scanner;

public class DailySpecials2 {
    public static void main(String[] args) {
        String specials;
        Scanner input = new Scanner(System.in);

        String coffee = null;
        double price;
        price = 0;
        boolean wrongDay = true;

        while(wrongDay) {
            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");
            specials = input.next();

            switch (specials) {
                case "Monday" -> {
                    wrongDay = false;
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    break;
                }
                case "Tuesday" -> {
                    wrongDay = false;
                    coffee = "Frapp's";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    break;
                }
                case "Wednesday" -> {
                    wrongDay = false;
                    coffee = "Cappuccino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    break;
                }
                case "Thursday" -> {
                    wrongDay = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    break;
                    
                }
                case "Friday" -> {
                    wrongDay = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    break;
                }
            }
        }
        System.out.println("How many " + coffee + " would you like to order?");
        int number = input.nextInt();
        double money = number * price;

        switch (number) {
            case 0: {
                System.out.println("Looks like you don't like " + coffee + ", so sad!");
                break;
            }
            case 1: {
                System.out.println("Looks like you will be ordering only one " + coffee + " today!");
                break;
            }
            default: {
                System.out.print(number + " " + coffee + " have been ordered totalling $");
                System.out.printf("%.2f", money);
                System.out.print(" dollars!");
            }
        }
    }
}