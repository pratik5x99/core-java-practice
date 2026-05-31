package oop.mastery.memory.question1;

public class Main {
    public static void simulateUpdate(String token,StringBuffer log){
        token = "new String";
        log.append("new word");
    }
    public static void main(String[] args) {
        String token = "String";
        StringBuffer log = new StringBuffer("log");
        System.out.println("Befor update token-> "+token+" log-> "+log);
        simulateUpdate(token,log);
        System.out.println("After update token-> "+token+" log-> "+log);
        // Strings are immutable whereas if we want to edit a string we use string buffer.
    }
}
