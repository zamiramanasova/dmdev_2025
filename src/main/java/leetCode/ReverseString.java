package leetCode;

/**
 * Напишите функцию, которая переворачивает строку.
 * Входная строка задается в виде массива символов.s
 *
 * Это необходимо сделать, изменив входной массив
 * на месте с помощью дополнительной памяти.O(1)
 */
public class ReverseString {
    //используется Стринг билдер строковый изменяющийся класс в отличии от Стринга
    //етод аппеенд для представления новойстроки, который переворачивается с конца с помощью reverse/
    //далее этот реверс представляет строковое отображение с помощью метода toString из класса Object
    //потом чтобы это все написать в массив char[] преобразовываем в char через метод toCharArray
    public static void main(String[] args) {
        char[] array = new char[]{'h','e','l','l','o'};
        char[] array1 = new StringBuilder().append(array).reverse().toString().toCharArray();
        System.arraycopy(array1,0,array,0,array.length);
        System.out.println(array1);

        System.out.println(reverseString(array));

    }
    //решение Данияра
    public static char[] reverseString(char[] number) {
        char[] input = {'h', 'e', 'l', 'l', 'o'};
//        char[] input = {'o','e','l','l','h'};
//        char[] input = {'o','l','l','e','h'};
        for (int i = 0; i < input.length / 2; i++) {
            int leftIdx = i;
            int rightIdx = input.length - i - 1;
            //swap
            char temp = input[leftIdx]; //temp = 'h';
            input[leftIdx] = input[rightIdx]; //{'o','e','l','l','o'};
            input[rightIdx] = temp; //{'o','e','l','l','h'};
        }
        return input;
    }
}
