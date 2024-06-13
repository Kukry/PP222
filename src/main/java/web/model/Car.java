package web.model;

public class Car {
    private String carModel;
    private int series;
    private String colour;

    public Car() {
    }

    public Car(String carModel, int series, String colour) {
        this.carModel = carModel;
        this.series = series;
        this.colour = colour;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", series=" + series +
                ", colour='" + colour + '\'' +
                '}';
    }
}
