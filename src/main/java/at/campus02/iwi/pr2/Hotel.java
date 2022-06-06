package at.campus02.iwi.pr2;
public  class Hotel extends Facility{

int stars;
int maxNrGuests;
int nrGuests;

    public Hotel(double area, double heightAboveSeaLevel,int stars,
    int maxNrGuests,
    int nrGuests ) {
        super(area, heightAboveSeaLevel);

        if(stars>3 || stars<1) {
            this.stars = 1;
        } else{
            this.stars=stars;
        }

        this.maxNrGuests=maxNrGuests;
        this.nrGuests=nrGuests;
    }

    public int getStars() {
        return stars;
    }

    public int getMaxNrGuests() {
        return maxNrGuests;
    }

    public int getNrGuests() {
        return nrGuests;
    }

    @Override
    public double calculateProfit() {
        double profit=0;
        if(stars==1){
            profit= (60*nrGuests)-((0.2*maxNrGuests)*30);
        }
        else if(stars==2){
           profit=( 75*nrGuests)-((0.3*maxNrGuests)*30);
        }
        else {
            profit=(120*nrGuests)-((0.4*maxNrGuests)*30);
        }

        return profit;
    }

    @Override
    public String toString() {
        return "Hotel: " + nrGuests;
    }

    @Override
    public int getNrPalms() {
        int bewertung=0;

        double auslastung = (double)nrGuests/maxNrGuests;

        if(auslastung>0.85){
            bewertung=3;
        }
        else if(auslastung>0.50){
            bewertung=2;
        }
        else{
            bewertung=1;
        }

        return bewertung;
    }
}

