import java.util.ArrayList;

public class PassengerCars extends Car implements Competing, iCanDrive {
    private ArrayList<Car> race;


    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);

    }

    @Override
    protected void beginMovement() {
        System.out.println( " Я начинаю движение");

    }

    @Override
    protected void completeMovement() {
        System.out.println(" Я заканчиваю движение");

    }


    @Override
    public void pitStop() {
        System.out.println(" Пит-Стоп 2 минуты");

    }

    @Override
    public void bestLapTime() {
        System.out.println(" Лучший круг за  5 минут ");

    }

    @Override
    public void maximumSpeed() {
        System.out.println(" Максимум 200 км в час");

    }
    public void startMoving() {

    }

    public void stop() {
    }

    @Override
    public void refuel() {

    }

    @Override
    public void driver(String categori) {

    }
    public boolean sto(){
        return Math.random()>0.5 ;
    }

    @Override
    public void repair() {
        System.out.println(" Машина " +getBrand() + " отремонтирована ");
    }
}
