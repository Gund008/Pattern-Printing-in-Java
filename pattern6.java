import java.util.Scanner;

/*
 * Write java Program which accept number of rows and number of columns from user and display belo pattern
 * Input: iRow=4  iCol=3
 * Output: *  *  *  *
 *         *  *  *  *
 *         *  *  *  *
 *         *  *  *  *
 */


 class Program1
 {
   public static void main(String arg[]) 
   {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Please Enter Number:");
      int iNo1=sobj.nextInt();
      System.out.println("Please Enter Number:");
      int iNo2=sobj.nextInt();
      
      Pattern pobj=new Pattern();
      pobj.pattern(iNo1,iNo2);

   }
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////
 class Pattern
 {
    public void pattern(int iRow,int iCol)
    {
        int i,j=0;
        char ch='A';
        for(i=1;i<=iRow;i++)
        {
           for(j=1,ch='A';j<=iCol;j++)
           {
              System.out.print("\t*");
           }
           System.out.println("");
        }

    }

 }


