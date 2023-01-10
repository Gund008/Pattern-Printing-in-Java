import java.util.Scanner;

/*
 * Input:4
 * Output:4
 *       
 *      1 2 3 4 
 *      5 6 7 8
 *      9 1 2 3 
 *      4 5 6 7
 * 
 */

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        int icnt=1;

        for(i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(icnt==10)
                {
                    icnt= 1;
                }
                System.out.print(icnt+"\t");
                icnt++;
            }
            System.out.println(" ");
        }
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////

public class Pattern17 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter Rows:");
        int iNo1=sobj.nextInt();

        System.out.println("Please Enter Cols:");
        int iNo2=sobj.nextInt();

        Pattern pobj=new Pattern();
        pobj.Display(iNo1, iNo2);

    }
    
}
