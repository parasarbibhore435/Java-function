
import java.util.Scanner;

public class javabasics{
    public static int helloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return 3;
    }
    public static void calculate(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int a =sc.nextInt();
        System.out.print("Enter the value of b :");
        int b =sc.nextInt();
        System.out.print("sum of a + b  :");
        int sum= a+b;
        System.out.println(sum);
    }
public static int sum_sum(int a ,int b){
    int sum = a+b;
    return sum;

}
public static void swap(int a,int b){
    int temp = a;
    a=b;
    b =temp;
    System.out.println("the value of b :"+b);
    System.out.println("the value of a :"+a);
}
public static int multiply(int a, int b){
    int product = a*b;
    return product;
} 
public static int factorial(int n){
    int f =1;
    for(int i=1;i<=n; i++){
        f*=i;
    }
    return f;
}
public static int bincoff(int n, int r){
    int n_fact =factorial(n);
    int r_fact =factorial(r);
    int nmr_fact=factorial(n-r);
    int Bincoff =n_fact/(r_fact*nmr_fact);
    return Bincoff;
}
public static int overloading(int a,int b){
    return a+b;
}
public static int overloading(int a,int b,int c){
    return a+b+c;
}
public static boolean isprime(int n){
    if(n==2){
        return true;
    }
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n%i==0){
            return false;
            
        }
    }
    return true;
}
public static void isprime_range(int n ){
    for(int i=2; i<=n; i++){
        if(isprime(i));
        System.out.print(i +" ");
    }
    System.out.println();
    
}
public static void main(String args[]){
    isprime_range(15);
}
}