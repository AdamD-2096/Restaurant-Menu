package menu;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("options:\n0: quit\n1: add Items\n2: look at menu");
            int choice = in.nextInt();

            if (choice == 0){
                break;
            }else if(choice == 1){
                menu1(menu);
            }else if(choice == 2){
                menu2(menu);
            }
        }
    }
    private static void menu1(Menu menu){
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Title:");
            String title = in.nextLine();
            System.out.println("Description:");
            String description = in.nextLine();
            System.out.println("price:");
            double price = in.nextDouble();
            String category = getCategory();
            MenuItem item = new MenuItem(title, description, price, category);
            menu.addItem(item);
            System.out.println("options:\n0:quit\n1:add another");
            int choice = in.nextInt();
            in.nextLine();
            if (choice == 0){
                break;
            }
        } while (true);
    }

    public static String getCategory(){
        Scanner in = new Scanner(System.in);
        System.out.println("category: \n0: appetiser\n1: breakfast\n2: lunch\n3: dinner\n4: dessert");
        int cat = in.nextInt();
        String category = "";
        if (cat == 0){
            category = "appetiser";
        }else if (cat == 1){
            category = "breakfast";
        }else if (cat == 2){
            category = "lunch";
        }else if (cat == 3){
            category = "dinner";
        }else if (cat == 4){
            category = "dessert";
        }else{
            System.out.println("please pick a valid category and try again");
            category = Restaurant.getCategory();
        }
        return category;
    }
    private static void menu2(Menu menu) {
        String menuItems = "";
                Scanner in = new Scanner(System.in);
        System.out.println("category: \n0: full menu\n1: by category");
        int choice = in.nextInt();
        if (choice == 0) {
            menuItems = menu.getMenu();
        }else if (choice == 1){
            String category = Restaurant.getCategory();
            menuItems = menu.getMenu(category);
        }
        System.out.println(menuItems);
    }
}
