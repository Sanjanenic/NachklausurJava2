package at.campus02.iwi.pr2;
public class Mine extends Facility {

    protected double miningDept;
     RawMaterial rawMaterial;
    public Mine(double area, double heightAboveSeaLevel, double miningDept, RawMaterial rawMaterial) {
        super(area, heightAboveSeaLevel);
        this.miningDept=miningDept;
        this.rawMaterial=rawMaterial;
    }

    public double getMiningDept() {
        return miningDept;
    }

    public RawMaterial getRawMaterial() {
        return rawMaterial;
    }

    @Override
    public double calculateProfit() {
        double profit=0;
        if(rawMaterial==RawMaterial.LITHIUM || rawMaterial==RawMaterial.NEODYMIUM){
            profit=200*getArea();
        }
        else{
            profit=300*getArea();
        }
        return profit;
    }

    @Override
    public String toString() {
        return "Mine: " +miningDept+ " "+ getHeightAboveSeaLevel();

    }

    @Override
    public int getNrPalms() {
        int bewertung=0;
        if(miningDept>100){
            bewertung=3;
        }
        else if(rawMaterial==RawMaterial.TERBIUM){
            bewertung=2;

        }
        else {
            bewertung=1;
        }
        return bewertung;
    }
}

