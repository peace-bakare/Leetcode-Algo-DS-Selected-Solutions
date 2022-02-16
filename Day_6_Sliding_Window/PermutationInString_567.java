/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_6_Sliding_Window;

import java.util.Arrays;

/**
 *
 * @author Peace E. BAKARE
 */
public class PermutationInString_567 {
    public boolean checkInclusion(String s1, String s2) {
        int x = s1.length(), y = s2.length();
        if (x > y || y == 0){
            return false;
        }
        
        if (x == 0){
            return true;
        }
        
        int [] array1 = new int[26];
        int [] array2 = new int[26];
        
        for (int i = 0; i < x; i++){
            array1[s1.charAt(i) - 'a']++;
            array2[s2.charAt(i) - 'a']++;
        }
        
        for (int i = x; i < y; i++){
            if(Arrays.equals(array1, array2)){
                return true;
            }
            array2[s2.charAt(i-x) - 'a']--;
            array2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(array1, array2)){
            return true;
        }else{
            return false;
        }
    }
}
