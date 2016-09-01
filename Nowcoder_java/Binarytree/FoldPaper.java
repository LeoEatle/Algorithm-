package Binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leoeatlesair on 16/8/31.
 */
public class FoldPaper {
    public String[] foldPaper(int n){
        List<String> list = new ArrayList<>();
        fold(1, n, true, list);
        String[] result = new String[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;


    }
    private void fold(int i, int n, boolean down, List<String> list){
        if(i>n){
            return;
        }
        fold(i+1, n, true, list);
        list.add(down?"down":"up");
        fold(i+1, n, false, list);
    }
}
