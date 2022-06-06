package at.campus02.iwi.pr2;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import at.campus02.iwi.pr2.Mine;
import at.campus02.iwi.pr2.Fruit;

import at.campus02.iwi.pr2.Hotel;
import at.campus02.iwi.pr2.Island;
import at.campus02.iwi.pr2.Plantation;
import at.campus02.iwi.pr2.RawMaterial;

public class Pr2Bsp1Test {

	public Mine b1, b2, b3;
	public Hotel hneg, hpos, h1, h2, h3;
	public Plantation p1, p2, p3, p4;
	public Island island;


	@Before
	public void setUp() throws Exception {


		b1 = new Mine(50, 100, 110, RawMaterial.NEODYMIUM);
		b2 = new Mine(20, 120, 50, RawMaterial.TERBIUM);
		b3 = new Mine(10, 140, 40, RawMaterial.LITHIUM);

		hneg = new Hotel(30, 300, 0, 100, 80);
		hpos = new Hotel(30, 350, 4, 100, 80);

		h1 = new Hotel(80, 110, 1, 100, 30);
		h2 = new Hotel(100, 120, 2, 25, 15);
		h3 = new Hotel(200, 130, 3, 100, 90);


		p1 = new Plantation(20, 50, Fruit.MANGO);
		p2 = new Plantation(55, 160, Fruit.MANGO);
		p3 = new Plantation(25, 70, Fruit.BANANA);
		p4 = new Plantation(60, 80, Fruit.COCONUT);

		island = new Island();

	}

	@Test
	public void testMine() {


		assertEquals(50, b1.getArea(), 0.001);
		assertEquals(100, b1.getHeightAboveSeaLevel(), 0.001);
	//	assertEquals(110, b1.getMiningDepth(), 0.001);
		assertEquals(RawMaterial.NEODYMIUM, b1.getRawMaterial());

		assertEquals(10000, b1.calculateProfit(), 0.001);
		assertEquals(6000, b2.calculateProfit(), 0.001);
		assertEquals(2000, b3.calculateProfit(), 0.001);
		assertEquals(3, b1.getNrPalms());
		assertEquals(2, b2.getNrPalms());
		assertEquals(1, b3.getNrPalms());
	}

	@Test
	public void testHotel() {

		assertEquals(80, h1.getArea(), 0.001);
		assertEquals(110, h1.getHeightAboveSeaLevel(), 0.001);
		assertEquals(1, h1.getStars());
		assertEquals(100, h1.getMaxNrGuests());
		assertEquals(30, h1.getNrGuests());

		assertEquals(1, hneg.getStars());
		assertEquals(1, hpos.getStars());

		assertEquals(1200, h1.calculateProfit(), 0.001);
		assertEquals(900, h2.calculateProfit(), 0.001);
		assertEquals(9600, h3.calculateProfit(), 0.001);

		assertEquals(1, h1.getNrPalms());
		assertEquals(2, h2.getNrPalms());
		assertEquals(3, h3.getNrPalms());

	}

	@Test
	public void testPlantation() {

		assertEquals(20, p1.getArea(), 0.001);
		assertEquals(50, p1.getHeightAboveSeaLevel(), 0.001);
		assertEquals(Fruit.MANGO, p1.getFruit());



		assertEquals(900, p1.calculateProfit(), 0.001);
		assertEquals(1650, p2.calculateProfit(), 0.001);
		assertEquals(750, p3.calculateProfit(), 0.001);
		assertEquals(2250, p4.calculateProfit(), 0.001);
//
//
		assertEquals(3, p1.getNrPalms());
		assertEquals(2, p2.getNrPalms());
		assertEquals(1, p3.getNrPalms());
		assertEquals(1, p4.getNrPalms());

	}
//
	@Test
	public void testIsland() {

		island.add(b1);
		assertEquals(50, island.facilityArea, 0.001);
		assertEquals(b1, island.facilities.get(0));

		island.add(b2);
		assertEquals(70, island.facilityArea, 0.001);
		assertEquals(b2, island.facilities.get(1));

		island.add(h1);
		island.add(h2);

		assertEquals(b1, island.findHighestProfit());

		HashMap<String, Integer> hm = island.groupFacilities();

		assertEquals(1, (int)hm.get("Low"));
		assertEquals(2, (int)hm.get("Average"));
		assertEquals(1, (int)hm.get("High"));


		List<Facility> drowned = island.risingWaterSimulation(110);

		assertEquals(2, drowned.size());
		assertTrue(drowned.contains(b1));
		assertTrue(drowned.contains(h1));
		island.add(p2);
		island.sortedPrint();

	}

}
