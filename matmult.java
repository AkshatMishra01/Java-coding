import java.util.Scanner;

class matmult
{
public static void main(String[] args)
{
int m,n,p,q,sum = 0,c,d,k;

Scanner in = new Scanner (System.in);
System.out.println("Enter the number of rows and columns");
m = in.nextInt();
n = in.nextInt();

int first[][] = new int[m][n];
System.out.println("Enter the elements of the first matrix");
for (c = 0; c < m; c++)
  for (d = 0; d < n; d++)
    first[c][d] = in.nextInt();
  
System.out.println("Enter the elements of second matrix");

p = in.nextInt();
q = in.nextInt();

if(n!=p)
System.out.println("multiplication not possible");
else
{

}
}
