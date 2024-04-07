import java.util.Scanner;

public class Exercise5_2 {

    public static void main(String[] args) {
        System.out.print("Enter first integer: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        int sum =num1+num2;
        int greatest=0;
        for(int i=2;i<=sum;i++)
        { 
             if(num1%i==0 && num2%i==0)
            {
                greatest = i;
            }
        }
         System.out.printf("The greatest common divisor for %d and %d is %d",num1,num2,greatest);
        }
        
    }
    

