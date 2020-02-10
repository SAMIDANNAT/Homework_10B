import java.util.Scanner;
public class c {
	public static void main(String[] args) {
		int x, y;
		Scanner calculate=new Scanner(System.in);
		System.out.println("Introduceti nr x");
		x=calculate.nextInt();
		if (x>=3){
		 y=x;
		}else{
		 y=x+4;
		}
		System.out.println("Y este egal cu " +y);
		calculate.close();
		}
}
