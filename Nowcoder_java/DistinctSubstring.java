/**
 * Created by leoeatle on 16/8/2.
 */
import java.util.*;

//对于一个字符串,请设计一个高效算法，找到字符串的最长无重复字符的子串长度。
//        给定一个字符串A及它的长度n，请返回它的最长无重复字符子串长度。保证A中字符全部为小写英文字符，且长度小于等于500。

public class DistinctSubstring {
    public int longestSubstring(String A, int n) {
        // write code here
        if(A==null || n == 0){
            return 0;
        }
        char[] arr = A.toCharArray();
        int[] map = new int[256];
        for(int a = 0; a < 256; a++){
            map[a] = -1;
        }
        int pre = -1;
        int cur = 0;
        int len = 0;//注意这里一定要设一个LEN进行多次比较,我们要比较的是在每一个位置能找的的最长不重复字符串中的最长的
        for(int i = 0; i < A.length(); i++){
            if(map[arr[i]] == -1){
                pre = Math.max(map[arr[i]], pre);
                cur = i -pre;//这个地方pre可能是-1,是对的,因为这里的i是坐标值,是被减了1的
                map[arr[i]] = i;//这里的arr[i]的确是个字符,但转换成相应的Ascii值了,所以前面定义数组时才是长度为256
                len = Math.max(len, cur);
            }
            else if(map[arr[i]] != -1){
                pre = Math.max(map[arr[i]], pre);
                cur = i - pre;
                map[arr[i]] = i;
                len = Math.max(len, cur);
            }
        }
        return len;
    }
}