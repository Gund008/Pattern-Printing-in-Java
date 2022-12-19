
/*
   Input: iRow=5,iCol=5
   Output:
         
    ******
*   *
*   *
*   *
*********
    *   *
    *   *
    *   *
*****   *

 */

import java.lang.*;
import java.util.*;

class Pattern
{
    public  int iRow;
    public  int jCol;

    public Pattern(int A,int B)
    {
        this.iRow=A;
        this.jCol=B;
    }
    public void dispaly()
    {
        int i=0;
        int j=0;
        for(i=1;i<=iRow*2-1;i++)
        {
            for(j=1;j<=jCol*2-1;j++)
            {
                if(i==iRow || j==jCol || i==1 && j>jCol || i<iRow && j==1 || i>iRow && j==jCol*2-1 || i==iRow*2-1 && j<jCol)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
           System.out.println("\n");
        }
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

class Program4
{
    public static void main(String srg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Please Enter the Rows:");
        int iNo1=sobj.nextInt();

        System.out.println("Please Enter the Columns:");
        int iNo2=sobj.nextInt();

        Pattern pobj=new Pattern(iNo1,iNo2);
        pobj.dispaly();

    }
}