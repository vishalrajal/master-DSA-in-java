public class IndexofMin {
    public static int findMin(int [] arr) {
        int minIndex = 0;
        for(int i =1; i<arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }

        }
        return minIndex;
    }
    public static void main(String [] args) {
        int [] arr ={2,3,1,4,5};
        int result = findMin(arr);
        System.out.println("The minimum is : " +result);
    }
    
}
