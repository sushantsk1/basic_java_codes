public class BinarySearch {
    public static void main(String[] args) {
        int arr[]=new int[]{
            1,2,3,4,4,5,5,6,7,8,89,32
        };

        int key=89;
        int low=arr[0];
        int high=arr.length-1;
int mid=(low+high)/2;
        while (low<=high) {
            
            if (arr[mid]<key) {
                low=mid+1;
            }else if(arr[mid]==key){
                System.out.println(mid);
                break;
            }else {
            high=mid-1;
            }
            mid=(low+high)/2;
        }
    }
    
}
