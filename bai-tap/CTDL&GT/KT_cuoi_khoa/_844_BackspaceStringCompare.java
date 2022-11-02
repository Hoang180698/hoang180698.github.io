public class _844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            if(s1.length()>0 && s.charAt(i)=='#'){
                s1.deleteCharAt(s1.length()-1);
            }
            else if(s.charAt(i)!='#'){
                s1.append(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(s2.length()>0 && t.charAt(i)=='#'){
                s2.deleteCharAt(s2.length()-1);
            }
            else if(t.charAt(i)!='#'){
                s2.append(t.charAt(i));
            }
        }
        return s1.toString().equals(s2.toString());
    }
}
