import java.security.PublicKey;
import java.util.Scanner;

public class StudentMarks {
    int numofStudents;
    int stugrades[];

    public void getnumofStudents()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the  no of Students");
        numofStudents=in.nextInt();
    }
    public String  getgrades()
    {
        stugrades=new int [numofStudents];
        System.out.println("Enter the grades of "+numofStudents+" students");
        for(int i=0;i<numofStudents;i++)
        {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            if(n<0||n>100) {
                System.out.println("Error input");
                break;
            }
            else
            {
                stugrades[i]=n;
            }
        }
        return "correct";
    }
    public static void main(String [] args)
    {
        StudentMarks obj=new StudentMarks();
        obj.getnumofStudents();
        String str=obj.getgrades();

    }
}
