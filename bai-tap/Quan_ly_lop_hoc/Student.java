public class Student extends User {
    
    boolean isOnline;
    String background;

    public Student(String id, String name, Gender gender, String birthday, String email, String phoneNumber, boolean isOnline, String background){
        super(id, name, gender, birthday, email, phoneNumber);
        this.isOnline = isOnline;
        this.background = background;
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.print("   Hoc truc tuyen: " + this.isOnline +"     background: " +this.background +"\n");
    }

    
    
}
