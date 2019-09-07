import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s = new Scanner(System.in);
      int a=s.nextInt();
      int sum=(a%10)+(a/10);
      System.out.println(sum);
	}
}