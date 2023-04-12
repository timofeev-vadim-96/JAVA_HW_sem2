//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой
// итерации запишите в лог-файл.
//(через FileWriter).
package tasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task1 {

    public static int[] BubbleSorting(int [] inputArray1) {
        try (FileWriter in = new FileWriter("FileWithArrays.txt")){
            for (int i = 0; i < inputArray1.length; i++)
            {
                for (int j = 1; j < inputArray1.length - i; j++)
                {
                    if (inputArray1[j] < inputArray1[j - 1])
                    {
                        int temp = inputArray1[j];
                        inputArray1[j] = inputArray1[j - 1];
                        inputArray1[j - 1] = temp;
                    }
                }
                in.append(Arrays.toString(inputArray1) + "\n");
            }
            return inputArray1;
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
