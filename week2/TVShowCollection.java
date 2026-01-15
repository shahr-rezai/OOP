class TVShowCollection {
    TVShow[] myShows;

    // Constructor: create array for 3 shows
    TVShowCollection() {
        this.myShows = new TVShow[3];
    }

    // Combine all shows into a single string
    @Override
    public String toString() {
        String s = "";
        for (TVShow show : this.myShows) {
            if (show != null) {
                s += " - " + show.toString() + "\n";
            } else {
                s += " - [empty slot]\n"; // prevents crash if null
            }
        }
        return s;
    }

    // Print the show with the longest total playtime
    public void printLongestShow() {
        TVShow longest = null;
        int longestTime = 0;

        for (TVShow show : myShows) {
            if (show != null) {
                int time = show.totalPlaytimeInMinutes();
                if (time > longestTime) {
                    longestTime = time;
                    longest = show;
                }
            }
        }

        if (longest != null) {
            System.out.println("The longest show is: " + longest.name +
                               " (" + longestTime + " minutes)");
        } else {
            System.out.println("No shows in the collection!");
        }
    }

    // Return the name of the show with the most episodes
    public String showWithMostEpisodes() {
        TVShow most = null;
        int maxEpisodes = 0;

        for (TVShow show : myShows) {
            if (show != null && show.numberOfEpisodes > maxEpisodes) {
                maxEpisodes = show.numberOfEpisodes;
                most = show;
            }
        }

        if (most != null) {
            return most.name;
        } else {
            return "No shows in collection!";
        }
    }
}
