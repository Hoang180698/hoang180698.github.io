public class Student {
     private String id;
     private String name;
     private int yearOld;
     private String ranked;
     
    public Student(String id, String name, int yearOld, String ranked) {
        this.id = id;
        this.name = name;
        this.yearOld = yearOld;
        this.ranked = ranked;
    }

    @Override
    public String toString() {
        return "    " +id + ": " +name +"    Tuổi: " +yearOld +"   học lực: " +ranked;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public String getRanked() {
        return ranked;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void setRanked(String ranked) {
        this.ranked = ranked;
    }

}
