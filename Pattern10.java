import java.util.Scanner;

/*
 * Write a Java Program which accept String from user and display  below pattern
 * Input: Hello
 * Output: H  e  l  l  o
 *         H  e  l  l  
 *         H  e  
 *         H  
 */

 class Program2
 {
   public static void main(String arg[])
   {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter String:");
        String str=sobj.nextLine();
       
        Pattern pobj=new Pattern();
        pobj.display(str);
   }
 }
 ////////////////////////////////////////////////////////////////////////////////////////////////////

 class Pattern
 {
    public void display(String str)
    {
      int i,j=0;
      char Arr[]=str.toCharArray();

      for(i=Arr.length-1;i>=0;i--)
      {
         for(j=0;i>=j;j++)
         {
            System.out.print("\t"+Arr[j]);
         }
         System.out.println("");
      }  
        
    }
 }

 