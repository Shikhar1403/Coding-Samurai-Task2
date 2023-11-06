import java.util.Scanner;
public class Command_line_Calculator {
    // Add Method for Addition
     static void Add(double a, double b) {
        double c = a + b;
        System.out.println ( "Addition of "+ a +" and "+b+" is : " + c );
    }
    // Sub Method for Subtraction
    static void Sub(double a, double b) {
        double c = a - b;
        System.out.println ( "Subtraction of "+ a +" and "+b+" is : " + c );
    }
    // Mul Method for Multiplication
    static void Mul(double a, double b) {
        double c = a * b;
        System.out.println ( "Multiplication of "+ a +" and "+b+" is : " + c );
    }
    // Div Method for Division
    // Div Method has Exception  (Arithmetic Exception) for "Cannot divide by zero"
    static void Div(double a, double b) throws ArithmeticException {
        double c = a / b;
        System.out.println ( "Division of "+ a +" and "+b+" is : " + c );
        if ( b == 0 ) {
            throw new ArithmeticException ( "Cannot Divide By Zero" );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        // Scanner class for user input number for Calculation
        System.out.print ( "Enter the number 1 : " );
        double num1 = sc.nextDouble ();
        System.out.print ( "Enter the number 2 : " );
        double num2 = sc.nextDouble ();
        System.out.println ( "----------------------------------------------------------------------" );
        // Choosing Operator for Calculation from user Input with the help of Scanner Class
        System.out.println ( "Enter the operator :\nType (+) for Addition\nType (-) for Subtraction\n Type (*) for Multiplication\n Type (/) for Division\n" );
        System.out.println ( "--------------------------------------------------------------------" );
        String op = sc.next ();

        switch (op) {
            case "+" -> Command_line_Calculator.Add ( num1, num2 );
            case "-" -> Command_line_Calculator.Sub ( num1, num2 );
            case "*" -> Command_line_Calculator.Mul ( num1, num2 );
            case "/" -> Command_line_Calculator.Div ( num1, num2 );
            default -> System.out.println ( "Invalid Operator !! , Kindly type a Valid Operator" );
        }
        System.out.println ( "Do you want to again perform the Calculation : ?  Yes/No" );
        // While loop helps the user for doing multiple Calculation until user send "no" input for exit the calculator
        while (true) {
            String ans = sc.nextLine ().toLowerCase ();
            if ( ans.equals ( "yes" ) ) {
                System.out.print ( "Enter the number  : " );
                num1 = sc.nextDouble ();
                System.out.print ( "Enter the number  : " );
                num2 = sc.nextDouble ();
                System.out.println ( "----------------------------------------------------------------------" );
                System.out.print ( "Enter the operator :\nType (+) for Addition\nType (-) for Subtraction\n Type (*) for Multiplication\n Type (/) for Division\n" );
                System.out.println ( "--------------------------------------------------------------------" );
                op = sc.next ();
                // Switch and Cases  has an Operator for proceeding a Calculation
                switch (op)
                {
                    // Static method defines in a cases for Calculation for multiple input numbers
                    case "+" -> Command_line_Calculator.Add ( num1, num2 );
                    case "-" -> Command_line_Calculator.Sub ( num1, num2 );
                    case "*" -> Command_line_Calculator.Mul ( num1, num2 );
                    case "/" -> Command_line_Calculator.Div ( num1, num2 );
                    default -> System.out.println ( "Invalid Operator !! , Kindly type a Valid Operator" );
                }
                System.out.println ("------------------------------------------------------------------------------------");
                System.out.println (" Do You like to perform another calculation ? : ");
                }
                 else if ( ans.equals ( "no" ) ) {
                System.out.println ("Thanks for using Calculator");
                break;
            }
        }
    }
}
