import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int row = -1;
        int n = mat.size();
        int m = mat.get(0).size();
        if(target < mat.get(0).get(0) || target > mat.get(n-1).get(m-1)){
            return false;
        }
        
        for(int i=0;i<n;i++){
            if(target <= mat.get(i).get(m-1)){
                row = i;
                break;
            }
        }

        return mat.get(row).contains(target);
    }
}
