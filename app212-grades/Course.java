import java.util.ArrayList;
/**
 * this class is related to grades of each module that the is been studying 
 * throughtout the term the purpose of the class is to add the module and
 * grades
 
 * @author Vinicius do Amaral
 * @version 0.1 01/oct/2021
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    
    private String code;
    private String title;
    private int credit;
    
    private Grades finalGrade;
     
    public Course()
    {
        this("BB1ARI1", "BSc Artificial Intelligence");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        this.credit=15;
        
        modules  = new ArrayList<Module>();
        
        createModules();
    }
    
    public void setCredit(int credit)
     {
      this.credit= credit;
     }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
     Module co452 = new Module ("CO452", "Programmig Concepts");
     modules.add(co452);
     
     Module co456 = new Module ("CO456", "Web Development");
     modules.add(co456); 
     
     Module co450 = new Module ("CO450", "Computer Architectures");
     modules.add(co450);
     
     Module co407 = new Module ("CO407", "Essentials Of A.I");
     modules.add(co407);
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
    /**
     * 
     */
    public Grades convertToGrade(int mark)
    {
     if(mark >= 0 && mark <=39)
         return Grades.F;
     
     else if(mark >= 40 && mark <=49)
         return Grades.D;
     
     else if(mark >= 50 && mark <= 59)
         return Grades.C;
     
     else if(mark >= 60 && mark <=69)
         return Grades.B;
     
     else if(mark >= 70 && mark <= 100)
         return Grades.A; 
     
     else 
         return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
     int total = 0;
     int finalmark =0;
     
     for(ModuleMark mark : marks)
     {
            total = total + mark.getValue();
     }
        
     finalmark = total /4;
     finalGrade = convertToGrade (finalmark);
        
     return finalGrade;
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course "+ code+ ";" +title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
        for (Module module : modules)
        {
           module.print();
                   }    
     }
}
