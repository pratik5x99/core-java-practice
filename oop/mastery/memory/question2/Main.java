package oop.mastery.memory.question2;

public class Main {
    public static void main(String[] args) {
        // Static block code will be exectued only once because it belongs to the class and it will execute
        // during class loading, while constructor code will be exectued as new objects are created.
        ServerConfig s1 = new ServerConfig();
        ServerConfig s2 = new ServerConfig();

    }
}
