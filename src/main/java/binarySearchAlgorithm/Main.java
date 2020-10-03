package binarySearchAlgorithm;

public class Main {
    
    public static void main(String[] args) {
    int[] list = {1,5,8,12,13,14};
    int item = 13;
    int i = Algorithm.binarySearch(list, item);
        System.out.println(i);
    }
}
