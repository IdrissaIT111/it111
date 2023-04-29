public class MyOperators  {

    public static void main(String[] args) {


        // Arithmetic operators
        // employees, wage, hours worked, overtime, the whole enchilada

        int regularHours, overtimeHours;
        double overtimePay, regularPay, total;
        float wage;
        double hourlyWithOvertime;

        regularHours = 40;
        overtimeHours = 5;
        wage = 25.50F;
        regularPay = regularHours * wage;
        //overtimePay = (wage * 1.5) * overtimeHours;
        //total = overtimePay + regularPay;
        //hourlyWithOvertime = total/ (regularHours + overtimeHours);

        //System.out.println("Regular Pay: $" +regularPay+ " dollars") ;
        //System.out.println("Overtime Pay: $" +overtimePay+ " dollars") ;
        //System.out.println("Total Pay: $" +total+ " dollars") ;
        //System.out.print("Hourly rate with overtime:") ;
        //System.out.printf("$%.2f", hourlyWithOvertime);


        // modulus operator

        int number1, number2, number3;
        number1= 2577;
        number2= 2;
        number3 = number1 % number2;

            if (number3 ==0) {
                //System.out.println(number1 + " is an even number");

            }else{
                //System.out.println(number1 + "is an ODD number");
            }

            double tax, priceOfItem, taxOnItem, totalPrice;
            tax = .10;
            priceOfItem = 100.00;
            taxOnItem = priceOfItem * tax;
            totalPrice = priceOfItem + taxOnItem;
        //System.out.println("Price of item $" +priceOfItem+ " dollars");
        //System.out.println("Tax $" +taxOnItem+ " dollars");
        //System.out.println("Price including tax $" +totalPrice+ " dollars");


         double priceofItem = 100;
         priceofItem *= 1.10;

        System.out.print("Total price of item is: ");
         System.out.printf("$%.2f", priceofItem);
        System.out.print(" dollars ");











    }
}
