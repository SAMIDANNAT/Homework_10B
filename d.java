import java.util.Scanner;
public class d {
	public static void main(String[] args) {
		int x, y;
		Scanner calculate=new Scanner(System.in);
		System.out.println("Introduceti nr x");
		x=calculate.nextInt();
		if (Math.abs(x)<=5){
		 y=2*x;
		}else{
		 y=x;
		}
		System.out.println("Y este egal cu " +y);
		calculate.close();
		}

}
