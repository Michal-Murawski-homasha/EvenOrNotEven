public class EvenOrNotEven {
    public static void main(String[] args) {
        int i = 10;
        evenOrNotEvenNumber(i);
    }

    private static void evenOrNotEvenNumber(int i) {
        if (i % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Not even");
        }
    }
}
