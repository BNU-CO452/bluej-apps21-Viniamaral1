import java.util.ArrayList;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Vinicius Do Amaral 
 * @version 09/oct/2021
 */
public class StockList
{
  // A list of the products.
  private ArrayList<Product> stock;

  /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
   * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
   /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    public void removeProduct (int productID)
    {
        removeProduct(productID);
    }
    
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        if(product != null) 
        {
            if(product.getQuantity() <= 5000)
            {
                product.increaseQuantity(amount);
                System.out.println("bought" + amount + "of" + 
                product.getName());
            }
            else
            {
                System.out.println("The product"+ product.getName() +
                                     "is  available for sale");
                
            }
            
           
           
          }
        else
        {
           System.out.println("product not found");
        }
                                           
    }
    
       
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product: stock)
        {
            if(product.getID()== productID)
                return product;
        }
                 
        return null;
    }
    
       
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID)
    {
      sellProduct(productID);
    }
    
    /**
     * I have added a quantity to test how it would show when is out of stock
     * Sell many of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 100)
            {
                product.decreaseQuantity(amount);
                System.out.println("sold" + amount + "of" + 
                product.getName());
                // printout message
            }
            else
            {
                System.out.println("The product"+ product.getName() +
                                      "is  out of stock");
                // printout message
            }
            if (product.getQuantity() <= 2)
            {
                product.increaseQuantity(amount);
                System.out.println("low storage" + amount + "of" + 
                product.getName());
            }
        }
        else
        {
            System.out.println("product not found");
        }
    }    

    public void search (String phrase)
    {
        if(phrase.contains("Protein"))
        {
            
        }
    }
    
     public void remove(int productID)
    {
        Product product = findProduct(productID);
        if(product.getQuantity() >= 10) 
        {
            System.out.println(product + " product has been removed");
            stock.remove(product);
        }
        else
        {
            System.out.println("No item with that ID exist");
        } 
    }
    
     public void reStock()
    {
        for(Product product : stock)
        {
            if(product.getQuantity() >= 10)
            {
                int id = product.getID();
                System.out.println("the product" + product.getName()+ 
                "low storage");
            }
        }
    }
        
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Vinicius's Gym warehouse List");
        System.out.println(" ====================");
        System.out.println();
    }
}