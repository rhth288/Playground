import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      int n;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      if(n>23)
        System.out.println("A");
      else
        System.out.println("Fail");
    }
}