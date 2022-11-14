package ex5.functional;

import java.util.function.Consumer;

public class Greet {

    public static Consumer<String> make(String greet){
        return (String name) -> {
            System.out.println(greet + " " + name);
        };
    }

    public static void main(String[] args){
        Consumer<String> hello = make("Hello");
        hello.accept("Andrea");
        Consumer<String> hi = make("Hi");
        hi.accept("Federico");
        hello.accept("Serena");
    }

}
