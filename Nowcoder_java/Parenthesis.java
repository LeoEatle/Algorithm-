/**
 * Created by leoeatle on 16/8/2.
 */

//对于一个字符串，请设计一个算法，判断其是否为一个合法的括号串。
//        给定一个字符串A和它的长度n，请返回一个bool值代表它是否为一个合法的括号串。

import java.util.*;


public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        char[] arr = A.toCharArray();
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == '('){
                count ++;
            }
            else if(arr[i] == ')'){
                count--;
            }
            if(count<0){
                return false;
            }

        }
        if(count == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
//竟然一次过了...