import java.util.Scanner;

/**
 * {@link Employee} class -<p>Base class having data members like {@code name}, {@code email}, {@code id} and {@code num} (phone number) with basic methods like {@link Employee#getdata} and {@link Employee#Display}. It is inherited in further <blockquote><ul><li>Child Classes -<ul><li>{@link Programmer}<li>{@link ProjectManager}</li><li>{@link teamLeader}</li><li>{@link Assistant}</ul></ul>
 */
public class Employee
{
    private
    String name;
    String email;
    int id;
    String num;

    /**
     * This method in {@link Employee} is called in it's child classes as a <code>super</code> class method to take Employee data from user and assign it to respective data members.
     * @param n - Just to mention the index no. of employee added
     */
    public
    void getdata(int n)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEmployee no. "+(n+1)+" - \n");
        System.out.print("Enter Details of Employee -\n---------------------------\nEnter Name : ");
        name = input.nextLine();
        System.out.print("\nEnter Email : ");
        email = input.nextLine();
        System.out.print("\nEnter Mobile Number : ");
        num = input.nextLine();
    }

    /**
     * This method in {@link Employee} is called in it's child classes as a <pre>super</pre> class method.
     * @param n - Just to mention the index no. of employee added
     * @param i - To decide and display type of employee
     */
    void Display(int n, int i)
    {
        System.out.print("---------------------------\nDisplaying payment slip of Employee No. "+(n+1)+" >\n\n\tName of the Employee\t\tEmail of the Employee\t\t\tDesignation\n\t-----------------------------------------------------------------------------------\n\t "+name+"\t\t\t "+email);
        // System.out.print("\nEmail of the Employee : "+email+"\n\nDesignation : ");
        switch(i)
        {
            case 1:
                System.out.print("\t\t\t\tProgrammer");
                break;
            case 2:
                System.out.print("\t\t\t\tTeam Leader");
                break;
            case 3:
                System.out.print("\t\t\t\tAssistant Project Manager");
                break;
            case 4:
                System.out.print("\t\t\t\tProject Manager");
        }
    }
}

//Add next code in class Employee in new file
import java.util.Scanner;

/**
 * {@link Employee} class -<p>Base class having data members like {@code name}, {@code email}, {@code id} and {@code num} (phone number) with basic methods like {@link Employee#getdata} and {@link Employee#Display}. It is inherited in further <blockquote><ul><li>Child Classes -<ul><li>{@link Programmer}<li>{@link ProjectManager}</li><li>{@link teamLeader}</li><li>{@link Assistant}</ul></ul>
 */
public class Employee
{
    private
    String name;
    String email;
    int id;
    String num;

    /**
     * This method in {@link Employee} is called in it's child classes as a <code>super</code> class method to take Employee data from user and assign it to respective data members.
     * @param n - Just to mention the index no. of employee added
     */
    public
    void getdata(int n)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEmployee no. "+(n+1)+" - \n");
        System.out.print("Enter Details of Employee -\n---------------------------\nEnter Name : ");
        name = input.nextLine();
        System.out.print("\nEnter Email : ");
        email = input.nextLine();
        System.out.print("\nEnter Mobile Number : ");
        num = input.nextLine();
    }

    /**
     * This method in {@link Employee} is called in it's child classes as a <pre>super</pre> class method.
     * @param n - Just to mention the index no. of employee added
     * @param i - To decide and display type of employee
     */
    void Display(int n, int i)
    {
        System.out.print("---------------------------\nDisplaying payment slip of Employee No. "+(n+1)+" >\n\n\tName of the Employee\t\tEmail of the Employee\t\t\tDesignation\n\t-----------------------------------------------------------------------------------\n\t "+name+"\t\t\t "+email);
        // System.out.print("\nEmail of the Employee : "+email+"\n\nDesignation : ");
        switch(i)
        {
            case 1:
                System.out.print("\t\t\t\tProgrammer");
                break;
            case 2:
                System.out.print("\t\t\t\tTeam Leader");
                break;
            case 3:
                System.out.print("\t\t\t\tAssistant Project Manager");
                break;
            case 4:
                System.out.print("\t\t\t\tProject Manager");
        }
    }
}
