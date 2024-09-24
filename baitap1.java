import java.util.*;

public class baitap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String longestWord="";
        int maxLength=0;
        while(sc.hasNext()){
            String word=sc.next();
            if(word.length()>maxLength){
                longestWord=word;
                maxLength=word.length();
            }
        }
        System.out.println(longestWord+" - "+maxLength);        
    }
}
