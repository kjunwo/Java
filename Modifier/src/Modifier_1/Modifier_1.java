package Modifier_1;

import Modifier_1.pack1.A;
import Modifier_1.pack1.B;
import Modifier_1.pack2.C;
import Modifier_1.pack2.D;

public class Modifier_1 {
    public static void main(String[] args) {
        A a = new A();
        a.print(); // 1 2 3 4
        B b = new B();
        b.print(); // 1 2 3
        C c = new C();
        c.print(); // 1
        D d = new D();
        d.print(); // 1 2
    }
}
