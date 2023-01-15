import java.util.Scanner;

// Input : 78956
/*
7   8   9   5   6
7   8   9   5   6
7   8   9   5   6
7   8   9   5   6
7   8   9   5   6
*/

class Pattern
{
    public static void main(String arg[])
    {
        int i=0,j=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter the Number:");
        int iNo=sobj.nextInt();

        char Arr[]=(Integer.toString(iNo)).toCharArray();

        for(i=0;i<Arr.length;i++)
        {
            for(j=0;j<Arr.length;j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println();
        }
    }
}