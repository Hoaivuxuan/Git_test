import java.io.*;
import java.util.*;
import java.lang.*;
// StringBuilder 
// StringTokenizer 
// Point
// ArrayList
public class test 
{

    public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t-->0)
        {
            int n = scan.nextInt();
            ArrayList <Integer> arr = new ArrayList<Integer>(n);
            for(int i=0;i<=n;i++)
            {
                arr.add(i);
            }
            // System.out.println(arr);
            for(int i=0;i<arr.size();i++)
            {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}