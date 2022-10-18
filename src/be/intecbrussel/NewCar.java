package be.intecbrussel;

public class NewCar {
    public String typen;

    // connectie komt met een enum
    // Methode mqken
    // Deze methode oproepen in de MainKlas

    // propertie nodig
    Color color;
    Car car;
    // constructor
    public NewCar(Color color) {
        this.color = color;
    }
    public NewCar(Car car) {
        this.car = car;
    }

    // nieuwe methode voor een nieuwe auto bv paintACar()
    public void paintACarNewColor() {

        switch (color) {
            case RED:
                System.out.println("This colour red");
                break;
            case BLUE:
                System.out.println("This colour blue");
                break;
            case BLACK:
                System.out.println("This colour black");
                break;

        }

    }

    public void builtACarNewCar() {
        switch (car) {
            case MERCEDES:
                System.out.println("This car mercedes");
                break;
            case FERRARI:
                System.out.println("This car ferrari");
                break;
            case TESLA:
                System.out.println("This car tesla");
                break;
        }
    }
}
