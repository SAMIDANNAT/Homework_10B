import java.util.Scanner
public class problema2 {
      public static void main(String[]args) ;
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      double c=Math.sqrt(a*a+b*b);
      System.out.println("Ipotenuza este egala cu "+c);
      sc.close();
  }
}