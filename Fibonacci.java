+	import java.util.Scanner;
+	
+	public class Fibonacci {
+	    
+	    public static void main(String[] args) {
+	        int a=1,b=0,c=1,d,e,i;
+	        
+	        Scanner cin = new Scanner(System.in);
+	        System.out.println("Masukan angka: ");
+	        i= cin.nextInt();
+	        for(int x=0;x<i;x++){
+	            System.out.print(a+" ");
+	            a= b + c;
+	            d=c;
+	            b=d;
+	            e=a;
+	            c=e;
+	        }
+	        System.out.println("");
+	    }
+	}
