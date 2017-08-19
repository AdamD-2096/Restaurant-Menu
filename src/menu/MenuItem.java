package menu;


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


    public String getTitle() { return title; }
    private void setTitle(String title) { this.title = title; }

    public String getCategory(){ return this.category; }
    private void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    private void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    private void setPrice(double price) { this.price = price; }

    private void setNew(boolean aNew) { isNew = aNew; }

    public long getCreationDate() { return creationDate; }
    private void setCreationDate(long creationDate) { this.creationDate = creationDate; }

    private long getOld() { return old; }
}
