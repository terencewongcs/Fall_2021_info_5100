package edu.northeastern.yanxuan;

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        this.car.assemble();
        System.out.print("Adding features of Sports Car. ");
    }
}
