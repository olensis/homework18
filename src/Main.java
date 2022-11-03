public class Main {
    public static void main(String[] args) {
        // Автобусы
        Bus mersedes= new Bus ("Мерседес", " 151", 4);
        Bus lada = new Bus("Лада", "112", 3);
        Bus audi = new Bus("Ауди", " АР22", 5);
        Bus kia= new Bus("Киа", " А5", 3);
        kia.printInfo();
        mersedes.printInfo();
        lada.printInfo();
        audi.printInfo();

        //Легковые
        PassengerCars lada1 = new PassengerCars( "Лада", " Гранта", 1.5);
        PassengerCars volga = new PassengerCars(" Лада", " Волга", 2);
        PassengerCars spectra = new PassengerCars("Киа", " Спектра", 2);
        PassengerCars bmw = new PassengerCars("БМВ", " i8", 3);
        volga.printInfo();
        lada1.printInfo();
        spectra.printInfo();
        bmw.printInfo();

        // Грузовые
        Cargo gazel = new Cargo("Лада", " Газель", 3.5);
        Cargo solaris = new Cargo( " Хэндай", " Солярис", 2.5);
        Cargo Hyundai = new Cargo(" Хэндай", " Спортейдж", 3);
        Cargo g5 = new Cargo(" Ауди", " g5", 2);
        gazel.printInfo();
        solaris.printInfo();
        Hyundai.printInfo();
        g5.printInfo();


        Driver<B>Bob = new Driver<>("Боб");


    }
}