public class Driver <T extends PassengerCars & Cargo & Bus> implements  iCanDrive   {
    private String fio;
    private String availabilityOfRights;
    private double experience;

    public Driver(String fio, String availabilityOfRights, double experience) {
        this.fio = fio;
        this.availabilityOfRights = availabilityOfRights;
        this.experience = experience;
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

    @Override
    public void startMoving() {
        System.out.println(" Я начинаю движение");

    }

    @Override
    public void stop() {
        System.out.println( " Я остановился");

    }

    @Override
    public void refuel() {
        System.out.println(" Я заправляюсь ");

    }
}
