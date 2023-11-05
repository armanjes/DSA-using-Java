public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 7, 9, 6, 1, 2, 3};
        int item = 6; int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==item){
                count++;
                System.out.println("Item found at index: "+i);
            }
        }
        if(count == 0){
            System.out.println("Item not found.");
        }
    }
}
