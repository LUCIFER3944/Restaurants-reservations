import java.util.Scanner;

public class Menu {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant! Here is our menu:");
        System.out.println("1. Burger ");
        System.out.println("2. Pizza ");
        System.out.println("3. Pasta ");
        System.out.println("4. Salad ");
        System.out.println("5. Exit");
        System.out.println("Please enter the number of the item you would like to order:");

        int choice = sc.nextInt();
        System.out.println("Enter quantity & price :");
        int quantity = sc.nextInt();
        int price = sc.nextInt();

        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your address:");
        String address = sc.next();
        System.out.println("Enter your mobile number:");
        long mobileNumber = sc.nextLong();
        
        System.out.println("Enter tax percentage:");
        double taxPercentage = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("You have ordered Burger");
                break;

            case 2:
                System.out.println("You have ordered Pizza");
                break;

            case 3:
                System.out.println("You have ordered Pasta");
                break;

            case 4:
                System.out.println("You have ordered Salad");
                break;

            case 5:
                System.out.println("Exiting the menu. Thank you!");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice. Please select a valid item from the menu.");
                sc.close();
                return;
        }

        int total = price * quantity;
        double taxAmount = (taxPercentage / 100) * total;
        double totalWithTax = total + taxAmount;

        System.out.println("Customer Name: " + name);
        System.out.println("Customer Address: " + address);
        System.out.println("Customer Mobile Number: " + mobileNumber);
        System.out.println("Item Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + total);
        System.out.println("Tax Percentage: " + taxPercentage + "%");
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Total with Tax: $" + totalWithTax);

        System.out.println("Thank you for ordering!");
        sc.close();
    }
}
