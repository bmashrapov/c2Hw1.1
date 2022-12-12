import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "жёлтый", "Россия");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", "Германия");
        Car BMW = new Car("BMW", "Z8", 3.0, "черный", "Германия");
        Car kia = new Car("Kia", "Spotrage 4-го поколения", 2.4, "красный", "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", "Южная Корея");
        lada.printCar();
        audi.printCar();
        BMW.printCar();
        kia.printCar();
        hyundai.printCar();
    }
}