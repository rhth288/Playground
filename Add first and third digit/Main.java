import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int o , num;
      Scanner z = new Scanner(System.in);
      num=z.nextInt();
      o=(num%10)+(num/100);
      System.out.println(o);
	}
}