class Solution {
    public void setZeroes(int[][] matrix) {
        int ROW  = matrix.length;
        int COL = matrix[0].length;
        boolean rowZero = false;


        for( int i =0; i < COL; i++){
            if(matrix[0][i] == 0){
                rowZero = true;
                break;
            }
        }

        for(int i =1; i < ROW; i++){

            for(int j =0; j < COL; j++){

                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] =0;
                }
            }
        }

        for(int i =1; i < ROW; i++){

            for(int j =1; j < COL; j++){
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for( int i =0; i < ROW; i++){
                matrix[i][0] = 0;
            
            }
        }  

        if(rowZero){
            for( int i =0; i < COL; i++){
                matrix[0][i] = 0;
            
            }
        }    
        
    }
}
