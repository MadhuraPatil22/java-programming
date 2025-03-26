//Implement a Java program to merge two sorted arrays.
import java.util.*;
class merge
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of Frist array: ");
      int n1=sc.nextInt();
      System.out.println("Enter size of Frist array: ");
      int n2=sc.nextInt();
      int arr1[]=new int[n1];
      int arr2[]=new int[n2];
      int sum[]=new int[n1+n2];
     System.out.println("Enter elements of Frist array: ");
     for(int i=0;i<n1;i++)
     {
      arr1[i]=sc.nextInt();  
     }
     System.out.println("Enter elements of Secound array: ");
     for(int i=0;i<n2;i++)
     {
      arr2[i]=sc.nextInt();  
     }
     //int sum[] = new int[n1 + n2];
        for(int i=0;i<n1;i++) {
            sum[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            sum[n1+i] = arr2[i];
        }
    Arrays.sort(sum);
    System.out.println("merged  array: ");
    for(int i=0;i<=sum.length;i++)
    {
        System.out.println(sum[i]);
    }

    }
}
