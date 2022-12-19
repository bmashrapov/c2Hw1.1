import java.time.LocalDate;
import java.util.Date;

public class Car {
    class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
    }
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int capacity;
    private String typTires;

    Car(String brand, String model, double engineVolume, String color, String country, String transmission, String bodyType, String registrationNumber, int capacity, String typTires) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (country == null) {
            this.country = "default";
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
        if (getYear() <= 0) {
            this.year = 2000;
        } else {
            this.year = getYear();
        }
        if (transmission == null) {
            this.transmission = "механика";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "Введите значение";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (capacity == 0) {
            this.capacity = 4;
        } else {
            this.capacity = capacity;
        }
        if (typTires == null) {
            this.typTires = "Введите значение";
        } else {
            this.typTires=typTires;
        }
    }
    private static String checkTypeTires(String typTires) {
        String typTires1 = "";
        LocalDate localDate = LocalDate.now();
        int month = localDate.getMonthValue();
        if (month > 9 || month < 4) {
            typTires1 = "зимние";
        } else {
            typTires1 = "летние";
        }
        return typTires1;
    }

    public boolean changeTires(String typTires) {
        if (typTires.equalsIgnoreCase(checkTypeTires(typTires))) {
            this.typTires = typTires;
            System.out.println(typTires);
        } else {
            System.out.println("Смените резину на сезонную");
        }
        return typTires.equalsIgnoreCase(checkTypeTires(typTires));
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String isTypTires() {
        return typTires;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTypTires(String typTires) {
        this.typTires = typTires;
    }

    public void printCar() {
        System.out.println("Машина " + getBrand() + " " + getModel() + ". Объем двигателя " + getEngineVolume() + " литра." + " Цвет - " + getColor() + ". Страна - производитель " + getCountry() + ". Коробка передач " + getTransmission() + ". Тип кузова "+getBodyType() + ". Регистрационный номер "+getRegistrationNumber()+ ". Количество сидений "+getCapacity() + ". Состояние шин " + changeTires(typTires));
    }
}
