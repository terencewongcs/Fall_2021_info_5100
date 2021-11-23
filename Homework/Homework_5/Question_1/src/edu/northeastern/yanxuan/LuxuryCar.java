package edu.northeastern.yanxuan;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        this.car.assemble();
        System.out.print("Adding features of Luxury Car. ");
    }
}
