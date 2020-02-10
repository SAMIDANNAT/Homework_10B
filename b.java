import java.util.Scanner;
public class b {
	public static void main(String[] args) {
		int x, y;
		Scanner calculate=new Scanner(System.in);
		System.out.println("Introduceti nr x");
		x=calculate.nextInt();
		if (x<=5){
		 y=x-3;
		}else{
		 y=x+3;
		}
		System.out.println("Y este egal cu " +y);
		calculate.close();
		}
}
