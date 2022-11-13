import java.util.ArrayList;
import java.util.Arrays;

public abstract class Car {
    public static String Categori;
    private String Brand;
    private String Model;
    private double engineCapacity;
    public static final String  CATEGORI_B = "Категория Б";
    public static final String  CATEGORI_С = "Категория С";
    public static final String  CATEGORI_D = "Категория D";
    private ArrayList<Car> Race;
    private ArrayList <Driver> drivers;
    private ArrayList<Mechanic> mechanics;
    private ArrayList<LegalSponsor> legalSponsors;
    private ArrayList <physicalSponsor> physicalSponsors;


    public ArrayList<Mechanic> getMechanics() {
        return mechanics;
    }

    public ArrayList<LegalSponsor> getLegalSponsors() {
        return legalSponsors;
    }

    public ArrayList<physicalSponsor> getPhysicalSponsors() {
        return physicalSponsors;
    }

    public Car(String brand, String model, double engineCapacity) {
        Brand = brand;
        Model = model;
        this.engineCapacity = engineCapacity;
        Race = new ArrayList<>();
        drivers = new ArrayList<>();
        mechanics = new ArrayList<>();
        legalSponsors = new ArrayList<>();
        physicalSponsors = new ArrayList<>();

        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        if (engineCapacity <= 0 )
            System.out.println("Неверное значение");

    }
    public void addDriver (Driver<?> driver){
        drivers.add(driver);

    }
    public void addMechanik (Mechanic<?>... mechanics){
        this.mechanics.addAll(Arrays.asList(mechanics));

    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void addLegal (LegalSponsor<?> legalSponsor){
        legalSponsors.add(legalSponsor);

    }
    public void addPhysics (physicalSponsor<?> physicalSponsor){
        physicalSponsors.add(physicalSponsor);

    }

    public ArrayList<Car> getRace() {
        return Race;
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
    public  boolean sto (){
        return false;
    }
    public abstract void repair();
}