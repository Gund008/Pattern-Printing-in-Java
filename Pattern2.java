/* 
Accept Number of rows and number of columns  from user and Display Below Pattern
Input :iRow-4  iCol:4

Output:   A  B   C  D 
          A  B   C  D
          A  B   C  D
          A  B   C  D   
*/
   
import java.lang.*;
import java.util.Scanner;

class Pattern2
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
        char ch='A';
        for(i=1,ch='A';i<=iRow;i++,ch++)
        {
            for(j=1,ch='A';j<=iCol;j++,ch++)
            {
               System.out.print("\t"+ch);
            }
            System.out.println("");
        }
    }
}

