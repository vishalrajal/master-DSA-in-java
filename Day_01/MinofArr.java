public class MinofArr {
    public static int findmin(int[] arr) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;

    }
    public static void main(String [] args) {
        int[] arr = {7, 2,9, 4};
        int result = findmin(arr);
        System.out.println("Minimum = " + result);
    }
}