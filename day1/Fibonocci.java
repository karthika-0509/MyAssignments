package week1.day1;

public class Fibonocci {
	public static void main(String[] args) {
		int n=9;
		int x=0,y=1,z;
		System.out.println(x);
		System.out.println(y);
		for(int i=1;i<=n;i++)
		{
			
			z=x+y;
			
			System.out.println(z);
			
			x=y;
			y=z;
			
		}
	}

}
