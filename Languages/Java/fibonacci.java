import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	    int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
         System.out.print("First " + n + " terms: ");
     
    }
}
