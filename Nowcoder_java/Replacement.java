/**
 * Created by leoeatle on 16/8/2.
 */
//请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。
//给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。


import java.util.*;

public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        int count = 0;
        char[] arr = iniString.toCharArray();
        for(int i = 0; i< length; i++){
            if(arr[i] ==  ' '){
                count++;
                //System.out.println(count);
            }
        }
        int newLen = length + count * 2;//注意这里一定是2,原来就包括了1,新增加了2个!
        char[] newArr = new char[newLen];
        int index = 0;
        for(int j = 0; j < length; j++){
            if(arr[j] == ' '){
                newArr[index] = '%';
                newArr[index+1] = '2';
                newArr[index+2] = '0';
                index = index + 3;
            }
            else{
                newArr[index] = arr[j];
                index++;
            }
        }
        return String.valueOf(newArr);
    }
}