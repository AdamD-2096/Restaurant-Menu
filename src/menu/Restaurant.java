package menu;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args){
        Menu menu = new Menu();
        makeMenu(menu);
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
            System.out.println("options:\n0:back\n1:add another");
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
        String category;
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
        System.out.println("category: \n0: full menu\n1: by category\n2: individual item");
        int choice = in.nextInt();
        if (choice == 0) {
            menuItems = menu.getMenu();
        }else if (choice == 1){
            String category = Restaurant.getCategory();
            menuItems = menu.getMenu(category);
        }else if (choice == 2){
            System.out.println("enter the item number to view item, or 0 to go back");
            int itemNumber = in.nextInt();
            if (itemNumber == 0){
                menu2(menu);
            }else{
                menuItems = menu.getItem(itemNumber);
            }
        }
        System.out.println(menuItems);
    }
    private static void makeMenu(Menu menu){
        MenuItem item = new MenuItem("crepes","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.60,"breakfast");
        menu.addItem(item);
        item = new MenuItem("eggs and ham","warm fluffy hammy. this mouthwatering dish of joy that was cracked open and full of joy is just what your looking for.",5.50,"breakfast");
        menu.addItem(item);
        item = new MenuItem("breakfast burrito","soft warm savory. this is so mouthwatering you might drown. can be ordered with any house meat.",6.00,"breakfast");
        menu.addItem(item);
        item = new MenuItem("spinach artichoke dip","creamy and so delicious. this mouthwatering dip of heaven is just what you need before your meal.",5.50,"appetiser");
        menu.addItem(item);
        item = new MenuItem("donuts","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"appetiser");
        menu.addItem(item);
        item = new MenuItem("donuts","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"appetiser");
        menu.addItem(item);
        item = new MenuItem("sandwich","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"lunch");
        menu.addItem(item);
        item = new MenuItem("summer mac","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"lunch");
        menu.addItem(item);
        item = new MenuItem("super salad","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"lunch");
        menu.addItem(item);
        item = new MenuItem("burgers","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dinner");
        menu.addItem(item);
        item = new MenuItem("steak","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dinner");
        menu.addItem(item);
        item = new MenuItem("loaded tators","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dinner");
        menu.addItem(item);
        item = new MenuItem("best friend","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dinner");
        menu.addItem(item);
        item = new MenuItem("shake","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dessert");
        menu.addItem(item);
        item = new MenuItem("shake","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dessert");
        menu.addItem(item);
        item = new MenuItem("crepes","soft warm crisp sweet. these mouthwatering bundles of joy are just what your looking for.",5.50,"dessert");
        menu.addItem(item);
    }
}
