import java.util.Scanner;

/*
 * Write a Java program which accept number of rows and number of columns from user and display below pattern
 * Input: iRow=4  iCol=4
 * Onput:*  *  *  #
 *       *  *  #  @
 *       *  #  @  @
 *       #  @  @  @
 */

 class Program2
 {
   public static void main(String arg[])
   {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter Number of Rows:");
        int iNo1=sobj.nextInt();

        System.out.println("Please enter Number of Columns:");
        int iNo2=sobj.nextInt();
       
        Pattern pobj=new Pattern();
        pobj.display(iNo1,iNo2);
   }
 }
 /////////////////////////////////////////////////////////////////////////////////////////////
 
 class Pattern
 {
    public void display(int iRow,int iCol)
    {
      int i=0;
      int j=0;
      
      for(i=1;i<=iRow;i++)
      {
         for(j=1;j<=iCol;j++)
         {
            if((i+j)==(iRow+1))
            {
              System.out.print("\t#");
            }
            else if((i+j)>(iCol))                 
            {
              System.out.print("\t@");
            }
            else
            {
              System.out.print("\t*");
            }
         }
         System.out.println("");
      }    
    }
 }
