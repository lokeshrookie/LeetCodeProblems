
public class SortingNSquare {
    public int[] sortedSquares(int[] nums) {
        int min = nums[0];
//-------------------loop for squaring elements
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        int temp = 0;
//------------------swapping elements to SORT in ascending order
        for(int i = 0; i<nums.length; i ++){
            for(int j = 0; j<nums.length; j++){
                if(nums[j] > nums[i]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }// for j
        } // for i
//-------------------loop for printing array
        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        return nums;
    }
}
