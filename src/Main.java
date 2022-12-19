public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7,"жёлтый", "Россия", "механика","седан","СР735ОП",4,"зимние");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", "Германия", "механика","седан","СР735ОП",4,"летние");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", "Германия", "механика","седан","СР735ОП",4,"летние");
        Car kia = new Car("Kia", "Sportrage 4-го поколения", 2.4, "красный", "Южная Корея", "механика","седан","СР735ОП",4,"летние");
        Car hyundai = new Car("Hyundai", "Avante", 1.6, "оранжевый", "Южная Корея", "механика","седан","СР735ОП",4,"летние");
        lada.printCar();
        audi.printCar();
        bmw.printCar();
        kia.printCar();
       hyundai.printCar();
    }
}