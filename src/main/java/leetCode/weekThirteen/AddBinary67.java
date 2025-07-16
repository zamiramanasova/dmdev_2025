package leetCode.weekThirteen;

/**
 * Учитывая две двоичные строки a и b,
 * верните их сумму в виде двоичной строки.
 * Input: a = "11", b = "1"
 * Output: "100"
 */
public class AddBinary67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));

    }
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        //пока есть цифры в а и b, или есть перенос
        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.append(sum % 2);// последняя цифра суммы 0 или 1
            carry = sum / 2;//перенос на след. разряд

            i--;
            j--;
        }

        return  result.reverse().toString();
    }
    //Как работает
    //✅ 1️⃣ Мы идём справа налево по строкам a и b.
    //✅ 2️⃣ Складываем цифры и перенос (carry).
    //✅ 3️⃣ В результат записываем только остаток по модулю 2 (sum % 2).
    //✅ 4️⃣ Перенос запоминаем для следующего шага (sum / 2).
    //✅ 5️⃣ В конце переворачиваем результат.
    //Пример работы
    //a = "11", b = "1"
    //
    //i = 1, j = 0
    //
    //1 + 1 + 0 = 2 → append 0, carry = 1
    //
    //i = 0, j = -1
    //
    //1 + 0 + 1 = 2 → append 0, carry = 1
    //
    //i = -1, j = -1
    //
    //0 + 0 + 1 = 1 → append 1
    //
    //result = "001" → reverse → "100"
    //
    //✅ ответ: "100"
}
