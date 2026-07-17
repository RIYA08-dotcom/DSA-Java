/*
Leetcode 73-Set Matrix Zeroes
Time Complexity-O(n^2)
Space Complexity-O(n)
Approach-
1.first find the index of row and column where zero is found.
2.set zero in that row and column.
*/
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
       
        Set<Integer>row=new  HashSet<>();
        Set<Integer>column=new  HashSet<>();

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
            if(matrix[i][j]==0){
                    row.add(i);
                    column.add(j);
                }
            }
            } 
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row.contains(i)||column.contains(j)){
                    matrix[i][j]=0;
                }
                

            }
             
        }
        
    }
}
