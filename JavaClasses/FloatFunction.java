import java.util.*;

public class FloatFunction {

    public static double addfloat(double num1, double num2)
    {
        return num1 + num2;
    }


    public static void main(String [] args)

    {
        double n1 = 5.5;
        double n2 = 7.8 ;
        double sum = addfloat(n1,n2);
        System.out.println("Sum of two float numbers is: "+sum);
    }
    
}
