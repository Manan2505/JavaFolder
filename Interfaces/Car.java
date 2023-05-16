package Interfaces;

public class Car implements Engine,Break{

    @Override
    public void power() {
        System.out.println("power is high");
    }

    @Override
    public void start() {
        System.out.println("i am a start method");
    }

    @Override
    public void stop() {
        System.out.println("i stop the car");
    }

    @Override
    public void color() {
        System.out.println("color is grey");
    }
}
