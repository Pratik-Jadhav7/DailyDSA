public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 54, 2};
        System.out.println(max(arr));

    }
    static int max(int[] arr){
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
