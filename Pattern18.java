import java.util.*;
class Pattern
{
    public void Display(int iValue)
    {
        int iTemp1=iValue,iTemp2=iValue;
        int iDigit=0;

        while(iTemp1!=0)     //Outer Loop
        {
            while(iTemp2!=0)    //Inner Loop
            {
                iDigit=iTemp2 % 10;
                System.out.print(iDigit+"\t");
                iTemp2=iTemp2/10;
            }
            iTemp2=iValue;
            System.out.println(" ");
            iTemp1=iTemp1 / 10;
        }
        System.out.println(" ");
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////

public class Pattern18 
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please Enter Number:");
        int iNo1=sobj.nextInt();
   
        Pattern pobj=new Pattern();
        pobj.Display(iNo1);

    }
}
