import java.util.Scanner;

public class Operations
{

    public double addition(double num1, double num2)
    {
        double answer = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + answer);
        return answer;
    }

    public double subtraction(double num1, double num2)
    {
        double answer = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + answer);
        return answer;
    }

    public double multiplication(double num1, double num2)
    {
        double answer = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + answer);
        return answer;
    }

    public double division(double num1, double num2)
    {
        //to check if num2 is zero, and print "not a number if it is"
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            return Double.NaN;
        }

        double answer = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + answer);
        return answer;
    }

}
