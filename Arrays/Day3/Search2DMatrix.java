class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(mat[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
