import java.util.ArrayList;

public class BubbleSort {

    public int[] bubbleSort(int[] input) throws InterruptedException {
        boolean sorted = false;
        int swapped = 0;
        int [] data = input;

        while (!sorted) {
            for (int i = 0; i < data.length - 1; i++) {
               try {
                   if (!isInOrder(data[i], data[i + 1])){

                       int temp1 = data[i];
                       int temp2 = data[i + 1];

                       data[i] = temp2;
                       data[i + 1] = temp1;

                       System.out.println("swapped " + data[i] + " with " + data[i + 1]);
                       swapped++;
                   }
               } catch (Exception e) {}
                sorted = swapped <= 0;

            }
            swapped = 0;
            // System.out.println(sorted);
        }


        return data;
    }

    private boolean isInOrder(int data1, int data2) {
        return data1 <= data2;
    }

    public int[] createRandomData(int len) {
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i] = (int) (Math.random() * 1000);
        }
        return temp;
    }
}