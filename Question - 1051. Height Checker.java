class Solution {
    public int heightChecker(int[] heights) {
    
        int counter = 0;
        int[] res=heights.clone();
        Arrays.sort(heights);
        
        for(int i = 0; i < heights.length; i++){
                if(res[i] != heights[i]){
                    counter ++;
                }
            }
            
     return counter; 

    }
        
        
}