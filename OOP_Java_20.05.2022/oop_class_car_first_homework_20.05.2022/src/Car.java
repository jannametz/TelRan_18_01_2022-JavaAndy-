

public class Car {
    String colour;
    String model;
    int year;


    public Car(String c, String m, int y) {
        colour = c;
        model = m;
        year = y;
    }

    public void println() {
        System.out.println("Colour: " +  colour + "   " + "Model: " + model + "   " +"Year: " + year);
    }
}