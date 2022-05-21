

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("black", "Mercedes", 2022);
        Car car2 = new Car("braun", "Porsche", 2022);
        Car car3 = new Car("green", "Ferrari", 2019);

        Car[] carArray = {car1, car2, car3};
        for (int i = 0; i < carArray.length; i++) {
            carArray[i].println();

        }
    }
}
