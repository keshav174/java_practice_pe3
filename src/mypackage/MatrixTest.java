package mypackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
     Matrix M;
    @Before
    public void setUp() throws Exception {
        M=new Matrix(3,2);
    }

    @After
    public void tearDown() throws Exception {
        M=null;
    }

    @Test
    public void add() {
        Matrix m1=new Matrix(3,2);
        int Arr[][]={{1,2},{3,4},{5,6}};
        m1.set_matrix(Arr);

        Matrix m2=new Matrix(3,2);
        int [][] Arr1={{9,8},{7,6},{5,4}};
        m2.set_matrix(Arr1);


        Matrix m3=new Matrix(3,2);
        int Arr2[][]={{10,10},{10,10},{10,10}};
        m3.set_matrix(Arr2);

       Matrix m4=M.add(m1,m2);
       assertEquals("err",m3.arr,m4.arr);
    }
    @Test
    public void add1() {
        Matrix m1=new Matrix(3,2);
        int Arr[][]={{1,3},{3,3},{1,6}};
        m1.set_matrix(Arr);

        Matrix m2=new Matrix(3,2);
        int [][] Arr1={{9,8},{7,6},{5,4}};
        m2.set_matrix(Arr1);


        Matrix m3=new Matrix(3,2);
        int Arr2[][]={{10,11},{10,9},{6,10}};
        m3.set_matrix(Arr2);

        Matrix m4=M.add(m1,m2);
        assertEquals("err",m3.arr,m4.arr);
    }
    @Test
    public void add2() {
        Matrix m1=new Matrix(3,2);
        int Arr[][]={{1,3},{3,3},{1,6}};
        m1.set_matrix(Arr);

        Matrix m2=new Matrix(3,2);
        int [][] Arr1={{4,6},{1,0},{-1,5}};
        m2.set_matrix(Arr1);


        Matrix m3=new Matrix(3,2);
        int Arr2[][]={{5,9},{4,3},{0,11}};
        m3.set_matrix(Arr2);

        Matrix m4=M.add(m1,m2);
        assertEquals("err",m3.arr,m4.arr);
    }
}