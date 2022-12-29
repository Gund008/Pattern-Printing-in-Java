import java.util.Scanner;

/*
 * Write java Program which accept number of rows and number of columns from user and display belo pattern
 * Input: iRow=3  iCol=5
 * Output: 5  4  3  2  1
 *         5  4  3  2  1
 *         5  4  3  2  1
 */

 class Program3
 {
   public static void main(String arg[]) 
   {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Please Enter the  Number of Rows:");
      int iNo1=sobj.nextInt();
      System.out.println("Please Enter the Number of Columns:");
      int iNo2=sobj.nextInt();
      
      Pattern pobj=new Pattern();
      pobj.pattern(iNo1,iNo2);

   }
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////
 class Pattern7
 {
    public void pattern(int iRow,int iCol)
    {
        int i,j=0;
        for(i=1;i<=iRow;i++)
        {
           for(j=iCol;j>=1;j--)
           {
              System.out.print("\t"+j);
           }
           System.out.println("");
        }
    }
 }
