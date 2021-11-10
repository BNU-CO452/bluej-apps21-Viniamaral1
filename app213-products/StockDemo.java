
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Protein Power"));
        stock.add(new Product(102, "Mass Gainer"));
        stock.add(new Product(103, "Protein Bar"));
        stock.add(new Product(104, "Dumbbell"));
        stock.add(new Product(105, "Ketllebell"));
        stock.add(new Product(106, "Exercise Rubber Band"));
        stock.add(new Product(107, "Barbell"));
        stock.add(new Product(108, "Vegan Protein"));
        stock.add(new Product(109, "Vitamins"));
        stock.add(new Product(110, "Gloves"));
        
             
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProducts();
    }

    private void sellProducts()
    {
    }    
}