import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hii "+ name);

        //Addition of two numbers
        System.out.println("Enter numbers for addition: ");
        System.out.println("Enter first number: ");
        int a = input.nextInt();
        System.out.println("Enter second number: ");
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("sum = " + sum);

        //type casting
        int number = (int)(99.999);
        System.out.println(number);

        //convert tempC into tempF
        System.out.println("Enter temperature in c: ");
        float tempC = input.nextFloat();
        float tempF = (tempC*9/5)+32;
        System.out.println(tempF);
    }
    
}