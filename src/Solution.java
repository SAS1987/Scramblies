
import java.util.LinkedList;

class Solution{
    public static void main(String[] args) {
        //System.out.println("1");
        System.out.println(scramble("rkqodlw","world"));
        System.out.println(scramble("cedewaraaossoqqyt","codewars"));
        System.out.println(scramble("katas","steak"));
        System.out.println(scramble("scriptjavx","javascript"));

    }

    public static boolean scramble(String str1, String str2) {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < str1.length(); i++) {
            list.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            if(list.contains(str2.charAt(i))){
                list.remove(list.indexOf(str2.charAt(i)));
            } else{
                return false;
            }
        }
        return true;
    }
}