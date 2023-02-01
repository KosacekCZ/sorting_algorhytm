public class Main {
    public static void main(String[] args) throws InterruptedException {
        BubbleSort bs = new BubbleSort();

        int[] data = bs.bubbleSort(bs.createRandomData(100));
        
        for (int entry : data) {
            System.out.print(entry + ", ");
        }
        System.out.println(" ");
    }

}
