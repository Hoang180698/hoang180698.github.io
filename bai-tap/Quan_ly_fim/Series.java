
public class Series extends Film {

    private int episodes;
    private int averDuration;

    public Series(String id, String title, TYPE type,
                  double ranking, int episodes, int averDuration){
        this.id = id;
        this.title = title;
        this.type = type;
        this.ranking = ranking;
        this.episodes = episodes;
        this.averDuration = averDuration;

    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }
    public void setAverDuration(int averDuration){
        this.averDuration = averDuration;
    }

    public int getEpisodes(){
        return this.episodes;
    }
    public int getAverDuration(){
        return this.averDuration;
    }

    public String toStringSeri(){
        String text = this.id + ": " + this.title + "    Type:"  +this.type + "    ep: "
                      + this.episodes + "p    Average Duration: " + this.averDuration
                      +"m/p    ranking: " + this.ranking;
        return text;
    }
    public void printSeri(){
        String textToPrint = this.toStringSeri();
        System.out.println(textToPrint);
    }
    
}
