public class Main {
    public static void main(String[] args) {
        Car car = new Car("бмв",4);
        Truck truck = new Truck("ЗИЛ",130);
        Bicycle bicycle = new Bicycle("кама",1);
        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(bicycle);
        station.check(truck);

    }
}