enum TYPE {
    HORROR,
    COMEDY,
    DOCUMENTATRY,
    ACTION,
    ROMANTIC
}

public class Film{
    
    protected String id;
    protected String title;
    protected TYPE type;
    protected double ranking;
    protected String director;

    public void setDirector(String director){
        this.director = director;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setType(TYPE type){
        this.type = type;
    }
    public void setRanking(double ranking){
        this.ranking = ranking;
    }

    public String getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public TYPE getType(){
        return this.type;
    }
    public double getRanking(){
        return this.ranking;
    }
    public String getDirector(){
        return this.director;
    }

    public boolean hasKeyword(String titleFind) {
        return (this.title.contains(titleFind));
    }
    public boolean isComedy(){
        return this.type == TYPE.COMEDY;
    }

}
