import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        //Creating scanner object
        Scanner in = new Scanner(System.in);
        Operations o = new Operations();

        //Declaring input variable
        double num1, num2, ans;

        System.out.println("Which operation would you like to use?\n" +
                "addition, subtraction, multiplication or division");

        //Reading user operation
        String usrOperation = in.nextLine();

        if(usrOperation.equals("addition"))
        {
            //input num1
            System.out.println("Enter your first number: ");
            num1 = in.nextDouble();

            //input num2
            System.out.println("Enter your second number: ");
            num2 = in.nextDouble();

            o.addition(num1, num2);
        }
        else if(usrOperation.equals("subtraction"))
        {
            //input num1
            System.out.println("Enter your first number: ");
            num1 = in.nextDouble();

            //input num2
            System.out.println("Enter your second number: ");
            num2 = in.nextDouble();

            o.subtraction(num1, num2);
        }
        else if(usrOperation.equals("multiplication"))
        {
            //input num1
            System.out.println("Enter your first number: ");
            num1 = in.nextDouble();

            //input num2
            System.out.println("Enter your second number: ");
            num2 = in.nextDouble();

            o.multiplication(num1, num2);
        }
        else if(usrOperation.equals("division"))
        {
            //input num1
            System.out.println("Enter your first number: ");
            num1 = in.nextDouble();

            //input num2
            System.out.println("Enter your second number: ");
            num2 = in.nextDouble();

            o.division(num1, num2);
        }
        else
        {
            System.out.println("Invalid Operation, Please choose from the following:\n" +
                    "addition, subtraction, multiplication or division");
        }

        in.close();

    }
}
