
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
    //private LocalDate sellByDate = LocalDate.of(1999, 99, 99);
    private Date sellByDate = new Date(1999,99,99); 

    public StockItem(String description, double price) {
    }

    public StockItem(String description, double price, Date date) {

    }

    public void printReport() {
        System.out.printf("""
                        *******Stock Report**********
                Item : %s
                Price: %f
                Stock level : %d
                Sell By Date: %d
                **********************************

                        """, description, price, level, sellByDate);

    }

    public void setSellByDate(Date sellByDate) {
        this.sellByDate = sellByDate;
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
