package Modifier_1.pack1;

public class A {
    public int a = 1;
    protected  int b = 2;
    int c = 3;
    private int d = 4;
    // 외부패키지에서 읽을 수 없는 b,c,d는 public 메서드를 통해서만 엑세스 가능
    public void print() {
        System.out.print(a + " ");
        System.out.print(b + " ");
        System.out.print(c + " ");
        System.out.print(d + " ");
        System.out.println();
    }
}
