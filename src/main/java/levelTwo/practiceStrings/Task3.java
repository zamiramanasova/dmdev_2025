package levelTwo.practiceStrings;

/**
 * Написать функцию, принимающую в качестве параметров имя,
 * фамилию и отчество и возвращающую инициалы в формате Ф.И.О
 * Учесть что входные параметры могут быть в нижнем регистре,
 * а результирующая строка должна быть в верхнем
 */
public class Task3 {
    public static void main(String[] args) {
        String result = format("Ivan", "Petrov", "Sidorovich");
        System.out.println(result);
    }

    public static String format(String firstName, String lastName, String patronymicName) {
        char firstNameChar = firstName.toUpperCase().charAt(0);
        char lastNameChar = lastName.toUpperCase().charAt(0);
        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);

        return firstNameChar + "." + lastNameChar + "." + patronymicNameChar;
    }
}
