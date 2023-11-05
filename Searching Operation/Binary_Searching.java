public class Binary_Searching{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 5, 6, 7, 8, 9};
        int s = 0; int e = arr.length-1; int count = 0;
        int item = 6;

        while (s<=e) {
            int mid = (s+e)/2;

            if(arr[mid] == item){
                count++;
                System.out.println("Item found at index: "+mid);
                break;
            }
            else if(arr[mid]<item){
                s = mid+1;
            }
            else if(arr[mid]>item){
                e = mid-1;
            }
        }
        if (count == 0) {
            System.out.println("Item not found.");
        }
    }
}