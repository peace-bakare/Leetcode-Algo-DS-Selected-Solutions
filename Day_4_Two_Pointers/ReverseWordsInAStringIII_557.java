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
public class ReverseWordsInAStringIII_557 {
    public String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word: words){
            result.append(new StringBuffer(word).reverse().toString() + " ");
        }
        return result.toString().trim();
    }
}
