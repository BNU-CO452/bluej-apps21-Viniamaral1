
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @Vinicius Do Amaral
 * @version 0.1
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
        
    //private StocktList stock;
    
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
    }

    public void runDemo()
    {
        //Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print(); 
        
        
        
    }
    
    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
         {
            
            return true;
        }
        else if(choice.equals("add"))
        {
            runAdd();
         
        }
        else if(choice.equals("remove"))
        {
            runRemove();
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("buy"))
        {
            runBuy();
        }
        else if(choice.equals("sell"))
        {
            runSell();
        }
        else if(choice.equals("search"))
        {
         
            String phrase = reader.getString("Please enter the name of Product");
            stock.findProducts(phrase);
        }
        else if(choice.equals("lowstock"))
        {
            runlowStock();
        }
        else if(choice.equals("restock"))
        {
            runreStock();
        }
        else
        {
           System.out.println("You have finish the process");
         }
        return false;
    }
    
      private void runreStock()
    {
       
        int amount = reader.getInt("Please inform the prodcut to be re-stocked");
        int quantity = reader.getInt("please inform the quantity to be added for the product");
        if(0 <= amount && amount <= 4 )
        {
         
            runreStock();
              stock.reStock(); 
            String name = reader.getString("Please informe the quantity to be added: ");
              System.out.println("Product has been re-stocked");
        }
         else
         {
            System.out.println("not product available");
        }
    }
    
    
    private void runlowStock()
    {
       int amount = reader.getInt("Please inform the product ID to be verified");
       int lowStock = reader.getInt ("the product is running out of stock,inform the quatity to be readded");
       if(0 <=amount && amount <=4)
        {
            runlowStock();
            
            String ID = reader.getString("Please inform if wish to re-stock the prodcut");
             
        }
        
      }
    
    
    /**
     * User inputs ID and amount, then the program sells product with given id by amount
     */
    private void runSell()
    {
        
        int id = reader.getInt("Please inform the ID`s product ");
        int amount = reader.getInt("Please enter amount of product to sell ");
        if(1 >=100)
        {
            runSell();
            String name = reader.getString("Please type the product`s name: ");
           Product product = new Product (id, name);
            stock.sellProduct(id,amount);
             
        }
        else
        {
            System.out.println("You have successfully sold the product");
        }
    }
    
    /**
     * User inputs ID and amount, then the program buys product with given id by amount
     */
    private void runBuy()
    {
        int id = reader.getInt("Please inform the ID of the product");
        int amount = reader.getInt("Please inform the quantity that you wish to buy");
        if(0 <= amount && amount <= 100)
        {
            stock.buyProduct(id,amount);
            System.out.println("You have successfully bought the product ");
        }
        
    }
    
    private void search (String phrase)
    {
       if(phrase.contains("Protein"))
         {
            
            stock.findProducts(phrase);
            System.out.println("product" + ": " +  ", " +
             "that is the search list with a specific phrase");
        }
    }
    
    /**
     * User inputs ID and name, then the program adds a product to the list with given ID and name
    */
    private void runAdd()
    {
      runAddproduct();
       int id= reader.getInt("Please inform the ID`s product ");
       Product find= stock.findProduct(id);
        if(find== null)
      {
         String name = reader.getString("Please type the product`s name: ");
        Product product = new Product (id, name);
       stock.add(product);
       System.out.println("product" + ": "+ product.getID() + ", " +
           product.getName() +  " : " + "Product added successfully");
     
       }
       else
       {
        System.out.println("ID already in use");
        
        }
     
           
        
        }  
        
     
      
    
    
    /**
     * User inputs ID , then the program removes that product from the list with given ID 
     */
    private void runRemove()
     {
           
      int id= reader.getInt(" Please inform the ID`s product ");
      Product find= stock.findProduct(id);
         if(find== null)
      {
         String name = reader.getString("Please type the product`s name: ");
        Product product = new Product (id, name);
        stock.remove(id);
        System.out.println("Product" + ": " + product.getName() + ": "  + " : " + "Product removed successfully");
     
       }
       else
       {
       System.out.println("Non existent product");
        
        }
      
      
     
    }
       
   
    
   
    
    private void runAddproduct()
    {
       
    
    }
   
    
    private void buyProducts()
    {
     
    }

    
    private void sellProducts()
    {
       
    }  
    
    private void runStock()
    {
    
    }
    
   
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:          Add a new product");
        System.out.println("    Remove:       Remove an old product");
        System.out.println("    Buy:          Buy a listed product");
        System.out.println("    Sell:         Sell a listed product");
        System.out.println("    Search:       Search a product name protein");
        System.out.println("    Lowstock:     Print products listed with low amount");
        System.out.println("    Restock:      Re-stock listed products");
        System.out.println("    Print:        Print all products");
        System.out.println("    Quit:         Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Vinicius`s application ");
        System.out.println("      ");
        System.out.println("********************************");
    }
}