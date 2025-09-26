package fromBook.binarySearch;

public class KokoEatingBananas875 {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h)); // должно вывести 4
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1; //девый указатель
        int right = 0;//правый
        for (int pile : piles) right = Math.max(right, pile); //вычисление все кучи

        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;//время
            for (int pile : piles) {// проверяем, успевает ли Коко съесть все бананы за h часов
                time += (pile + mid - 1) / mid;
            }
            if (time <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
