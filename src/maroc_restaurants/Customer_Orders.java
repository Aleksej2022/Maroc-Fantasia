package maroc_restaurants;


import java.util.Date;
import java.util.Scanner;

public class Customer_Orders {
    private int first_mealportion;
    private int main_mealportion;
    private int dessert_portion;
    private int tea_portion;

  /*
  * This is an E-Waiter program for a restaurant called "Marroc Fantasia" and the objective
  * of the program is to collect orders from customers and process their orders based on
  * the portion selections they choose and finnaly issuing a bill. The menu of the restaurant, the portion sizes and the total bill
  * have been displaying in a specific format, using format specifiers and the printf() method
   */


    public static void main(String[] args) {
        Scanner restaurant = new Scanner(System.in);
        Date date = new Date();
        Main_Restaurant e_waiter = new Main_Restaurant();
        Customer_Orders customer_1 = new Customer_Orders();
        Customer_Orders customer_2 = new Customer_Orders();

        System.out.println("Welcome to Maroc Fantasia restaurant");
        System.out.println("Please allow me to take you to your seats");
        System.out.println("-------------------Maroc Fantasia Restaurant Menu-----------------------");
        System.out.printf("%52s%n","Here is the menu for today");
        System.out.printf("%40s %5s%n","First Meal Course: -", e_waiter.first_mealcourse);
        System.out.printf("%40s %5s%n","Main Meal Course: -", e_waiter.main_mealcourse);
        System.out.printf("%40s %5s%n","Main Dessert Course: -", e_waiter.dessert);
        System.out.printf("%40s %5s%n","Tea: -", e_waiter.tea);
        System.out.println("-------------------Maroc Fantasia Restaurant Menu-----------------------");



        System.out.println("We also offer different portion sizes for the first course meal,the main meal course, the dessert and tea");
        //Displaying to the customers the avalable portion sizes at the restaurant
        System.out.println("-------------------Maroc Fantasia Restaurant Portion Sizes-----------------------");
        System.out.printf("%50s%n", "Small portion(x1)");
        System.out.printf("%50s%n", "Large portion(x2)");
        System.out.printf("%50s%n", "X-Large portion(x3)");
        System.out.println("-------------------Maroc Fantasia Restaurant Portion Sizes-----------------------");
        System.out.println();

        //Receiving orders from the first customer
        System.out.println("Hello customer 1, what portion would you like for the first meal course(1 or 2 or 3)?");
        customer_1.first_mealportion = restaurant.nextInt();

        System.out.println("and what portion would you like for the main meal course(1 or 2 or 3)?");
        customer_1.main_mealportion = restaurant.nextInt();

        System.out.println("the dessert(1 or 2 or 3)?");
        customer_1.dessert_portion = restaurant.nextInt();

        System.out.println("and finally the tea portion(1 or 2 or 3)?");
        customer_1.tea_portion = restaurant.nextInt();
        System.out.println("Thank you customer 1");

        //Receiving orders from the second customer
        System.out.println("Hello customer 2, what portion would you like for the first meal course(1 or 2 or 3)?");
        customer_2.first_mealportion = restaurant.nextInt();

        System.out.println("and what portion would you like for the main meal course(1 or 2 or 3)?");
        customer_2.main_mealportion = restaurant.nextInt();

        System.out.println("the dessert(1 or 2 or 3)?");
        customer_2.dessert_portion = restaurant.nextInt();

        System.out.println("and finally the tea portion(1 or 2 or 3)?");
        customer_2.tea_portion = restaurant.nextInt();
        System.out.println("Thank you customer 2");

        System.out.println("Your meals will be brought right away!!!");

        double bill_cus1 = customer_1.first_mealportion * e_waiter.first_mealcourseprice + customer_1.main_mealportion * e_waiter.main_mealcourseprice + customer_1.dessert_portion * e_waiter.dessert_price + customer_1.tea_portion * e_waiter.tea_price;

        double bill_cus2 = customer_2.first_mealportion * e_waiter.first_mealcourseprice + customer_2.main_mealportion * e_waiter.main_mealcourseprice + customer_2.dessert_portion * e_waiter.dessert_price + customer_2.tea_portion * e_waiter.tea_price;

        double total_bill = bill_cus1 + bill_cus2;

        // Displaying the final bill to the customers
        System.out.println("\n-------------------Maroc Fantasia Restaurant Bill-----------------------");

        System.out.printf("%20s %tH: %tM: %tS", "Current Time:- ", date,date,date);
        System.out.printf("%20s %td - %tm - %ty %n", "Current Date:- ", date,date,date);
        System.out.printf("%50s %10s%n", "Customer 1 Meal Cost: -", bill_cus1);
        System.out.printf("%50s %10s%n", "Customer 2 Meal Cost: -", bill_cus2);
        System.out.printf("%50s %10s%n", "Total Bill: -", total_bill);
        System.out.printf("%50s%n", "please pay at the reception");
        System.out.println("-------------------Maroc Fantasia Restaurant Bill-----------------------");



    }
}
