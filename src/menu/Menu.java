package menu;

import java.util.Date;
import java.util.HashMap;

public class Menu {
    private HashMap<String, MenuItem> appetisers = new HashMap<>();
    private HashMap<String, MenuItem> breakfast = new HashMap<>();
    private HashMap<String, MenuItem> lunch = new HashMap<>();
    private HashMap<String, MenuItem> dinner = new HashMap<>();
    private HashMap<String, MenuItem> desserts = new HashMap<>();
    private String date;

    public Menu(){
        date = MDY.getMMDDYY();
    }
    public void addItem(MenuItem item){
        String title = item.getTitle();
        if(item.getCategory().equals("appetiser")){
            appetisers.put(title, item);
        }else if(item.getCategory().equals("breakfast")){
            breakfast.put(title, item);
        }else if(item.getCategory().equals("lunch")){
            lunch.put(title, item);
        }else if(item.getCategory().equals("dinner")){
            dinner.put(title, item);
        }else if(item.getCategory().equals("dessert")){
            desserts.put(title, item);
        }else{
            System.out.println("NOPE");
        }
    }
}
