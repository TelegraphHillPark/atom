public class two {
    public static Integer[] swap(Integer a, Integer b) {
        a = a + b;
        b = a - b;
        a = a - b;

        return new Integer[]{a, b};
    }

    public static void main(String[] args) {
        Integer a = 11;
        Integer b = 44;

        System.out.println("Original a and b:");
        System.out.print("a = " + a + "  b = " + b + "\n");

        Integer[] result = swap(a, b);
        a = result[0];
        b = result[1];

        System.out.println("Swaped a and b:");
        System.out.print("a = " + a + "  b = " + b);
    }
}
