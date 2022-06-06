package at.campus02.iwi.pr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Island {
    ArrayList<Facility> facilities;
    double facilityArea;
//ovako se u konstruktoru inicijalizuje prazan Arraylist
// i drugi atribut setuje na 0;
    public Island() {
        this.facilities = new ArrayList<Facility>();
         this.facilityArea=0;
    }

    public void add(Facility f) {

        // Dodaje facility
        this.facilities.add(f);

        // ovdje se dodaje povrsina facility-a na ukupnu povrsinu
        this.facilityArea = this.facilityArea + f.area;
    }

    public Facility findHighestProfit() {
        Facility fac = facilities.get(0);

        for (Facility f: facilities) {
            if(fac.calculateProfit() < f.calculateProfit()) {
                fac = f;
            }
        }

        return fac;
    }

    public HashMap<String, Integer> groupFacilities() {
        HashMap<String, Integer> group = new HashMap<String, Integer>();

        int low = 0;
        int average = 0;
        int high = 0;

        for (Facility f: facilities) {
            if(f.calculateProfit() < 1000) {
                low++;
            } else if(f.calculateProfit()<10000) {
                average++;
            } else {
                high++;
            }
        }

        group.put("Low", low);
        group.put("Average", average);
        group.put("High", high);

        return group;
    }

//    public double getFacilityArea() {  //ovo je metoda koja racuna povrsinu svih facility pomocu for each petlje
//        double area = 0;
//        for (Facility f: lista
//             ) {
//            area = area + f.getArea();
//        }
//
//        return area;
//    }
    public ArrayList<Facility> risingWaterSimulation(double waterLevel){
         ArrayList<Facility> ergebnis=new ArrayList<Facility>();
        for ( Facility f: facilities) {
            if(waterLevel>= f.getHeightAboveSeaLevel()){
                ergebnis.add(f);
            }

        }
        return ergebnis;
    }

    public void sortedPrint(){
        Collections.sort(facilities, new IslandComparator());
        for ( Facility f: facilities) {
            System.out.println("See Level" + f.getHeightAboveSeaLevel() +" hat Fläche von "+f.getArea()) ;
            }
    }



}
