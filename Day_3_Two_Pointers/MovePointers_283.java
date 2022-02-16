/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_3_Two_Pointers;

/**
 *
 * @author Peace E. BAKARE
 */
public class MovePointers_283 {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[start] = nums[i];
                start++;
            }
        }
        for (; start < nums.length; start++){
            nums[start] = 0;
        }
    }
}
