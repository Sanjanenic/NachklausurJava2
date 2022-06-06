package at.campus02.iwi.pr2;
abstract class Facility implements PalmRating {

    protected double area;
    protected double heightAboveSeaLevel;

    public Facility(double area, double heightAboveSeaLevel) {
        this.area = area;
        this.heightAboveSeaLevel = heightAboveSeaLevel;
    }

    public double getArea() {
        return area;
    }

    public double getHeightAboveSeaLevel() {
        return heightAboveSeaLevel;
    }

public abstract double calculateProfit();
}

