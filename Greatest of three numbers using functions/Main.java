import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s = new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      int o=s.nextInt();
      int res=got1(n , m , o);

	}
  public static int got1(int n1 , int n2 , int n3)
  {
    int mid=0;
   if(n1>n2)
   {  mid=n1;}
    else
    {mid=n2;}
        if(mid>n3)
        {
          System.out.print(mid);
        }
    else
    {
     System.out.print(n3); 
    }
    return mid;
  }
}
