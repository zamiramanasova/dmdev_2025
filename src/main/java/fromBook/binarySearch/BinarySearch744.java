package fromBook.binarySearch;

public class BinarySearch744 {
    public static void main(String[] args) {
         char[] letters = new char[] {'c', 'f', 'j'};
         char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
     }

    public static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2 ;

            if (letters[mid] <= target) {
                left = mid + 1; // ищем справа
            } else {
                right = mid - 1; // ищем слева
            }
        }

        // если вышли за пределы массива, возвращаем первую букву
        return left < letters.length ? letters[left] : letters[0];

    }
}
