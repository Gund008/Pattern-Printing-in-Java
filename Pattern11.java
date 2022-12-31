import java.util.Scanner;

/*
 * Write a Java Program which accept String from user and display  below pattern
 * Input: Hello
 * Output: H
 *         H  e
 *         H  e  l
 *         H  e  l  l
 *         H  e  l  l  o
 */

 class Program3
 {
   public static void main(String arg[])
   {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter String:");
        String iNo=sobj.nextLine();
       
        Pattern pobj=new Pattern();
        pobj.display(iNo);
   }
 }
 ////////////////////////////////////////////////////////////////////////////////////////////////

 class Pattern
 {
    public void display(String str)
    {
      int i,j=0;
      char Arr[]=str.toCharArray();

      for(i=0;i<Arr.length;i++)
      {
         for(j=0;i>=j;j++)
         {
            System.out.print("\t"+Arr[j]);
         }
         System.out.println("");
      }  
        
    }
 }

 