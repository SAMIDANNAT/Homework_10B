import java.util.Scanner;
public class MAIN2 {
	public static void main(String[] args) {
		System.out.println("INTRODUCETI DIMENSIUNILE");
		double r, a;
		Scanner sc=new Scanner(System.in);
		r=sc.nextDouble();
		a=sc.nextDouble();
		if(r<a/2) {System.out.println("Cercul incape in patrat");
		}
		else{
		System.out.println("Cercul nu incape in patrat");
		}
		}

}
