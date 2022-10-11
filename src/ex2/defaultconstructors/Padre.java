package ex2.defaultconstructors;

class Padre {
    Padre() {
        System.out.println("Padre!");
    }
}

class Figlio extends Padre {
    Figlio() {
        System.out.println("Figlio!");
    }
}

class Example {
    public static void main(String[] args) {
        Figlio p = new Figlio();
    }
}
