import java.util.Scanner;

/*
 * Write a Java program which accept number of rows and number of columns from user and display below pattern
 * Input: iRow=5  iCol=5
 * Onput:  1  2  3  4  5
 *         1  2        5
 *         1     3     5
 *         1        4  5
 *         1  2  3  4  5
 */


 class Program5
 {
   public static void main(String arg[])
   {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter the Rows:");
        int iNo1=sobj.nextInt();

        System.out.println("Please enter the Columns:");
        int iNo2=sobj.nextInt();
       
        Pattern pobj=new Pattern();
        pobj.display(iNo1,iNo2);
   }
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////

 class Pattern
 {
    public void display(int iRow,int iCol)
    {
      int i,j=0;
      
      for(i=1;i<=iRow;i++)
      {
         for(j=1;j<=iCol;j++)
         {
            if((j==1)||(j==iCol)||(i==j)||(i==1)||(i==iRow))
            {
               System.out.print(j+"\t");
            }
            else
            {
               System.out.print(" \t");   //Space
            }
         }
         System.out.println(" ");
      }    
    }
 }
