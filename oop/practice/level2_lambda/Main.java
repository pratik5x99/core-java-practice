package oop.practice.level2_lambda;

public class Main {
    public static void main(String[] args) { // Fixed signature!

        GameEngine gameEngine = new GameEngine();

        // Passing the lambda directly into the arguments!
        gameEngine.triggerInput("SPACE", buttonId -> System.out.println("Character jumps!"));

        gameEngine.triggerInput("CLICK", buttonId -> System.out.println("Weapon Fired!"));
    }
}