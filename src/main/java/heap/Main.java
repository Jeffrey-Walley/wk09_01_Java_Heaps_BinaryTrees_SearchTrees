package heap;

public class Main {
    public static void main(String[] args) {

        BinaryHeap heapy = new BinaryHeap();

        int[] node = {67, 4, 92, 12, 82, 31, 19, 52, 49, 62, 80, 10, 25};

        for (int n : node) {
            heapy.heap.add(n);
        }

        System.out.println(heapy.heap);

    }
}
