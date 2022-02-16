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
public class TwoSumII_167 {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end){
            int sum = numbers[start] + numbers[end];
            if (sum == target){
                return new int []{start + 1, end + 1};
            }
            else if (sum < target){
                ++start;
            }
            else {
                --end;
            }
        }
        return new int [] {-1, -1};
    }
}
