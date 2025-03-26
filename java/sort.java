
//import java.util.Scanner;

//Implement a Java program to sort a given list of 10 numbers in ascending order
class sort{
    public static void main(String[] args)
    {
      //Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      int size=5;
      arr[0]=5;
      arr[1]=8;
      arr[2]=7;
      arr[3]=2;
      arr[4]=1;
      for(int i=1;i<size;i++)
      {
        int temp=arr[i];
        int j=i-1;
        for(;j>=0;j--){
        if(arr[j]>temp)
        {
            arr[j+1]=arr[j];
        }
        else
        {
          break;
        }}

        arr[j+1]=temp;
      }
      System.out.println("Sorted array: ");
      for(int i=0;i<size;i++)
      {
        System.out.println(arr[i]);
      }

    }
}
