package com.sda.advanced.ex38;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(4000);
            coffeeMachine.fillWaterTank();

        }
        coffeeMachine.stop();

    }
}
