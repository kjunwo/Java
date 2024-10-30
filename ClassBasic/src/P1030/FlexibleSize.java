package P1030;

public class FlexibleSize {
    public static void main(String[] args) {
        // #1. mathod1(int...values)
        method1(1,2);
        method1(1,2,3);
        method1();
        // #2. method2(String...values)
        method2("안녕", "방가");
        method2("땡큐", "베리", "감사");
        method2();

    }
    public static void method1(int... values) {
        for(int i=0; i<values.length;i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
    public static void method2(String... values) {
        for (int i=0; i<values.length; i++){
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
