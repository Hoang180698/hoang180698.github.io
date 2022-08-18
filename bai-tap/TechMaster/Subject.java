public class Subject {
    private String name;
    private int time;
    
    public Subject(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "    " +name + " " + time + " buổi";
    }
}
