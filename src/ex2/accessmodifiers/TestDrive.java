package ex2.accessmodifiers;

import ex2.accessmodifiers.a.C1;
import ex2.accessmodifiers.b.C2;

public class TestDrive {
    public static void main(String[] args) {

        C1 c1;    C2 c2;  Object o;
        c1 = new C1();  /*1*/
        c1.m1();        /*2*/
        c2 = new C2();  /*3 */
//        c2.m2();        /*4 */ errore a compile time
        c1 = c2;        /*5 */
        c1.m1();        /*6 */
//        c2 = new C1();  /*7 */ errore a compile time
        o = new C1();   /*8 */
        c2 = (C2) o;    ///*9 */ runtime
        o = new C2();   /*10 */
        c1 = (C1) o;    /*11 */
        c1.m1();        /*12 */
    }
}
