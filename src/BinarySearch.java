public class BinarySearch {
    public static int binarySearc(int arr[], int item) {
        int low = 0;
        int high = arr.length -1;

        while(low<=high){
            int mid = (low+high)/2;
            int guess = arr[mid];
            if(guess==item) {
                return mid;
            }
            if (guess>item) {
                high=mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
