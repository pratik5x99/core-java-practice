package oop.practice.level2_lambda;

public class GameEngine {
    public void triggerInput(String buttonId, InputHandler handler){
        handler.executeAction(buttonId);
    }
}
