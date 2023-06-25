package week1.day1;

public class Primenumber 
{
	public static void main(String[] args) {
		int n=13;
		boolean prime=true;
		for(int i=2;i<n;i++)
			{if(n%i==0)
				
			{
				prime=false;
			}
			}
				System.out.println(prime);
			}
}