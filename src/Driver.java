public class Driver <T extends Car& iCanDrive>   {

    private String fio;
    private String availabilityOfRights;
    private double experience;


    public Driver(String fio, String availabilityOfRights, double experience) {
        this.fio = fio;
        this.availabilityOfRights = availabilityOfRights;
        this.experience = experience;

    }
    public void drive(T drive){
        System.out.println(" Я вожу машину"     );
        System.out.println("Я имею права категории " + Car.CATEGORI_B);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getAvailabilityOfRights() {
        return availabilityOfRights;
    }

    public void setAvailabilityOfRights(String availabilityOfRights) {
        this.availabilityOfRights = availabilityOfRights;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void startMoving() {
        System.out.println(" Я начинаю движение");

    }

    public void stop() {
        System.out.println( " Я остановился");

    }

    public void refuel() {
        System.out.println(" Я заправляюсь ");

    }


    public void B(T drive) {
        System.out.println(" У меня категория Б");
    }


    public void D(T drive) {
        System.out.println( " У меня категория Д");
    }


    public void С(T drive) {
        System.out.println(" У меня категория С");

    }
}
