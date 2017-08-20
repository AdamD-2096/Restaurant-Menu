package menu;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    private HashMap<String, MenuItem> appetiser = new HashMap<>();
    private HashMap<String, MenuItem> breakfast = new HashMap<>();
    private HashMap<String, MenuItem> lunch = new HashMap<>();
    private HashMap<String, MenuItem> dinner = new HashMap<>();
    private HashMap<String, MenuItem> dessert = new HashMap<>();
    private String date;
    private LinkedHashMap<String ,HashMap<String, MenuItem>> menus = new LinkedHashMap<>();
    private int uKey = 0;

    public Menu(){
        updated();
        menus.put("appetiser",appetiser);
        menus.put("breakfast",breakfast);
        menus.put("lunch",lunch);
        menus.put("dinner",dinner);
        menus.put("dessert",dessert);
    }

    public HashMap<String, MenuItem> getAppetisers() { return appetiser; }
    private void setAppetisers(HashMap<String, MenuItem> appetisers) { this.appetiser = appetisers; }

    public HashMap<String, MenuItem> getBreakfast() { return breakfast; }
    private void setBreakfast(HashMap<String, MenuItem> breakfast) { this.breakfast = breakfast; }

    public HashMap<String, MenuItem> getLunch() { return lunch; }
    private void setLunch(HashMap<String, MenuItem> lunch) { this.lunch = lunch; }

    public HashMap<String, MenuItem> getDinner() { return dinner; }
    private void setDinner(HashMap<String, MenuItem> dinner) { this.dinner = dinner; }

    public HashMap<String, MenuItem> getDesserts() { return dessert; }
    private void setDesserts(HashMap<String, MenuItem> desserts) { this.dessert = desserts; }

    public String getDate() { return date; }
    private void setDate(String date) { this.date = date; }


    public void addItem(MenuItem item){
        String title = item.getTitle().concat(String.valueOf(uKey));
        if(item.getCategory().equals("appetiser")){
            appetiser.put(title, item);
        }else if(item.getCategory().equals("breakfast")){
            breakfast.put(title, item);
        }else if(item.getCategory().equals("lunch")){
            lunch.put(title, item);
        }else if(item.getCategory().equals("dinner")){
            dinner.put(title, item);
        }else if(item.getCategory().equals("dessert")){
            dessert.put(title, item);
        }else{
            System.out.println("please pick a valid category and try again");
            item.setCategory(Restaurant.getCategory());
            addItem(item);
        }
        uKey++;
        updated();
    }
    public String getMenu(){
        String fullMenu = "";

        for (Map.Entry<String, HashMap<String,MenuItem>> category : menus.entrySet()){
            fullMenu = fullMenu.concat("\n**************************\n" + category.getKey() + "\n**************************\n");
            for (Map.Entry<String, MenuItem> menu : category.getValue().entrySet()){
                MenuItem item = menu.getValue();
                item.isNew();
                fullMenu = fullMenu.concat("\n---------------------\n" + item.getTitle() + "\n$" + item.getPrice());

                if (item.getNew()){
                    fullMenu = fullMenu.concat("\nNEW!!");
                }
                fullMenu = fullMenu.concat("\n---------------------\n");
            }
        }
        return fullMenu;
    }
    public String getMenu(String aCategory){
        String catMenu = "\n**************************\n" + aCategory + "\n**************************\n";
        for (Map.Entry<String, HashMap<String,MenuItem>> category : menus.entrySet()){
            if(category.getKey().equals(aCategory)) {
                for (Map.Entry<String, MenuItem> menu : category.getValue().entrySet()) {

                    MenuItem item = menu.getValue();
                    item.isNew();
                    catMenu = catMenu.concat("\n---------------------\n" + item.getTitle() + "\n$" + item.getPrice());

                    if (item.getNew()) {
                        catMenu = catMenu.concat("\nNEW!!");
                    }
                    catMenu = catMenu.concat("\n---------------------\n");
                }
            }
        }
        return catMenu;
    }

    private void updated(){
        date = MDY.getMMDDYY();
    }
}
