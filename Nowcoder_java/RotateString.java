/**
 * Created by leoeatle on 16/7/29.
 */
public class RotateString {
    public class Reverse {
        public String reverseSentence(String A, int n) {
            // write code here
            A = reverse(A);
            String[]  str_list =  A.split(" ");
            String result = "";
            for(int i = 0; i < str_list.length; i ++){
                str_list[i] = reverse(str_list[i]);
                result = result + str_list[i] + ' ';

            }
            result = result.substring(0, result.length() - 1);
            return result;
        }
        public String reverse(String A){
            char[] char_list = A.toCharArray();
            int la = char_list.length;
            for(int i = 0; i < la/2; i++){
                char temp = char_list[i];
                char_list[i] = char_list[la - i - 1];
                char_list[la - i - 1] = temp;
            }
            return String.valueOf(char_list);
        }
    }
}
