import java.util.Scanner;

public class calc
{
    public static void main(String[] args)
    {
        int num1, num2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        num1 = input.nextInt();
        System.out.println("Enter num 2: ");
        num2 = input.nextInt();

        System.out.println("Answer: " + (num1+num2));
    }
}