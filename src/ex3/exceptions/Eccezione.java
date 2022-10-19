package ex3.exceptions;

public class Eccezione {
    static void m1() throws EccPiccolo {
        System.out.println("Entro in m1");
        if (Math.random() < 0.4)
            throw new EccPiccolo("m1");
        System.out.println("Esco da m1");
    }

    static void m2() throws EccPiccolo, EccGrande {
        System.out.println("Entro in m2");
        double x = Math.random();
        if (x < 0.4)
            throw new EccPiccolo("m2");
        if (x > 0.6)
            throw new EccGrande("m2");
        System.out.println("Esco da m2");
    }

    static void m3() throws EccGrande, EccGrandeGrande {
        System.out.println("Entro in m3");
        double x = Math.random();
        if (x > 0.7)
            throw new EccGrandeGrande("m3");
        if (x > 0.6)
            throw new EccGrande("m3");
        System.out.println("Esco da m3");
    }

    static void m4() throws EccPiccolo {
        System.out.println("Entro in m4");
        m1();
        System.out.println("Esco da m4");
    }

    public static void main (String[] args) throws EccGrandeGrande {
        while (true) {
            try { m1();
                m2();
                m3();
                m4();
            } catch (EccPiccolo e) {
                System.out.println("  Piccolo: " + e);
            } catch (EccGrandeGrande e) {
                System.out.println("  GrandeGrande: " + e);
                throw new EccGrandeGrande("");
            } catch (EccGrande e) {
                System.out.println("  Grande: " + e);
            }
        }
    }
}



