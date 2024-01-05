import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int lastdigit;
        int arm=0;
        int temp=n;

        while (n>0) {
            lastdigit=n%10;
            arm=(lastdigit*lastdigit*lastdigit)+arm;
            n/=10;
        }
        if (temp==arm) {
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
