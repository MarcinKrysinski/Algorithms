package binarySearchAlgorithm;


public class Algorithm {

    public static int binarySearch(int[] list, int item){
        int low = 0;
        int high = list.length - 1;


        while (low <= high) {
            int mid = (low + high)/2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }else if (guess < item) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
