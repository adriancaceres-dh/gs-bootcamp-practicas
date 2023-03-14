import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Integer max = arr.get(0);
        Integer min = arr.get(0);


        for (Integer num : arr) {
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        Long totalSumMax = (long) 0;
        Long totalSumMin = (long) 0;

        try {
        for (Integer sumMax : arr) {
//            if (sumMax != min) {
                totalSumMax += sumMax;
//            }
        }
        totalSumMax = totalSumMax - min;


            for (Integer sumMin : arr) {
                //if (sumMin != max) {
                    totalSumMin += sumMin;
                //}
            }
            totalSumMin = totalSumMin - max;
        } catch (ArithmeticException e) {
            e.getMessage();
        }

        System.out.printf("%d %d", totalSumMin, totalSumMax);
    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            miniMaxSum(arr);

            bufferedReader.close();
        }
    }
}


