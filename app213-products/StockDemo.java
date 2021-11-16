
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
        stock.buyProduct(101, 2000);
        stock.buyProduct(102, 1500);
        stock.buyProduct(103, 1100);
        stock.buyProduct(104, 250);
        stock.buyProduct(105, 200);
        stock.buyProduct(106, 500);
        stock.buyProduct(107, 60);
        stock.buyProduct(108, 750);
        stock.buyProduct(109, 5000);
        stock.buyProduct(110, 450);
        
    
    }

    private void sellProducts()
    {
       stock.sellProduct(101, 1555);
       stock.sellProduct(102, 1050); 
       stock.sellProduct(103, 900); 
       stock.sellProduct(104, 50); 
       stock.sellProduct(105, 198); 
       stock.sellProduct(106, 256); 
       stock.sellProduct(107, 60); 
       stock.sellProduct(108, 630); 
       stock.sellProduct(109, 4555); 
       stock.sellProduct(110, 449); 
    }  
    
    private void removeProduct()
    {
       stock.removeProduct(110);
    }
    
   }
