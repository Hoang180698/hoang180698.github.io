public class _796_Rotate_String {
    public boolean rotateString(String s, String goal) { 
        String temp = s.concat(s);
        if(s.length() != goal.length()) {
            return false;
        }
        return temp.contains(goal);
    }
}