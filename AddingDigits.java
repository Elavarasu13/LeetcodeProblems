package Leetcode_Problems;

public class AddingDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num  = 1;
		int result = addDigits(num);
		System.out.println("count is" + result);
	}
	
	
	public static int addDigits(int num)
	{   
		int sum = 0;
		int count  = 0;
		while(num > 9) 
		{
	    	int a =  num % 10;
	     	int b =  num /10;
		    sum = a+b;		
	    	System.out.println(sum);
		count = count + 1;
		num = sum;
		}
		if(num < 9)
		{
			count = num;
		}
		return count;
	}

}
