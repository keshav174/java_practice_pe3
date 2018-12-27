package  mypackage;
import java.util.Scanner;


public class Matrix {
    int Row;
    int Col;
    int arr[][];

    public Matrix(int row, int col) {
        Row = row;
        Col = col;
        arr = new int[Row][Col];
    }

    public void get_matrix() {


        for (int i = 0; i < Row; i++) {

            for (int j = 0; j < Col; j++) {
                Scanner in = new Scanner(System.in);
                arr[i][j] = in.nextInt();
            }
        }
    }
    public void set_matrix(int A[][])
    {
        for(int i=0;i<Row;i++)
        {
            for(int j=0;j<Col;j++)
            {
               this.arr[i][j]=A[i][j];
            }
        }
    }


    public Matrix  add(Matrix  m1, Matrix m2) {
        Matrix M = new Matrix (m1.Row, m1.Col);
        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                M.arr[i][j] = m1.arr[i][j] + m2.arr[i][j];

            }
        }
        return M;
    }
    public void display()
    {
        for(int i=0;i<Row;i++)
        {
            for(int j=0;j<Col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println('\n');
        }
    }
}


