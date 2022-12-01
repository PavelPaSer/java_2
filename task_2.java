// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task_2 {
    
    public static void main(String[] args) throws IOException {

        int[] numbers = {15, 12, 2, 4, 788, 73, 8, 21};
        String num_sort = Arrays.toString(numbers);
        boolean sort = false;
        int temp;
        FileWriter log = new FileWriter("data_2.txt", true);

        while(!sort) {
            sort = true;
            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    sort = false;
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    num_sort = Arrays.toString(numbers) + "\n";
                    log.write(num_sort);
                    log.flush();
                }
            }      
        }
        log.close();
    }
}