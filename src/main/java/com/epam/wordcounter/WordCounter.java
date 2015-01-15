package main.java.com.epam.wordcounter;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	
	private Map<String, Integer> countedWords = new HashMap<String, Integer>();
	
	/**
	 * the method increment the counter for the passed word by 1 
	 * @param word
	 */
	public void count(String word) {
		if(word == null || word.isEmpty()){
			throw new NullPointerException();
		}
		
		
		if(countedWords.get(word) == null){
			countedWords.put(word, Integer.valueOf(1));
			return;
		}
		
		countedWords.put(word, countedWords.get(word) + Integer.valueOf(1));
		
	}
	
	/**
	 * return how many times this word called on @count method.
	 * 
	 * @param word
	 * @return int
	 */
	public Integer getCount(String word){
		if(word == null || word.isEmpty()){
			throw new NullPointerException();
		}
		
		if(countedWords.get(word) == null){
			return Integer.valueOf(0);
		}
		
		
		return countedWords.get(word);
	}

}
