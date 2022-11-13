import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        // Автобусы
//
       Mechanic<Car> vova= new Mechanic<>("Владимир", "Петров", "Лучшая");
       LegalSponsor<Car> ph= new LegalSponsor<>("Роснефть", 200000);




       Bus mersedes= new Bus ("Мерседес", " 151", 4);
       Bus lada = new Bus("Лада", "112", 3);
       Bus audi = new Bus("Ауди", " АР22", 5);
       Bus kia= new Bus("Киа", " А5", 3);
       kia.addDriver(new Driver<>("Николаев Николай Николевич", "да", 7));
       kia.addMechanik(new Mechanic<>("Петр", "Иванов","Юниверсал"));
       kia.addLegal(new LegalSponsor<>("Бюджети компани", 10500));
       kia.addMechanik(vova);

//        kia.printInfo();
//        mersedes.printInfo();
//        lada.printInfo();
//        audi.printInfo();
//
//        //Легковые
        PassengerCars lada1 = new PassengerCars( "Лада", " Гранта", 1.5);
        PassengerCars volga = new PassengerCars(" Лада", " Волга", 2);
        PassengerCars spectra = new PassengerCars("Киа", " Спектра", 2);
        PassengerCars bmw = new PassengerCars("БМВ", " i8", 3);
        bmw.addDriver(new Driver<PassengerCars>(" Иванов Иван Иванович", "да", 10));
        bmw.addMechanik(new Mechanic<>("Николай", "Иванов", "Вагнер"));
        bmw.addPhysics(new physicalSponsor<>("Екатерина", 20000));
//        volga.printInfo();
//        lada1.printInfo();
//        spectra.printInfo();
//        bmw.printInfo();
//
//        // Грузовые
        Cargo cargo = new Cargo("Лада", " Газель", 3.5);
        Cargo cargo1 = new Cargo( " Хэндай", " Солярис", 2.5);
        Cargo Hyundai = new Cargo(" Хэндай", " Спортейдж", 3);
        Cargo g5 = new Cargo(" Ауди", " g5", 2);
        g5.addDriver(new Driver<>("Боб", "да",5));
        g5.addMechanik(new Mechanic<>("Александр", "Зотов", "Пирро"));
        g5.addLegal(new LegalSponsor<>("Владимир", 5000));

        List <Car> cars =List.of(bmw,kia, g5);
        for (Car car: cars){
            printInfo(car);
        }



//        gazel.printInfo();
//        solaris.printInfo();
//        Hyundai.printInfo();
//        g5.printInfo();
//
//






    }
    private  static void printInfo(Car car){

        System.out.println("Информация по машине "  + car.getBrand() + car.getModel()) ;
        System.out.println("Водители:");
        for (Driver<?> driver: car.getDrivers()){
            System.out.println(driver.getFio());
            System.out.println("Спонсоры:");
            for (physicalSponsor<?> physicalSponsor: car.getPhysicalSponsors()){
                System.out.println(physicalSponsor.getName() + physicalSponsor.getAmount());
                System.out.println("Спонсоры:");
                for (LegalSponsor<?> legalSponsor : car.getLegalSponsors()){
                    System.out.println(legalSponsor.getCompanyName() + legalSponsor.getAmount());
                    System.out.println("Механики :");
                    for (Mechanic<?> mechanic : car.getMechanics()){
                        System.out.println(mechanic.getName() + mechanic.getSurname() + mechanic.getCompany());
                    }
                }

        }

        }


    }

}