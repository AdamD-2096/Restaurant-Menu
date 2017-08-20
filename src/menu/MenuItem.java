package menu;

public class MenuItem {
    private String title;
    private String description;
    private double price;
    private String category;
    private boolean isNew;
    private long creationDate;
    public static final long old = 1209600000;
    private int uKey = -1;

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
    protected void setCategory(String category) { this.category = category; }

    public String getDescription() { return description; }
    private void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    private void setPrice(double price) { this.price = price; }

    public boolean getNew(){ return isNew; }
    private void setNew(boolean aNew) { isNew = aNew; }

    public long getCreationDate() { return creationDate; }
    private void setCreationDate(long creationDate) { this.creationDate = creationDate; }

    private long getOld() { return old; }

    public int getuKey() { return uKey; }

    protected void setuKey(int aKey){
        if (this.uKey == -1) {
            this.uKey = aKey;
        }else{
            System.out.println("key has already been set");
        }
    }
    @Override
    public String toString(){
        String id = String.valueOf(this.uKey);
        String pr = String.valueOf(this.price);

        return "\nitem#" + id +
                "\n" + this.title +
                "\n$" + pr +
                "\n" + this.description;
    }
    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        MenuItem mI = (MenuItem) o;
        if (!mI.getTitle().equals(getTitle()) || !mI.getDescription().equals(getDescription()) || !mI.getCategory().equals(getCategory())){
            return false;
        }
        return (mI.getuKey() == getuKey() && getPrice() == mI.getPrice() && getCreationDate() == mI.getCreationDate());
    }
    @Override
    public int hashCode() {
        int hash = 67;
        hash = hash * this.uKey;
        hash = (int) (hash * this.price);
        hash = hash + this.description.length();
        hash = (int) (hash * 1000 * (this.getTitle().length() * this.getCreationDate() / this.description.length() + 13));
        hash = (hash * (hash + hash)) / (this.uKey * this.uKey + this.uKey);
        return hash;
    }
}
