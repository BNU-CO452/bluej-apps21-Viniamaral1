
/**
 * This class represents course and module.
 *
 * @author Vinicius do Amaral
 * @version 27/10/2021
 */
public class module
{
    // instance variables - replace the example below with your own
    private String code;
    
    private String title;
    
    private int credit;
   
    /**
     * Constructor for objects of class module
     */
    public module(String code, String title)
    {
        // initialise instance variables
        credit = 15;
        this.code = code;
        this.title = title;
        
    }

   
    public String getCode()
    {
                return code;
    }
    
    public String getTitle()
    {
                return title;
    }
    
    public int getCredit()
    {
                return credit;
    }
    
    public void setCredit(int credit)
    {
             this.credit = credit;
    }
    
    /**
     * Print the details of the course, the list
     * of students enrolled and the module
     */
    public void print()
    {
             
        System.out.println(" Module Code: " + code + ": " + title + " Credit"
        + credit);
        System.out.println();
    }
}
