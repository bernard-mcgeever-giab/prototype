import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create initial objects
        ShowCache.loadCache();
        final UserRepository userRepository = new UserRepository();
        // For each film title, clone Film object and set appropriate properties. Return list
        final List<Film> filmHistory = userRepository.getUserFilmsHistory().stream().map(entry -> {
            Film film = null;

            try {
                film = (Film) ShowCache.getShow("Film").clone();
                film.setTitle(entry);
                film.setFormat(".mp4");
                film.setThumbnailLocation("films/assets/" + entry.toLowerCase().replace(" ", "_") + film.getFormat());
            } catch (CloneNotSupportedException | ShowIdNotRecognisedException e) {
                e.printStackTrace();
            }

            return film;
        }).collect(Collectors.toList());

        // For each tv show title, clone TvSeries object and set appropriate properties. Return list
        final List<TvSeries> tvSeriesHistory = userRepository.getUserTvSeriesHistory().stream().map(entry -> {
            TvSeries tvSeries = null;

            try {
                tvSeries = (TvSeries) ShowCache.getShow("Tv Series").clone();
                tvSeries.setTitle(entry);
                tvSeries.setFormat(".mp4");
                tvSeries.setThumbnailLocation("tv-shows/assets/" + entry.toLowerCase().replace(" ", "_") + tvSeries.getFormat());
            } catch (CloneNotSupportedException | ShowIdNotRecognisedException e) {
                e.printStackTrace();
            }

            return tvSeries;
        }).collect(Collectors.toList());

        // Print filmHistory and tvSeriesHistory to the console
        System.out.println(filmHistory);
        System.out.println(tvSeriesHistory);
    }
}