import java.util.Scanner;

public class primeSeries {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=0;

        for (int i = 0; i <n; i++) {
            for (int j = 2; j <i; j++) {
                if (i%j==0) {
                    temp=temp+1;
                }
            }
            if (temp==0) {
                System.out.println(i);
            }
            else{
                temp=0;
            }
        }
    }
}
