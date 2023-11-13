
/**
 * Write a description of class MyProgram here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * MyProgram
 */
public class StockItem {

    private String description;
    private int level;
    private double price;

    public StockItem(String description, double price) {
    }

    public void printReport() {
        System.out.printf("""
                        *******Stock Report**********
                Item : %s
                Price: %f
                Stock level : %d
                **********************************

                        """, description, price, level);

    }

    public double changePrice(double price) {
        return this.price = price;
    }

    public int doDelivery(int amount) {

        return level = level + amount;

    }

    public int doSale(int amount) {

        if (level >= 1) {
            return level = level - amount;

        }
        return -1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
