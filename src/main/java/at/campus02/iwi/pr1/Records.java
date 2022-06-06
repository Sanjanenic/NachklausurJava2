package at.campus02.iwi.pr1;

public class Records {
    static final double LIMIT_SINGLE = 20.0;

    public static void main(String[] args) {
        final int[]    GENRES  = RecordsData.GENRES;
        final String[] ARTISTS = RecordsData.ARTISTS;
        final double[] LENGTHS = RecordsData.LENGTHS; // in minuten
    }

    public static boolean istSingle(double[] lengths, int index) {
        return false;
    }

    public static int plattenVonInterpret(String[] artists, String artist) {
        return 0;
    }

    public static int[] nimmInterpret(String[] artists, String artist) {
        return null;
    }

    public static double mittlereDauerAlbum(double[] lengths) {
        return 0.0;
    }

    public static double gesamtspieldauer(double[] lengths) {
        return 0.0;
    }

    public static int nextSingle(int[] genres, double[] lengths, int current) {
        return 0;
    }

    public static double nextFive(double[] lengths, int[] genres, int genre, int current) {
        return 0.0;
    }
}
