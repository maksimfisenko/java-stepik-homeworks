package homework10.p1.p2.p3.p4;

import homework10.p1.A;
import static homework10.p1.p2.B.*;
import homework10.p1.p2.p3.C;
import homework10.p1.p2.p3.p4.p5.E;

public class D {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        E e = new E();

        System.out.println(a.helloFromA);
        System.out.println(c.helloFromC);
        System.out.println(e.helloFromE);

        System.out.println(helloFromB);
    }
}
