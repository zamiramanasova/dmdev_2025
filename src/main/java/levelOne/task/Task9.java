package levelOne.task;

/**
 * В 1626 году индейцы продали Манхэттен за 24 доллара
 * Написать программу которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы положили
 * деньги в банк под 5% годовых
 */
public class Task9 {
    public static void main(String[] args) {
        double sourceSum = 24;
        double result = sum(sourceSum);
        System.out.println(result);

    }

    public static double sum(double sourceSum) {
        double result = sourceSum;
        //год когда мы начнем получать проценты, условие год конечный, итерация
        for (int year = 1627; year <= 2020; year++) {
            //годовой процент
            double percent = result * 0.05;
            // записываем в наш резалт проценты
            result += percent;
            System.out.println(year + " : " + result);
        }
        return result;
    }
}
