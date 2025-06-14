package levelTwo.genericsPackages;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");
        list.add("String2");
        list.add("String3");

        for (String value : list) {
            System.out.println(value);
        }
        System.out.println("===");
        //или с помощью стрима
        list.iterator().forEachRemaining(System.out::println);
        System.out.println("===");
        //или вызвать метод у листа
        list.forEach(System.out::println);
    }
}
