package fromBook;

public class BinarySearch {
    public static void main(String[] args) {

        int[] list = new int[] {1,2,34,5};
        System.out.println(binarySearch(list, 4));
    }

    public static int binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        //пока эта часть не сократится до одного
        //элемента, проверяем средний элемент
        while (low <= high) {
            //если значение нечетно, то округляем mid в меньшую сторону
            int mid = (low + high) / 2;
            //если названное число было слишком мало, то переменная low обновляется соответственно
            int guess = list[mid];
            //если значение найдено то возращаем средний элемент
            if (guess == item)
                return mid;
            //если значение много то high = mid - 1
            if (guess > item)
                high = mid - 1;
            //иначе
            else
                low = mid + 1;
            return 0;
        }
        return item;
    }
}
