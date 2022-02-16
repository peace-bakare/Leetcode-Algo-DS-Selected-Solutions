/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_6_Sliding_Window;

import java.util.HashMap;

/**
 *
 * @author Peace E. BAKARE
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {
    public int lengthOfLongestSubstring(String s) {
//         ArrayList list = new ArrayList();
        
//         for (int i = 0; i < s.length(); i++){
//             if (list.contains(s.charAt(i))){
//                 break;
//             }else{
//                 list.add(s.charAt(i));
//             }
//         }
//         return list.size();
        
        HashMap<Character, Integer> longestSubstring = new HashMap<>();
        int n = s.length(), result = 0;
        
        for (int i = 0, j = 0; i < n; i++){
            if (longestSubstring.containsKey(s.charAt(i))){
                j = Math.max(longestSubstring.get(s.charAt(i)), j);
            }
            result = Math.max(result, i - j + 1);
            longestSubstring.put(s.charAt(i), i + 1);
        }
        return result;
    }
}
