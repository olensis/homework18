
public abstract class Car implements B {
    private String Brand;
    private String Model;
    private double engineCapacity;

    public Car(String brand, String model, double engineCapacity) {
        Brand = brand;
        Model = model;
        this.engineCapacity = engineCapacity;
        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        if (engineCapacity <= 0 )
            System.out.println("Неверное значение");
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
    protected abstract void beginMovement();

    protected abstract void completeMovement();

    protected void printInfo(){
        System.out.println(" Модель " + getModel() + " Бренд " + getBrand() + " Объем двигетеля" + engineCapacity);
    }
}