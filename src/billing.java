import java.util.Scanner;
import java.util.ArrayList;
public class billing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        while(start){
            System.out.println("Do you want to start or quit?");
            String stat = sc.nextLine();

            if(stat.equalsIgnoreCase("quit")){
                start = false;
            }
            else{
                ArrayList<Integer> itemcost = new ArrayList<Integer>();

                System.out.println("Enter your ID");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your password");
                String password = sc.nextLine();

                System.out.println("Welcome to billing counter.");
                System.out.println("Enter the number of items purchased");
                int item = sc.nextInt();

                for(int i = 0; i<item; i++){
                    System.out.println("Enter the price of item");
                    int cost = sc.nextInt();
                    itemcost.add(cost);
                }
            System.out.println

            }

            }
        }
    }

