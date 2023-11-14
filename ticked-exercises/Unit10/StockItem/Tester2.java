/**
 * Tester2
 */
public class Tester2 {

    public static void main(String[] args) {
        StockItem bakedBeans = new StockItem("Baked beans 415g", 65);

        StockItem eggs = new StockItem("Eggs (box of 6)", 175);

        StockItem bread = new StockItem("Bread", 89);

        bread.changePrice(10);
        bakedBeans.doDelivery(10);

        eggs.doSale(10);

        bread.printReport();
        bakedBeans.printReport();
        eggs.printReport();

    }
}
