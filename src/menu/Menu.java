package menu;

import java.util.HashMap;

public class Menu {
    private HashMap<String, MenuItem> appetisers = new HashMap<>();
    private HashMap<String, MenuItem> breakfast = new HashMap<>();
    private HashMap<String, MenuItem> lunch = new HashMap<>();
    private HashMap<String, MenuItem> dinner = new HashMap<>();
    private HashMap<String, MenuItem> desserts = new HashMap<>();
    private String date;

    public Menu(){ updated(); }

    public HashMap<String, MenuItem> getAppetisers() { return appetisers; }
    private void setAppetisers(HashMap<String, MenuItem> appetisers) { this.appetisers = appetisers; }

    public HashMap<String, MenuItem> getBreakfast() { return breakfast; }
    private void setBreakfast(HashMap<String, MenuItem> breakfast) { this.breakfast = breakfast; }

    public HashMap<String, MenuItem> getLunch() { return lunch; }
    private void setLunch(HashMap<String, MenuItem> lunch) { this.lunch = lunch; }

    public HashMap<String, MenuItem> getDinner() { return dinner; }
    private void setDinner(HashMap<String, MenuItem> dinner) { this.dinner = dinner; }

    public HashMap<String, MenuItem> getDesserts() { return desserts; }
    private void setDesserts(HashMap<String, MenuItem> desserts) { this.desserts = desserts; }

    public String getDate() { return date; }
    private void setDate(String date) { this.date = date; }


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
            System.out.println("please pick a valid category and try again");
        }
    }

    private void updated(){
        date = MDY.getMMDDYY();
    }
}
