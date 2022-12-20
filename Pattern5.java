/* 
Accept number of rows and number of columns from user and display below pattern.
Input :  iRow=5 ,iCol=5

Output:a  b  c  d  e
       1  2  3  4  5
       a  b  c  d  e
       1  2  3  4  5
       a  b  c  d  e
############################################################################################
 */
import java.lang.*;
import java.util.*;

/* 
Used Contents in Class:-
   #Encapsulation
   #This,super Keyword
   #Inheritance
   #Protected Access Specifier
 */

class PatternX
{
    protected  int iRow;
    protected  int jCol;

    public PatternX(int A,int B)
    {
        this.iRow=A;
        this.jCol=B;
    }
    protected void dispaly()
    {
        int i=0;
        int j=0;
        char ch='a';
     
        for(i=1;i<=iRow;i++)
        {
            for(j=1,ch='a';j<=jCol;j++)
            {
                if((i % 2)==0)
                {
                    System.out.print("\t"+j);
                }
                else
                { 
                   System.out.print("\t"+ch);
                   ch++;
                }
            }
            System.out.println();
        }  
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

class MarvellousX extends PatternX
{
    public MarvellousX(int A,int B)
    {
        super(A,B);
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

class Pattern5
{
    public static void main(String srg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Please Enter the Rows:");
        int iNo1=sobj.nextInt();

        System.out.println("Please Enter the Columns:");
        int iNo2=sobj.nextInt();

        MarvellousX pobj=new MarvellousX(iNo1,iNo2);
        pobj.dispaly();

    }
}