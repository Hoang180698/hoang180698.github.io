
public class Movie extends Film{
    
    private int runtime;

    public Movie(String id, String title, TYPE type, double ranking, int runtime){
        this.id = id;
        this.title = title;
        this.type = type;
        this.ranking = ranking;
        this.runtime = runtime;
    }

    public void setRuntime(int runtime){
        this.runtime = runtime;
    }
    public int getRuntime(){
        return this.runtime;
    }

    public String toStringMv(){
        String text = this.id + ": " + this.title + "   Type: "  +this.type + "   duration: "
                      + this.runtime + "m    ranking: " + this.ranking;
        return text;
    }
    public void printMV(){
        String textToPrint = this.toStringMv();
        System.out.println(textToPrint);
    }

}