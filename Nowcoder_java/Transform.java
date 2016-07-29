import java.util.*;

public class Transform {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
        if(lena == 0 || lenb == 0 || lena != lenb){
            return false;
        }
        char[] chas1 = A.toCharArray();
        char[] chas2 = B.toCharArray();
        char[] map = new char[256];
        for(int i = 0; i < chas1.length; i++){
            map[chas1[i]]++;
        }
        for(int j = 0; j < chas2.length; j++){

            if(map[chas2[j]] == 0){
                return false;
            }
            map[chas2[j]]--;
        }
        return true;
    }
}