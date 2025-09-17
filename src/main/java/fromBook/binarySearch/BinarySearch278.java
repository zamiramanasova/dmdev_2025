package fromBook.binarySearch;

public class BinarySearch278 {
    // Эмулируем плохую версию (например, версия 4 и далее плохие)
    static int firstBad = 4;

    // Функция проверки, плохая ли версия
    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }
    public static void main(String[] args) {
        int n = 10; // всего версий
        int result = firstBadVersion(n);
        System.out.println("First bad version is: " + result);
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
