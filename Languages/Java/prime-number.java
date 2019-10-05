public class Prime {
    public static void main(String[] args) {
       	Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        for(int i = 2; i <= n/2; i++)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                System.out.println(num + " is a prime number.");
                return;
            }
        }
         System.out.println(num + " is not a prime number.");
    
     }
}
