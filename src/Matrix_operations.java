import java.awt.event.MouseAdapter;
import java.util.Scanner;
import mypackage.Matrix;

public class Matrix_operations {
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of Rows");
        int rows=in.nextInt();
        System.out.println("Enetr the no of Col");
        int cols=in.nextInt();
        Matrix m1=new Matrix(rows,cols);
        Matrix m2=new Matrix(rows,cols);
        Matrix M=new Matrix(rows,cols);
        m1.get_matrix();
        m2.get_matrix();
        M=M.add(m1,m2);
        M.display();

    }

}