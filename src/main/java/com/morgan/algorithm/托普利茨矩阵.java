package com.morgan.algorithm;

/**
 * @Description 托普利茨矩阵
 * @Author Morgan
 * @Date 2021/2/22 16:13
 **/
public class 托普利茨矩阵 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2},{1,2},{2,3}};
//        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean flag = isToeplitzMatrix(matrix);
        System.out.println(flag);
    }

    public static boolean isToeplitzMatrix(int[][] matrix){
        int verticalLength = matrix.length;
        int levelLength = matrix[0].length;
        for (int i =1; i<verticalLength; i++){
            for (int j=1; j<levelLength; j++){
                if (matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
}
