import java.util.*;
public class Main{
    public static long fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int binomial(int n,long mod){
        if(n==0 || n==1){
            return n;
        }
    } 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        long mod=(long)Math.pow(10,9)+7;
        long top=n+m-1;
        long buttom=m;

        System.out.println(binomial(n,mod));

    }
}