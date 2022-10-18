package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {

        //Color col = Color.BLACK;
        //System.out.println(col);

        // vqlues() geeft de waarde terug van de enum en stopt ze in de array.
        Color[] kleuren = Color.values();

        // ordinal() gaat de index erbij voegen bij de kleur.
        for (Color color : kleuren) {
            System.out.println(color + " the index is: " + color.ordinal());
        }
        Car car = Car.MERCEDES;
        System.out.println(car);

        // vqlues() geeft de waarde terug van de enum en stopt ze in de array.
        Car[] typen = Car.values();

        // ordinal() gaat de index erbij voegen bij de kleur.
        for (Car carName : typen) {
            System.out.println(carName + " car is: " + carName.ordinal());
        }

        NewCar nc = new NewCar(Color.BLACK);
        System.out.println(nc.color);
        nc.paintACarNewColor();
        NewCar nc1 = new NewCar(car.MERCEDES);
        System.out.println(nc.typen);
        nc.builtACarNewCar();
    }
}
