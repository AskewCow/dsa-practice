class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        int lo = 0, hi = rows-1;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(target > matrix[mid][cols-1]) lo = mid+1;
            else if(target < matrix[mid][0]) hi = mid-1;
            else {
                break;
            }
        }

        if(lo > hi) return false;

        int row = lo + (hi - lo) / 2;
        lo = 0; hi = cols-1;
        while(lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(matrix[row][mid] > target) hi = mid-1;
            else if(matrix[row][mid] < target) lo = mid+1;
            else return true;
        }

        return false;
    }
}
