import java.util.*;

public class Calculator
{
    public static void main(String [] args)
    {
        System.out.println("____________CALCULATOR_______________");
        System.out.println("1. Addition");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Division");

        System.out.println("Make a choice from above: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        System.out.println("Enter two numbers.....");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int result;

        switch(choice)
        {
            case 1: 
                System.out.println("You have chosen addition");
                result = input1 + input2;
                System.out.println("The result is: "+ result);
                break;

            case 2: 
                System.out.println("You have chosen subtract");
                result = input1 - input2;
                System.out.println("The result is: "+ result);
                break;

            case 3: 
                System.out.println("You have chosen multiply");
                result = input1 * input2;
                System.out.println("The result is: "+ result);
                break;

            case 4: 
                System.out.println("You have chosen divide");
                result = input1 / input2;
                System.out.println("The result is: "+ result);
                break;


            default:
                System.out.println("You have chosen a wrong choice");
                break;
        }

        System.out.println("______ EXITING CALCULATOR______");
    }
}
