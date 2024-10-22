import java.util.Hashtable;

public class ShowCache {
    // A HashTable that contains the initial model object from which we clone from
    public static Hashtable<String, Show<?>> showMap = new Hashtable<>();

    // Instantiates the initial objects from which we clone from
    public static void loadCache() {
        final TvSeries tvSeries = new TvSeries();
        final Film film = new Film();
        showMap.put("Tv Series", tvSeries);
        showMap.put("Film", film);
    }

    // Returns clone of object stored in showMap to client
    public static Show<?> getShow(String showId) throws CloneNotSupportedException, ShowIdNotRecognisedException {
        // Switch statement to find out which clone is needed
        switch (showId) {
            case "Film":
                Film cashedFilm = (Film) showMap.get(showId);
                return cashedFilm.clone();
            case "Tv Series":
                TvSeries cashedTvSeries = (TvSeries) showMap.get(showId);
                return cashedTvSeries.clone();
            default:
                throw new ShowIdNotRecognisedException("Unable to get show: " + showId);
        }
    }
}
