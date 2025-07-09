package fromBook;

public class BinarySearch {
    public static void main(String[] args) {

        int[] list = new int[] {1,2,34,5};
        System.out.println(binarySearch(list, 4));
    }

    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item)
                return mid;
            if (guess > item)
                high = mid - 1;
            else
                low = mid + 1;
            return 0;
        }
        return item;
    }
}
