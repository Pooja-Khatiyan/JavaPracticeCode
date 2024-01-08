package beginnersProgram;
import java.util.*;
public class SumaSeries {

	public static void main(String[] args) {
	int sum =0;
	for (int i=1; i<= 10 ; i++)
	{
		sum=sum + i;
	}
		System.out.println(sum);


// through scanner class
 Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	int sum1 =0; 
	for(int i=0; i<=n; i++)
	{
		sum1=sum1 + i;
	}
	System.out.println(sum1);
	
// WAP to print table: 
for (int i =1 ; i<11 ; i ++)
{
System.out.println(n + " * " + i + " = " + n*i);	

}
	
	
	
	
	}

}
