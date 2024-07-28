package DynamicPb_leetcode;

public class Tribonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n0 =0, n1 = 1, n2 =1,sum=0;
		int n =2;
		for(int i =3;i<= n;i++)
		{
		    sum = n0+n1+n2;
			n0 = n1;
			n1 = n2;
			n2 = sum;
		}
		System.out.println(sum);
		
		if(n==1 || n==2)
		{
			System.out.print(1);
		}
	}

}
