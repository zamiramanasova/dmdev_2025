package levelOne.task;

/**
 * Написать программу, которая проходит циклом по
 * англискому алфавиту начиная с буквы "b" и выводит каждую букву до тех пор
 * пок не встретит гласную (т.е вывести согласные на консоль)
 */
public class Task11 {
    public static void main(String[] args) {
        letters();
    }

    public static void letters() {
        //цикл начинается с 'b', крутится до тех пор пока наша
        // буква не гласная
        for (char letter = 'b'; !isVowel(letter); letter++) {
            System.out.println(letter);
        }
    }

    public static boolean isVowel(char value) {
        return value == 'a' || value == 'e'
               ||     value == 'y' || value == 'u'
               ||     value == 'i' || value == 'o';
    }
}
