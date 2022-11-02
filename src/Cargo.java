public class Cargo extends Car implements Competing {

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
}
