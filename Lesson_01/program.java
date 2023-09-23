public class program {
    public static void main(String[] args) {
        System.out.println("Hello");
        int a = 123;
        // a = a-- - --a;
        a = --a - a--;
        System.out.println(a);
    }
}
