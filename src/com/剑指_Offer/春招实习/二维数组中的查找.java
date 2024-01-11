package com.剑指_Offer.春招实习;

public class 二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        int mlength = matrix.length;
        int nlength = matrix[1].length;

        for(int i = 0; i < mlength; i++){

            if(matrix[i][0] < target){
                int low = 0;
                int high = nlength-1;
                while (low <= high) {
                    int mid = low + ((high - low) >> 1);
                    if (matrix[i][mid] == target)
                        return true;
                    else if (matrix[i][mid] > target)
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
            }else {
                return false;
            }
        }
        return false;
    }
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        int m = matrix.length, n = matrix[0].length;
//        int x = 0, y = n - 1;
//        while (x < m && y >= 0) {
//            if (matrix[x][y] == target) {
//                return true;
//            }
//            if (matrix[x][y] > target) {
//                --y;
//            } else {
//                ++x;
//            }
//        }
//        return false;
//    }

}
