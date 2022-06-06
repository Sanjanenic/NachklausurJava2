
package at.campus02.iwi.pr1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Pr1Bsp1Test {

    private int[] GENRES;
    private String[] ARTISTS;
    private double[] LENGTHS;

    @Before
    public void setup(){
        GENRES = RecordsData.GENRES;
        ARTISTS = RecordsData.ARTISTS;
        LENGTHS = RecordsData.LENGTHS;
    }

    @Test
    public void testIstSingle() {
        assertTrue(Records.istSingle(LENGTHS, 3));
        assertTrue(Records.istSingle(LENGTHS, 4));
    }

    @Test
    public void testPlattenVonInterpret() {
        int nirvana = Records.plattenVonInterpret(ARTISTS, "Nirvana");
        int kroko_jack = Records.plattenVonInterpret(ARTISTS, "Kroko Jack");
        assertEquals(nirvana, 8);
        assertEquals(kroko_jack, 0);
    }

    @Test
    public void testNimmInterpret() {
        int[] nirvana_alben = Records.nimmInterpret(ARTISTS, "Nirvana");
        int[] kroko_jack_alben = Records.nimmInterpret(ARTISTS, "Kroko Jack");

        int[] nirvana_soll = new int[]{37, 51, 63, 112, 115, 118, 133, 177};
        int[] kroko_jack_soll = new int[0];

        assertArrayEquals(nirvana_alben, nirvana_soll);
        assertArrayEquals(kroko_jack_alben, kroko_jack_soll);
    }

    @Test
    public void testMittlereDauerAlbum() {
        assertEquals(Records.mittlereDauerAlbum(LENGTHS), 59.85, 0.01);
    }

    @Test
    public void testGesamtspieldauer() {
        assertEquals(Records.gesamtspieldauer(LENGTHS), 9885.29, 0.01);
    }

    @Test
    public void testNextSingle() {
        assertEquals(Records.nextSingle(GENRES, LENGTHS, 0), 64);
        assertTrue(Records.istSingle(LENGTHS, 64));

        assertEquals(Records.nextSingle(GENRES, LENGTHS, 3), 4);
        assertTrue(Records.istSingle(LENGTHS, 4));

        assertEquals(Records.nextSingle(GENRES, LENGTHS, 4), 7);
        assertTrue(Records.istSingle(LENGTHS, 7));

        assertEquals(Records.nextSingle(GENRES, LENGTHS, 8), 9);
        assertTrue(Records.istSingle(LENGTHS, 9));

        // No more ..
        assertEquals(Records.nextSingle(GENRES, LENGTHS, 199), -1);
    }

    @Test
    public void testNextfive() {
        assertEquals(Records.nextFive(LENGTHS, GENRES, 0, 0), 18.218, 0.001);
        assertEquals(Records.nextFive(LENGTHS, GENRES, 1,0), 51.80, 0.01);
        assertEquals(Records.nextFive(LENGTHS, GENRES,2,163), 20.23, 0.01);
    }
}

