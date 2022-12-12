public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Car(String brand, String model, double engineVolume, String color, String country) {
        if (brand == null) {
            System.out.println("default");
        } else {
            this.brand = brand;
        }
        if (model == null) {
            System.out.println("default");
        } else {
            this.brand = brand;
        }
        if (country == null) {
            System.out.println("default");
        } else {
            this.country = country;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    public void printCar() {
        System.out.println("Машина " + brand + model + ". Объем двигателя " + engineVolume + " литра." + " Цвет - " + color + ". Страна - производитель " + country);
    }
}
