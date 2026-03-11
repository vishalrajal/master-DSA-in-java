public class MaxofArr {
    public static int findmax(int [] arr) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String [] args) {
        int [] arr = {7,2,9,4};
        int result = findmax(arr);
        System.out.println("The Maximum of array is : " + result);
    }
    
}
