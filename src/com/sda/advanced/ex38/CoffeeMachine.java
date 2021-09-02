package com.sda.advanced.ex38;

public class CoffeeMachine extends Thread {

    private int waterTank;

    public CoffeeMachine() {
        this.waterTank = 10;
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (waterTank > 0) {
                    System.out.println("coffee machine is preparing coffee");
                    waterTank--;
                    System.out.println("coffee is ready");
                }else {
                    System.out.println("water tank is empty");
                    Thread.sleep(2000);

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void fillWaterTank() {
        waterTank = 10;
    }
}
