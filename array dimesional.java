import java.util.Scanner;

public class Matrix2Array {
    int r, c;
    int array[];
    int matrix[][];

    public Matrix2Array() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of row : ");
        r = input.nextInt();
        System.out.print("Enter the value of column : ");
        c = input.nextInt();
        array = new int[r * c];
        matrix = new int[r][c];
    }

    public void put(int i, int j, int e) {
        array[(i) * c + j] = e;
    }

    public int get(int i, int j) {
        return array[(i) * c + j];
    }

    public void StoreMatrix() {
        for (int rr = 0; rr < r; rr++) {
            for (int cc = 0; cc < c; cc++) {
                int ee=(int) Math.round(Math.random()*89+10);
                matrix[rr][cc] =ee ;;
                put(rr, cc, ee);
            }
        }
    }

    public void PrintMatrix() {
        System.out.println("Element are Stored in "
                + "Matrix in row " + r + " Coloum " + c);
        for (int rr = 0; rr < r; rr++) {
            for (int cc = 0; cc < c; cc++) {
                System.out.print(matrix[rr][cc] + "\t ");
            }
            System.out.println();
        }
    }

    public void PrintArray() {
        System.out.println("Element converted to array &"
                + " Array length is " + array.length);
        for (int rr = 0; rr < r; rr++) {
            for (int cc = 0; cc < c; cc++) {
                System.out.print(get(rr, cc) + " ");
            }
        }
    }

    public static void main(String args[]) {
        Matrix2Array M = new Matrix2Array();
        M.StoreMatrix();
        M.PrintMatrix();
        M.PrintArray();
    }
}
