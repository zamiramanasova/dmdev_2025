package leetCode.weekTwelve;

/**
 * Если заданы две строки s и t, верните значение true,
 * если они равны при вводе в пустые текстовые редакторы.
 * "#" означает символ обратного пробела.
 *
 * Обратите внимание, что после обратного пробела
 * пустой текст останется пустым.
 */
public class BackspaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s,t));

    }
    public static boolean backspaceCompare(String s, String t) {
        String finalS = build(s);
        String finalT = build(t);
        return finalS.equals(finalT);

    }

    private static String build(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                result.append(c);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }

}
