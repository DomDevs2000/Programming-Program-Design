import java.util.ArrayList;

/**
 * Write a description of class TestStockList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestStockList {

    public static void main(String[] args) {

        StockList warehouse = new StockList();

        warehouse.addNewStockItem("Product A", 5);
        warehouse.addNewStockItem("Product B", 50);
        warehouse.addNewStockItem("Product C", 10);
        warehouse.addNewStockItem("Product D", 40);
        warehouse.addNewStockItem("Product E", 70);

        System.out.println("Number of stock items in the warehouse: " + warehouse.noOfStockItems());

        warehouse.showItem(0);

        warehouse.removeItem(1);

        warehouse.noOfStockItems();

        warehouse.updateStockLevel(0, 20);

        warehouse.showItem(0);

    }
}
