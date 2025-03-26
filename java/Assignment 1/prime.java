public class prime{
 public static void main(String[] args){
if (args.length==0){
 System.out.println("Enter a number as a command line argument: ");
return;
}
int num=
Integer.parseInt(args[0]);
if (isPrime(num)){
System.out.println(num+"is a prime number.");
}else{
Sytem.out.println(num+"is not a prime number");
}
}

public static boolean isPrime(int n){
if(n<=1)return false;
for(int i=2;i<n;i++){
if (n%i ==0)return false;
}g
return true;
}
}
