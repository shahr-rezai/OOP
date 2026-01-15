public class TVShow {
  String name;
  double rating;
  int episodeLength;
  int numberOfEpisodes;
  public TVShow(String name, double rating, int episodeLength, int numberOfEpisodes){
    this.name=name;
    this.rating=rating;
    this.episodeLength=episodeLength;
    this.numberOfEpisodes=numberOfEpisodes;
  }
  
  public int totalPlaytimeInMinutes(){
   return numberOfEpisodes * episodeLength; }

  public double totalPlaytimeInHours(){
    double minutes = totalPlaytimeInMinutes();
    return minutes/60.0;

  }
  @Override
  public String toString(){
    return name+ "--> rating: "+rating+ ", episode length(minutes): " +episodeLength+ "#episodes: "+numberOfEpisodes; 
  }

  
}
