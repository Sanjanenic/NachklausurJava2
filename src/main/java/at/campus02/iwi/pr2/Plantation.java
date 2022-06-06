package at.campus02.iwi.pr2;
public class Plantation extends Facility{
protected Fruit fruit;

    public Plantation(double area, double heightAboveSeaLevel,Fruit fruit) {
        super(area, heightAboveSeaLevel);
        this.fruit=fruit;
    }

    public Fruit getFruit() {
        return fruit;
    }

    @Override
    public double calculateProfit() {
        double profit=0;
        if(fruit==Fruit.BANANA) {
            profit=30*area;
        }
        else if(fruit==Fruit.COCONUT){
            profit=((15*area)*2.5);
        }
        else if(fruit==Fruit.MANGO) {
            if(heightAboveSeaLevel<=150){
                profit=((15*area)*3);
            }
            else {
                profit=((10*area)*3);
            }
        }
        return profit;
    }

    @Override
    public String toString() {
        return "Plantation: " + fruit;
    }

    @Override
    public int getNrPalms() {
        int bewertung=0;
        if(getArea()<=20){
            bewertung=3;
        }
        else if(fruit==Fruit.MANGO){
            bewertung=2;
        }
        else{
            bewertung=1;
        }
        return bewertung;
    }
}
