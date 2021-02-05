import java.util.Scanner;

public class inverse()
{
public static void main(String[] args)
{
  System.out.println("Inverse Progran for a matrix");
  int i,j;
  float det,temp;
  float mat[][] = new float[2][2];
  
  Scanner s1 = new Scanner(System.in);
  
  System.out.println("Enter elements of matrix row wise");
  for(i = 0;i < 2;++i)
  for(j = 0;j < 2;++j)
  mat[i][j] = s1.nextFloat();
  det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
  System.out.println("\n Determinant =" + det) ;
  
  temp = mat[][];
  mat[0][0] = mat[1][1];
  mat[1][1] = temp;
  
  mat[0][1] = -mat[0][1];
  mat[1][0] = -mat[1][0];
  
  System.out.println("Inverse of matrix is:");
  for(i=0, i<2 ,i++)
  for(j=0, j<2 ,j++)
  System.out.println((mat[i][j]/det) + "");
  System.out.println("\n");
}
}
 
