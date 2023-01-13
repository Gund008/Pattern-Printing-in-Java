import java.util.Scanner;

/*
 * Write a Java program which accept number of rows and number of columns from user and display below pattern
 * Input: iRow=6  iCol=6
 * Onput:*  *  *  *  *  *
 *       *  #  #  #  *  *
 *       *  #  #  *  $  *
 *       *  #  *  $  $  *
 *       *  *  $  $  $  *
 *       *  *  *  *  *  *
 */


 class Program4
 {
   public static void main(String arg[])
   {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter String:");
        int iNo1=sobj.nextInt();

        System.out.println("Please enter String:");
        int iNo2=sobj.nextInt();
       
        Pattern pobj=new Pattern();
        pobj.display(iNo1,iNo2);
   }
 }
 /////////////////////////////////////////////////////////////////////////////////////////////////

 class Pattern
 {
    public void display(int iRow,int iCol)
    {
      int i,j=0;
      
      for(i=1;i<=iRow;i++)
      {
         for(j=1;j<=iCol;j++)
         {
            if((i==1)||(i==iRow)||(j==1)||(j==iCol)||(i+j)==(iRow+1))
            {
               System.out.print("\t*");
            }
            else if((i+j)>(iCol))     //(i+j)>(icol-3)
            {
               System.out.print("\t$");
            }
            else 
            {
               System.out.print("\t#");
            }
         }
         System.out.println("");
      }    
    }
 }
