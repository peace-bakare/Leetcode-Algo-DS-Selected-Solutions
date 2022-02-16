/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day_4_Two_Pointers;

/**
 *
 * @author Peace E. BAKARE
 */
public class ReverseString_344 {
    public void reverseString(char[] s) {
        int end = s.length - 1;     
        for (int i = 0; i < s.length/2; i++){
            char temp = ' ';
            temp = s[i];
            s[i] = s[end];
            s[end] = temp;
            end--;
        }
    }
}
