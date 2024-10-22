import java.util.Arrays;
import java.util.List;

public class UserRepository {
    // Returns a list of film titles
    public List<String> getUserFilmsHistory() {
        return Arrays.asList(
                "Army of the Dead",
                "King Arthur: Legend of the Sword",
                "Total Recall",
                "Friday the 13th",
                "The General's Daughter",
                "American Gangster",
                "Replicas",
                "Army of Thieves",
                "21 Jump Street",
                "The Harder They Fall"
        );
    }

    // Returns a list of Tv show titles
    public List<String> getUserTvSeriesHistory() {
        return Arrays.asList("Maya and the Three",
                "The Thundermans",
                "Riverdale",
                "Locke and Key",
                "Catching Killers",
                "Cocomelon",
                "Maid",
                "Colin in Black and White",
                "Squid Game",
                "You"
        );
    }
}
