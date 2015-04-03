package com.hackbulgaria.corejava;

public class FaultyProblem3 {
    
    public String reverseEveryWordInString(String sentence){
        String[] words = sentence.split(" ");
        sentence = "";
        for (int i=0; i<words.length; i++){
        	sentence += reverse(words[i]);
        	if (i<words.length-1) sentence+=" ";
        }
        return sentence;
    }

    private CharSequence reverse(String word) {
        return Utils.reverseMe(word);
    }
}
