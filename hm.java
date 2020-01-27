import java.util.Scanner;

public class hm {
	// TODO Auto-generated method stub
    Scanner tastatura = new Scanner(System.in);
    String h ;
    
   System.out.println("Introduceti ora");
   int h1 = tastatura.nextInt();
   String m ;
   System.out.println("Introduceti minutele");
   int m1 = tastatura.nextInt();
   String t ;
   System.out.println("Afisarea timpului" +((h1+60)+m1));
}
}


