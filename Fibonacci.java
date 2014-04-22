import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        int a=1,b=0,c=1,d,e,f=0,i;
        
        Scanner cin = new Scanner(System.in);
        System.out.println("Masukan angka: ");
        i= cin.nextInt();
        for(int x=0;x<i;x++){
            f=f+a;
            a= b + c;
            d=c;
            b=d;
            e=a;
            c=e;
        }
        System.out.println(f);
    }
}

