

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {10, 30, 40, 20};
        int len = data.length;
        int temp;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-1-i;j++){
                if (data[j+1]>data[j]) {
                    temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
            }
        } // print sorted array outside the loop
        for(int i=0;i<len;i++){
            System.out.println(data[i]);
        }         
    }
}
