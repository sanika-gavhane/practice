//Print a multiplication table for numbers 1 to 5.

import java.util.*;
class Table1To5App
{
	public static void main(String x[])
	{
		Scanner obj=new Scanner(System.in);
		int no=1;
		
		while(no<=5)
		{
		for(int i=1;i<=10 ;i++)
		{
			int n=no*i;
			System.out.println(n);
			
			
		}
		
		no++;
		}
	}
}