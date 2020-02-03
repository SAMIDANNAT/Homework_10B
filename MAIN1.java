import java.util.Scanner;
public class MAIN1 {
	public static void main(String[] args) {
		System.out.println("INTRODUCETI NUMERELE");
		double a, b, s=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		if(a>0) {a=Math.pow(a,2);
		}
		else{
		s=a+b;
		}
		System.out.println("a="+a+ " , s="+s);
	}
}
