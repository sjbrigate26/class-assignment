import java.util.*;

 public class SubArray
{
      public static void main(String args[])
      {
         int j;
        Scanner sc=new Scanner(System.in);
       System.out.println("Put size of array:");
        j=sc.nextInt();
        int arr[]=new int[j];
      System.out.println("Put elments of array:");
      
      for(int i=0;i<j;i++)
           {
                arr[i]=sc.nextInt();
            }
        

        System.out.println("Enter the value of k-");
        int k=sc.nextInt();
        

        int subArrcount=j*(j+1)/2;
        int kcount=((j-k+1)*(j-k+2))/2;
      

      System.out.println("Total number of sub arrays="+subArrcount);
      System.out.println("Available sub arrays respective of k="+kcount);


        

      }

}