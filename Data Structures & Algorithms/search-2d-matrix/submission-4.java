class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Step 1: Find the row
        int ROWS = matrix.length, COLS = matrix[0].length;

        int l = 0, r = ROWS - 1;
        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(matrix[mid][0] > target) r = mid-1;
            else if(matrix[mid][COLS-1] < target) l = mid+1;
            else break;
        }
        if(l > r) return false;

        // Step 2: Check if element exists in row
        int row = l + (r-l) / 2;
        l = 0; r = COLS-1;

        while(l <= r) {
            int mid = l + (r-l) / 2;
            if(matrix[row][mid] < target)  l = mid+1;
            else if(matrix[row][mid] > target) r = mid-1;
            else return true;
        }
        return false;
    }
}
