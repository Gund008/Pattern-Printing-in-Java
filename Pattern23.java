import java.util.Scanner;

/*
 * Write Java Program which accept String from user and display below Pattern
 * Input: Hello
 * Output: H  #  #  #  #
 *         H  e  #  #  #
 *         H  e  l  #  #
 *         H  e  l  l  #

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
 /////////////////////////////////////////////////////////////////////////////////////////////////
 class Pattern
 {
    public void display(String str)
    {
      int i,j=0;
      char Arr[]=str.toCharArray();
      
      for(i=0;i<Arr.length-1;i++)    //Outer Loop
      {
         for(j=0;j<Arr.length;j++)  //Inner Loop
         {
           if(i>=j)
           {
             System.out.print(Arr[j]+"\t");
           }
           else
           {
             System.out.print("#\t");
           }
         }
         System.out.println(" ");
      }    
        
    }
 }

 
