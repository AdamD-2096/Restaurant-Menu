package menu;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){
        Menu fiveTrees = new Menu();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("options:\n0:quit\n1:\n2:");
            int choice = in.nextInt();

            if (choice == 0){
                break;
            }
        }
    }
}
