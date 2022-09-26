public class Truck extends Transport{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void transportService() {
        checkEngine();
        updateTyre();
        checkTrailer();

    }
}
