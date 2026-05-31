package oop.mastery.memory.question2;

public class ServerConfig {
    static {
        System.out.println("Loading native drivers...");
    }
    public ServerConfig(){
        System.out.println("Opening a port...");
    }
    static {
        System.out.println("New Static block...");
    }
}
