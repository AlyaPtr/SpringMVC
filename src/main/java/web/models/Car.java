package web.models;

public class Car {
    private String model;
    private int series;
    private int year;

    public Car() {}

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public void setModel(String model) { this.model = model; }
    public String getModel() { return this.model; }
    public void setSeries(int series) { this.series = series; }
    public int getSeries() { return this.series; }
    public void setYear(int year) { this.year = year; }
    public int getYear() { return this.year; }
}
