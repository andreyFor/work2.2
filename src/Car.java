public class Car extends Transport{
    public String modelName;
    public int wheelsCount;

    public Car(String modelName, int wheelsCount, String modelName1, int wheelsCount1) {
        super(modelName, wheelsCount);
        this.modelName = modelName1;
        this.wheelsCount = wheelsCount1;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
    }
}
