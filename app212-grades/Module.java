/**
 * Modules form part of a course and contain
 * credits that students achieve when they
 * pass the module with a mark of 40+
 *
 * @author Vinicius do Amaral
 * @version 1.0 27/10/2021
 */
public class Module
{
    // Most modules are worth 15 credits
    public static final int CREDIT = 15;
    
    private String code;
    private String title;
    private int credit;
   

    /**
     * Constructor for objects of class Module 
     * which initialises the module code and title
     */
    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        this.credit =15;
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
     return this.credit;
    }
          
    public void setCredit(int credit)
     {
      this.credit= credit;
     }
	 
	 
	 
	/**
    * Print out the credit on the current line
     * so that a mark and grade could be added
     */
    public void printCredit()
    {
        System.out.print("\t  " + CREDIT + " credits");
    }
	

  
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        //pritHeading();
        
        System.out.println(" Module Course " + code + ": " + title);
        System.out.println();
    }
}
