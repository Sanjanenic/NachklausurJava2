package at.campus02.iwi.pr2;

import java.util.Comparator;

public class IslandComparator implements Comparator<Facility> {


    @Override
    public int compare(Facility o1, Facility o2) {
//provjerava prvi kriterijum
        final int ersteKriterium = Double.compare(o2.getHeightAboveSeaLevel(), o1.getHeightAboveSeaLevel());
        if (ersteKriterium != 0) {  //0 vraca ako su isti
            return ersteKriterium;
        }
        //provjerava drugi kriterijum
        return Double.compare(o2.getArea(), o1.getArea());
    }
}
