public class Bicycle extends Transport{



    public Bicycle(String modelName, int wheelsCount, String modelName1, int wheelsCount1) {
        super(modelName, wheelsCount);

    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void transportService() {
        updateTyre();


    }
}
