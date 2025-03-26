
import java.util.Scanner;

//Implement a Java program to check whether a given number is prime or not. (Take the
//number as a command-line argument.)
class checkprime{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        //boolean is_prime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.println(num+" is not prime number");
            }   
        }

  System.out.print(num+" is a prime number");   
    }
}
