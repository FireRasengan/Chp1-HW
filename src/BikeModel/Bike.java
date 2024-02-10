package BikeModel;

public class Bike {
    private int wheels;
    private String manufacturer;
    private int year;

    public Bike() {
    }

    public Bike(int wheels, String manufacturer, int year) {
        this.wheels = wheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "wheels=" + wheels +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}
