public class duplicateNumbers {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,1,3,56,8,9,65,4,34,5,46,57,3455,345,67,56,8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
    
}
