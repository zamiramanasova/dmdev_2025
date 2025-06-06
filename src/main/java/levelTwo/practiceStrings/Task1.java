package levelTwo.practiceStrings;

/**
 * Заменить все грустные смайлы на веселые
 */

public class Task1 {
    public static void main(String[] args) {
        String value = "asdcf :( skf :(  efgthn :) ffbhn :) gnm :(  zxvcc";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
