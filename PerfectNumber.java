package Leetcode_Problems;

public class PerfectNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n = 28;
		System.out.println(checkPerfectNumber(n));
		}
	public static boolean checkPerfectNumber(int num)
	{
		int sum = 0;
		int count = 1;
		while(num/2 >= count)
		{
			if(num % count == 0)
			{
				System.out.println("count is " + count);
				sum += count;
				System.out.println("sum is" + sum);
			}
			count = count +1;
		}
		if(sum == num)
		{
			return true;
		}
		return false;
	}
	        
}
