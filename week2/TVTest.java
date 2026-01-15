public class TVTest {
    public static void main(String[] args) {
        TVShow breakingBad = new TVShow("Breaking Bad", 9.5, 47, 62);
        TVShow gameOfThrones = new TVShow("Game of Thrones", 9.3, 57, 73);
        TVShow clarksonsFarm = new TVShow("Clarkson's Farm", 9.0, 45, 16);

        TVShowCollection collection = new TVShowCollection();

        // Assign shows to the collection
        collection.myShows[0] = breakingBad;
        collection.myShows[1] = gameOfThrones;
        collection.myShows[2] = clarksonsFarm;

        // Print the collection
        System.out.println(collection);

        // Print the longest show
        collection.printLongestShow();

        // Print the show with the most episodes
        System.out.println("Show with most episodes: " + collection.showWithMostEpisodes());
    }
}