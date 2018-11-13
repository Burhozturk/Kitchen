public class KitchenUtensils implements KitchenUtensilInterface
{
    private String kitchenUtenName;
    private String kitchenUtenNameColor;
    private int kitchenNamePrice;
    private String kitchenUtenType;
    private int kitchenUtenLength;

    public String getKitchenUtenName() {
        return kitchenUtenName;
    }

    public void setKitchenUtenName(String kitchenUtenName) {
        this.kitchenUtenName = kitchenUtenName;
    }

    public String getKitchenUtenNameColor() {
        return kitchenUtenNameColor;
    }

    public void setKitchenUtenNameColor(String kitchenUtenNameColor) {
        this.kitchenUtenNameColor = kitchenUtenNameColor;
    }

    public int getKitchenNamePrice() {
        return kitchenNamePrice;
    }

    public void setKitchenNamePrice(int kitchenNamePrice) {
        this.kitchenNamePrice = kitchenNamePrice;
    }

    public String getKitchenUtenType() {
        return kitchenUtenType;
    }

    public void setKitchenUtenType(String kitchenUtenType) {
        this.kitchenUtenType = kitchenUtenType;
    }

    public int getKitchenUtenLength() {
        return kitchenUtenLength;
    }

    public void setKitchenUtenLength(int kitchenUtenLength) {
        this.kitchenUtenLength = kitchenUtenLength;
    }

    public KitchenUtensils()
    {

    }
    public KitchenUtensils(String kitchenUtenNameInput)
    {
        this.kitchenUtenName=kitchenUtenNameInput;
    }

    public KitchenUtensils(String kitchenUtenNameInput,String kitchenUtenNameColorInput)
    {
        this.kitchenUtenName=kitchenUtenNameInput;
        this.kitchenUtenNameColor=kitchenUtenNameInput;

    }

    public KitchenUtensils(String kitchenUtenNameInput,String kitchenUtenNameColorInput,int kitchenNamePriceInput)
    {
        this.kitchenUtenName=kitchenUtenNameInput;
        this.kitchenUtenNameColor=kitchenUtenNameColorInput;
        this.kitchenNamePrice=kitchenNamePriceInput;
    }

    public void createKitchenUtensils()
    {
        System.out.println("Created a Kitchen Utensils ");
    }

    public void selectKitchenUtensils()
    {
        System.out.println("Selected Kitchen Utensils");
    }

    public int createNewKitchenUtensilsrice(int price)
    {
        return price;
    }

    public String createKitchenUtensilsDescription(String description)
    {
        return description;
    }

    public double createPriceForAnewKitchenUtensils(double price)
    {
        return price;
    }

    public void addPrice()
    {

    }

    public void deleteKitchenUtensils()
    {

    }


}
