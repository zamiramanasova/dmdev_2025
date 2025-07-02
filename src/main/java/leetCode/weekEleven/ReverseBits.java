package leetCode.weekEleven;

/**
 * «Дано число (целое 32-битное). Нужно развернуть все его
 * биты (перевернуть порядок битов).
 * Вернуть полученное число.»
 */
public class ReverseBits {
    public static void main(String[] args) {
        int a = 294967293;
        System.out.println(reverseBits(a));

    }
    public static int reverseBits(int n) {
        // Делает строку длиной ровно 32 символа.
        //Формат %32s означает:
        //«Сделай ширину ровно 32, выравни вправо.»
        //Integer.toBinaryString(n) → двоичная строка без ведущих нулей
        //⭐ String.format("%32s", ...) → дополняет её слева пробелами до длины 32
        //⭐ .replace(' ', '0') → меняет пробелы на нули
       String bits = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');;
       char[] charBits = bits.toCharArray();
       char[] newCharBits = new char[charBits.length];

        for (int i = 0; i < charBits.length; i++) {
            newCharBits[i] = charBits[charBits.length - 1 - i];
        }

       String newBits = String.valueOf(newCharBits);

        return Integer.parseUnsignedInt(newBits, 2);

    }
}
