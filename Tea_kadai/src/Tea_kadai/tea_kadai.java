package Tea_kadai;

public class tea_kadai {

    private String shopName;
    private String location;
    private String famousTea;
    private String snacks;

    // Default constructor
    public tea_kadai() {}

    // Parameterized constructor
    public tea_kadai(String shopName, String location, String famousTea, String snacks) {
        this.shopName = shopName;
        this.location = location;
        this.famousTea = famousTea;
        this.snacks = snacks;
    }

    // Getters and Setters
    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getFamousTea() {
        return famousTea;
    }
    public void setFamousTea(String famousTea) {
        this.famousTea = famousTea;
    }

    public String getSnacks() {
        return snacks;
    }
    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    // toString method
    @Override
    public String toString() {
        return "Shop Name : " + shopName 
            + " | Location : " + location 
            + " | Famous Tea : " + famousTea 
            + " | Snacks : " + snacks + "\n";
    }
}
