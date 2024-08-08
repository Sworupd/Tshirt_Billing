import java.util.Scanner;
import java.util.ArrayList;
public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        int n;
        while (start) {
            System.out.println("Do you want to start or quit?");
            String stat = sc.nextLine();

            if (stat.equalsIgnoreCase("quit")) {
                start = false;
            } else {
                ArrayList<Integer> itemcost = new ArrayList<Integer>();

                System.out.println("Enter your ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your password");
                String password = sc.nextLine();

                System.out.println("Welcome to billing counter.");
                System.out.println("Enter the number of items purchased");
                int item = sc.nextInt();

                for (int i = 0; i < item; i++) {
                    System.out.println("Enter the price of item");
                    int cost = sc.nextInt();
                    itemcost.add(cost);
                }
                int totalcost = 0;
                for (int cost : itemcost) {
                    totalcost += cost;
                }
                sc.nextLine();
                System.out.println("Do you want to be charged VAT?(yes/no)");
                String VAT = sc.nextLine();


                if (VAT.equalsIgnoreCase("yes")) {
                    totalcost += totalcost * 0.13;
                    System.out.println("VAT charged.");
                }

                System.out.println("Do you have Discount to apply?(yes/no)");
                String Dis = sc.nextLine();

                if (Dis.equalsIgnoreCase("yes")) {
                    System.out.println("Enter Discount Percentage");
                    int discount = sc.nextInt();
                    totalcost -= totalcost * discount / 100;
                    System.out.println("Discount has been applied");
                }
                System.out.println("The total cost is: " + totalcost);
                System.out.println("Enter Amount of cash you want to pay");
                int money = sc.nextInt();

                int change = money - totalcost;

                if (change >= 1000);
                n = change / 1000;
                System.out.println("Amount of 1000: " +n);
                change = change - n * 1000;

                if(change >= 500);
                n = change / 500;
                System.out.println("Amount of 500: " +n);
                change = change - n * 500;

                if(change >= 100);
                n = change / 100;
                System.out.println("Amount of 100: "+n);
                change = change - n * 100;

                if(change >= 50);
                n = change / 50;
                System.out.println("Amount of 50: "+n);
                change = change - n * 50;

                if(change >= 20);
                n = change / 20;
                System.out.println("Amount of 20: "+n);
                change = change - n *20;

                if(change >= 10);
                n = change / 10;
                System.out.println("Amount of 10: "+n);
                change = change - n * 10;

                if(change >= 5);
                n = change / 5;
                System.out.println("Amount of 5: "+n);
                change = change - n * 5;

                if(change >= 1);
                n = change / 1;
                System.out.println("Amount of 1: "+n);

                System.out.println("Thanks for choosing us! Have a great day ahead!!");
            }
        }
    sc.close();
    }
}

