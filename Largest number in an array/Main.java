import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s = new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int idx=0;idx<=arr_size-1;idx++)
      {
        arr[idx]=s.nextInt();
      }
      int maxno;
      if(arr[0]>arr[1])
      {
       maxno=arr[0]; 
      }
      else
      {
       maxno=arr[1]; 
      }
      for(int idx=2;idx<=arr_size-1;idx++)
      {
       if(maxno<arr[idx])
       {
        maxno=arr[idx]; 
       }
       
       }
       System.out.println(maxno);
    }
}