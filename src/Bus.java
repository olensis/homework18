public class Bus extends Car implements Competing, iCanDrive {


    public Bus(String brand, String model, double engineCapacity) {
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
        System.out.println(" Пит-Стоп 3 минуты");

    }

    @Override
    public void bestLapTime() {
        System.out.println(" Лучший круг за 6 минут");

    }

    @Override
    public void maximumSpeed() {
        System.out.println(" Лучшая скорость 180 км в час");

    }
    public void startMoving() {

    }
    public void stop() {

    }

    public void refuel() {

    }
    public void driver(String categori) {

    }
}





