public class trianglePyramid {
    public static void main(String[] args) {
        int n = 5; // size of pyramid

        for (int i = 0; i <=n; i++) {
            
            //for spaces
            for (int j = n-i; j >=0; j--) {
                System.out.print(" ");
            }

            //for stars
            for (int k=1;k<=i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        //To print the inverted pyramid
        for (int i = n; i >=0; i--) {
            
            //for spaces
            for (int j = n-i; j >=0; j--) {
                System.out.print(" ");
            }

            //for stars
            for (int k=i;k>0; k--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}