import java.util.Scanner;

/*
 * Write java program which accept number of rows and number of columns from user and display below pattern.
 * Input: iRow=3    iCol=4
 * Output :1  2  3  4
 *         5  6  7  8
 *         9  10 11 12
 *  
 * */

 class Program5
 {
   public static void main(String arg[]) 
   {
      Scanner sobj=new Scanner(System.in);
      System.out.println("Please Enter the Number of Rows:");
      int iNo1=sobj.nextInt();
      System.out.println("Please Enter Number Number of Columns:");
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
        int iCnt=0;
        for(i=1;i<=iRow;i++)
        {
           for(j=1;j<=iCol;j++)
           {  
               iCnt++;
               System.out.print("\t"+iCnt);
           }
           System.out.println("");
        }
    }
 }
