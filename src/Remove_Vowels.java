import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remove_Vowels {


    public static String [] remove_vowels(String [] str) {
        String []arr=new String[str.length];
        for(int i=0;i<str.length;i++)
        {
           arr[i]= str[i].replaceAll("[aeiou]", "");
          //  arr[i]=str[i];

        }
        return arr;
    }

    public static  void main(String [] args)
    {
        System.out.println("Enter no of places");
        Scanner in =new Scanner(System.in);
        int size=in.nextInt();

        String[] str=new String[size];
        for(int i=0;i<size;i++)
        str[i]=in.next();

        String [] res=remove_vowels(str);
        for(int i=0;i<res.length;i++)
            System.out.println(  "Place Name without Vowels:"+i+" "+res[i]);

    }
}
