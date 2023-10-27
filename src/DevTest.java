import java.util.Scanner;

public class DevTest {
    public static Scanner testScan = new Scanner(System.in);
    public static void main(String[] args)
    {
        String firstName = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;
        String ssn = "";

/*
        firstName = SafeInput.getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Firstname is " + firstName);
 */
        /*
        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is " + age);
         */
        /*
        salary = getDouble(testScan, "Enter your salary");
        System.out.println("You said salary is: " + salary);
         */
        /*
        favNum= getRangedInt(testScan, "Enter your fave num ", 1, 10);
        System.out.println("You said your fav num is: " + favNum);
         */

//YN test here


/*
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        ssn = getRegExString(testScan,"Enter your SSN",ssnRegEx);
        System.out.println("You said your ssn is: " + ssn);

 */

    }

    /**
     * Returns a Srting input by the user that must be at least one character
     * @param pipe the scanner to use for the input
     * @param prompt the message for the user telling them what to input
     * @return a String of at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";
        do {
            System.out.println(prompt + ": ");
            response = pipe.nextLine();

            if (response.length() > 0)
                done = true;
            else
                System.out.println("\nYou must enter at least one character\n");

        }
        while(!done);

        return response;
    }

    /**
     * gets an int val from the user with no constraints
     * @param pipe the scanner to use for the input
     * @param prompt message to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n You must enter a number. You entered" + trash);
            }
        }
        while(!done);

        return value;
    }

    /**
     * Returns an unconstrained double value
     * @param pipe scanner to use for input
     * @param prompt msg to tell user what to input
     * @return an unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        boolean done = false;
        String trash = "";
        double value = 0;

        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // clear buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n You must enter a number. You entered" + trash);
            }
        }
        while (!done);

        return value;
    }


    /**
     * gets an int val from the user with a range
     * @param pipe scanner to use for input
     * @param prompt msg to tell user what to input
     * @param low bottom value for the inclusive range
     * @param high top value for the inclusive range
     * @return a  value within the range
     */


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        boolean done = false;
        String trash = "";
       int value = 0;

        do {
            System.out.println(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine(); // clear buffer
                if (value >= low && value <= high)
                done = true;
                else
                    System.out.println("\n You must enter a value within the range [" + low + " - " + high + "]");
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n you must enter a a number. You entered " + trash);
            }
        }
        while (!done);

        return value;
    }

    /**
     * gets a double val from the user with a range
     * @param pipe scanner to use for input
     * @param prompt msg to tell user what to input
     * @param low bottom value for the inclusive range
     * @param high top value for the inclusive range
     * @return a double value within the range
     */


    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        boolean done = false;
        String trash = "";
        double value = 0;

        do {
            System.out.println(prompt + " [" + low + " - " + high + " ]");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine(); // clear buffer
                if (value >= low && value <= high)
                    done = true;
                else
                    System.out.println("\n You must enter a value within the range [" + low + " - " + high + " ]");
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\n you must enter a a number. You entered " + trash);
            }
        }
        while (!done);

        return value;
    }

    /**
     * returns a true false value for yes or no input [YN]
     * @param pipe scanner to read the input
     * @param prompt message to tell the user what to input
     * @return returns a boolean true of false
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";
        do {
            System.out.println(prompt + "[YN]: ");
            response = pipe.nextLine();

            if (response.toUpperCase().matches("[YN]"))
            {
                done = true;
                if (response.equalsIgnoreCase("Y"))
                    retVal = true;
                else
                    retVal = false;
            }
            else
                System.out.println("\nYou must enter a [y/n]!\n");


        }
        while(!done);

        return retVal;
    }

    /**
     * takes a regEx String and returns a valid match from the user
     * @param pipe scanner used for input
     * @param prompt msg to user telling them what is needed for input
     * @param regEx a String that represents a regular expression to use for the
     * @return a Sting value that matches a regular expression
     */
   public static String getRegExString(Scanner pipe, String prompt, String regEx)
   {
       boolean done = false;
       String response = "";
       do {
           System.out.println(prompt + " " + regEx + ": ");
           response = pipe.nextLine();

           if (response.matches(regEx))
               done = true;
           else
               System.out.println("\nYou must enter a string that matches the pattern" + regEx + "!\n");

       }
       while(!done);

       return response;
   }

}