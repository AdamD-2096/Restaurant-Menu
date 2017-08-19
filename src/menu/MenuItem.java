package menu;

import java.util.Date;

public class MenuItem {
    private String title;
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private long creationDate;
    public final long old = 1209600000;

    public MenuItem(String aTitle, String aDescription, double aPrice, String aCategory){
        this.title = aTitle;
        this.description = aDescription;
        this.price = aPrice;
        this.category = aCategory;
        this.creationDate = MDY.getLong();
        this.isNew();
    }
    public void isNew(){
        if (MDY.getLong() > this.creationDate + old){
            this.isNew = false;
        }else{
            this.isNew = true;
        }
    }
    public String getCategory(){
        return this.category;
    }

    public String getTitle() {
        return title;
    }
}
