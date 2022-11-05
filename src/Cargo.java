public class Cargo extends Car implements Competing, iCanDrive {

    public Cargo(String brand, String model, double engineCapacity) {
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
        System.out.println(" Пит-Стоп 1 минуту");

    }

    @Override
    public void bestLapTime() {
        System.out.println(" Лучшее время круга 10 минут");

    }

    @Override
    public void maximumSpeed() {
        System.out.println(" Максимальная скоро 150 км в час ");

    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void driver(String categori) {

    }
    public void drive(){
        System.out.println(" Я вожу машину"  + getBrand()   );

        System.out.println("Я имею права категории " + Car.CATEGORI_B);

    }
}
