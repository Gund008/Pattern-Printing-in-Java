/* 
Accept Number of rows and number of columns  from user and Display Below Pattern
Input :iRow-3  iCol:4

Output:  4  4  4  4  4
         3  3  3  3  3
         2  2  2  2  2
         1  1  1  1  1


*/
   
import java.lang.*;
import java.util.Scanner;

class Pattern3
{
    public static void main(String arg[])
     {
         Scanner sobj=new Scanner(System.in);
         System.out.println("Enter the Number of Rows:");
         int iValue1=sobj.nextInt();

         System.out.println("Enter the Number of Columns:");
         int iValue2=sobj.nextInt();

         Program1 pobj=new Program1();
         pobj.setter(iValue1,iValue2);
         pobj.display();

     }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class Program1
{
    private int iRow;
    private int iCol;

    public Program1()
    {
        this.iRow=0;
        this.iCol=0;
    }
    public Program1(int iRow1,int iCol1)
    {
        this.iRow=iRow1;
        this.iCol=iCol1;
    }
    public void setter(int iRow1,int iCol1) 
    {
         this.iRow=iRow1;
         this.iCol=iCol1;   
    }
   
    public void display()
    {
        int i=0,j=0;
        for(i=iRow;i>=1;i--)
        {
            for(j=1;j<=iCol;j++)
            {
               System.out.print("\t" +i);
            }
            System.out.println("");
        }
    }
}

