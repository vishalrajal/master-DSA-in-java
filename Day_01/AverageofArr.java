public class AverageofArr {
    public static double AvgofArr(int[] arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        return average;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,7,3,1};
        double result = AvgofArr(arr);
        System.out.println("The Average of the array is : " +result);
    }
    
}
