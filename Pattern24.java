import java.util.Scanner;

/*
 * Write a Java Program which accept string from user and display below pattern
 * Input:Hello
 *       H  e   l  l  o
 *       H  e   l  l  *
 *       H  e   l  *  *
 *       H  e   *  *  *
 *       H  *   *  *  *
 *       H  e   *  *  *
 *       H  e   l  *  *
 *       H  e   l  l  *
 *       H  e   l  l  O
 */

 class Program4
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
 //////////////////////////////////////////////////////////////////////////////////////////////
 
 class Pattern
 {
  public void display(String str)
  {
    int i,j=0;
    char Arr[]=str.toCharArray();

    for(i=Arr.length;i>0;i--)    //Outer Loop
    {
       for(j=0;j<Arr.length;j++)  //Inner Loop
       {
         if(i>j)
         {
           System.out.print(Arr[j]+"\t");
         }
         else
         {
           System.out.print("*\t");
         }
       }
       System.out.println(" ");
    }    
    
    for(i=1;i<Arr.length;i++)    
    {
       for(j=0;j<Arr.length;j++)  
       {
         if(i>=j)
         {
           System.out.print(Arr[j]+"\t");
         }
         else
         {
           System.out.print("*\t");
         }
       }
       System.out.println(" ");
    }    
  }
 }
            



 
