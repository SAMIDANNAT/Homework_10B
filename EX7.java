import java.util.Scanner;
public class EX7
{
private static Scanner c;

public static void main(String[] args) {
c = new Scanner(System.in);
int n;
n=c.nextInt();
int s1=0; int p1=1;
for (int i=1; i<=n ; i++) {
s1=s1+(2*i-1);
p1=p1*(2*i-1);
}
 System.out.println("s1="+s1+ " , p1="+p1);
 int m;
 m=c.nextInt();
 int i=1; int s2=0; int p2=1;
 while (i<=m) {
 s2=s2+(2*i);
 p2=p2*(2*i);
 i++;
 }
 System.out.println("s2="+s2+ " , p2="+p2);
int o;
o=c.nextInt();
int s3=0; int p3=1;
for (int a=1; a<=o ; a++) {
s3=s3+(3*a);
p3=p3*(3*a);
}
 System.out.println("s3="+s3+ " , p3="+p3);
int p;
 p=c.nextInt();
 int b=1; int s4=0; int p4=1;
 while (b<=p) {
 s4=s4+(4*b);
 p4=p4*(4*b);
 b++;
 }
 System.out.println("s4="+s4+ " , p4="+p4);
}
 }