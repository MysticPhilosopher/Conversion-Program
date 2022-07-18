import java.util.*;
public class ConversionProgram 
{
    public static void main(String[] args) throws Exception 
    {
        //Declaring two variables with the data type --> int 

        int input;
        int meters;
        try (//Creating the scanner object to take the input whenever desired in the program.
        Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter a distance in meters: ");
            meters = keyboard.nextInt();

            //Calling the menu method.
            menu();
            
            //Menu selection area.

            System.out.println("Please enter your choice as a number shown in the menu.");
            input = keyboard.nextInt();
            
            //Input validation loop.
            while(input<0 || input>4)
            {
                System.out.println("Error");
                menu();
                System.out.println("Enter a valid number from the menu above: ");
                input = keyboard.nextInt();
            }
        }

        // Decision structure influenced by the user input after the while loop does its job.
        if(input==1)
        {
            showKilometers(meters);
        }
        if(input==2)
        {
            showInches(meters);
        }
        if(input==3)
        {
            showFeet(meters);
        }
        else if(input==4)
        {
            System.out.println("Terminating program...");
        }
    }
    //Menu method
    public static void menu()
    {
        System.out.println("Please select an option below from the following menu:");
        System.out.println("1) Convert to kilometers \n" + "2) Convert to inches\n" + 
        "3) Convert to feet \n" +"4) Quit the program");
    }

    // Kilometer method
    public static void showKilometers(int meters)
    {
        double kilometers;
        kilometers = meters * 0.001;
        System.out.println(kilometers + "kilometers");
    }

    //Inches method
    public static void showInches(int meters)
    {
        double inches;
        inches = meters * 39.37;
        System.out.println(inches + "inches");  
    }
    
    // Feet method
    public static void showFeet(int meters)
    {
        double feet;
        feet = meters * 3.281;
        System.out.println(feet + "feet");
    }
    

}
