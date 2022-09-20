public class Truck extends Transport{

    public Truck(String modelName, int wheelsCount, String modelName1, int wheelsCount1) {
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
