import java.util.Scanner;

public class Consecutive_No {
    public static boolean isConsecutive(String str)
    {
        String [] arr=str.split(",");
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=Integer.parseInt(arr[i]);
        }
        for(int i=1;i<arr1.length;i++)
        {
            if(arr1[i]-arr1[i-1]!=1)
                return false;

        }
        return true;

    }
    public static  void main(String [] args)
    {

        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        boolean b=isConsecutive(str);
        if(b)
        {
            System.out.println(str+" are consecutive nos");
        }
        else
            System.out.println(str+" are non consecutive no");

    }
}
