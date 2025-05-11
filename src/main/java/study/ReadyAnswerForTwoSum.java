package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Общая идея:
 * Он создаёт массив списков arrayK[], где каждый список будет
 * содержать индексы элементов с определённым значением.
 *
 * Затем ищет пары значений, сумма которых = k.
 *
 * Если такие значения существуют, он выводит все возможные
 * комбинации их индексов.
 */
public class ReadyAnswerForTwoSum {
    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,5};
        //findElementsThatSumTo(a, 5);
        System.out.println(Arrays.toString(twoSum(a, 5)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int []resultarray=new int[2];
        for (int i=0;i<nums.length-1;i++){
            for(int k=i+1;k<nums.length;k++)
            {
                if(target==nums[i]+nums[k])
                {
                    resultarray[0]=i;
                    resultarray[1]=k;
                }
            }
        }
        return resultarray;
    }

    //Метод findElementsThatSumTo принимает массив data и число k — сумму, которую мы ищем.
    public static void findElementsThatSumTo(int data[], int k) {
        //Создаётся массив списков arrayK длиной k+1.
        //Каждый индекс i в этом массиве будет хранить список индексов элементов в data, равных i.
        //Это список индексов всех элементов массива data, у которых значение = i.
        //Соответственно, arrayK[k - i] — это те, у кого значение k - i.
        List[] arrayK = new List[k + 1];

        for (int i = 0; i < arrayK.length; i++)
            // Инициализируются списки внутри arrayK.
            arrayK[i] = new ArrayList<Integer>();
        // Проходим по всем элементам data.
        //Если элемент data[i] меньше или равен k, добавляем его индекс i
        // в соответствующий список arrayK[data[i]].
        //Например, если data[i] == 3, а i == 5, то в arrayK[3] будет храниться 5.
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= k)
                arrayK[data[i]].add(i);
        }
        //Перебираем все возможные пары i и k - i, где i от 0 до k/2.
        //Проверяем: если есть элементы с значением i и с значением k-i, идём дальше.
        //Мы ищем такие пары значений a и b, чтобы:
        //a + b == k Или по-другому: b = k - a
        //Зачем цикл до arrayK.length / 2?
        //Потому что если ты уже нашла, например, i = 2 и k - i = 5 - 2 = 3,
        //то потом i = 3, k - i = 2 — это та же пара, только в обратном порядке.
        //Чтобы не получить дубликаты, перебираем только первую половину.
        for (int i = 0; i < arrayK.length / 2; i++) {
            //Что делает if (!arrayK[i].isEmpty() && !arrayK[k - i].isEmpty())?
            //Этот if проверяет:
            //Есть ли в массиве элементы со значением i
            //и одновременно есть ли элементы со значением k - i
            //Если и те, и другие есть, тогда можно составить пары их индексов и вывести.
            if (!arrayK[i].isEmpty() && !arrayK[k - i].isEmpty()) {
                //Перебираем все комбинации индексов между arrayK[i] и arrayK[k-i].
                //Выводим пары индексов, сумма значений которых равна k.
                for (Object index : arrayK[i])
                    for (Object otherIndex : arrayK[k - i])
                        System.out.println("Numbers at indeces [" + index.toString() + ", " + otherIndex.toString() + "] add up to " + k + ".");
            }
            //Допустим:
            //int[] data = {1, 2, 3, 4};
            //int k = 5;
            //Мы хотим найти пары: a + b = 5
            //Возможные пары значений:
            //(1, 4)
            //(2, 3)
            //Внутри arrayK будет:
            //arrayK[1] = [0]
            //arrayK[2] = [1]
            //arrayK[3] = [2]
            //arrayK[4] = [3]
            //Теперь в цикле:
            //Когда i = 1:
            //k - i = 4
            //arrayK[1] = [0], arrayK[4] = [3]
            //✅ оба не пусты → ищем все пары [0,3]
            //Когда i = 2:
            //k - i = 3
            //arrayK[2] = [1], arrayK[3] = [2]
            //✅ оба не пусты → пара [1,2]
            //Когда i = 3:
            //k - i = 2 — это уже повтор пары (2,3), но наоборот,
            //поэтому мы и не доходим до этого i, цикл идёт только до k / 2.
        }
    }
}
