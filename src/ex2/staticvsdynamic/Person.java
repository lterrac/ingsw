package ex2.staticvsdynamic;

class Person {
    void greet() { System.out.println("Arrivederci");}
}
class EasyPerson extends Person {
    void greet() { System.out.println("Ciao"); }
}
class FormalPerson extends Person {
    void greet() { System.out.println("Saluti"); }
}
class VeryFormalPerson extends FormalPerson {
    void greet() { System.out.println("Distinti saluti"); }
}

class Example {
    public static void main(String[] args) {
        Person p = new Person();
        EasyPerson ep = new EasyPerson();
        FormalPerson fp = new FormalPerson();
        VeryFormalPerson vfp =new VeryFormalPerson();
        p.greet();                         //1
//        ep = p;		          //2 errore di compilazion
        p = ep;	                   //3
        p.greet();		          //4
//        ep = fp;	                   //5
        ep.greet();		          //6 errore di compilazion
        fp.greet();                        //7
        p = new FormalPerson();            //8
        p.greet();		          //9
//        fp = p;			 //10 errore di compilazion
        vfp = (VeryFormalPerson) fp;       //11 errore a runtime
        vfp.greet();		          //12
    }
}

