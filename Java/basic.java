import java.util.Scanner;
public class basic {

    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5,6,9,8,7,4,8,4,7};
        int key=3;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==3){
                System.out.println(i);
                System.out.println("found");
                break;
            }
        }

    }
}