/* 
Accept Number of rows and number of columns  from user and Display Below Pattern
Input :iRow-3  iCol:4

Output:    *  #  *  # 
           *  #  *  #
           *  #  *  #     
*/
   
import java.lang.*;
import java.util.Scanner;

class Pattern1
{
    public static void main(String arg[])
     {
         Scanner sobj=new Scanner(System.in);
         System.out.println("Enter the Number of Rows:");
         int iValue1=sobj.nextInt();

         System.out.println("Enter the Number of Columns:");
         int iValue2=sobj.nextInt();

         Program1 pobj=new Program1(iValue1,iValue2);
         pobj.display();

     }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class Program1
{
    public int iRow;
    public int iCol;

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

    public void display()
    {
        int i=0,j=0;
        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol/2;j++)
            {
               System.out.print("*\t  #\t");
            }
            System.out.println("");
        }
    }
}

