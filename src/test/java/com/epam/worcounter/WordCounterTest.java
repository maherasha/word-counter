package test.java.com.epam.worcounter;

import static org.junit.Assert.*;
import main.java.com.epam.wordcounter.WordCounter;

import org.junit.Test;

public class WordCounterTest {

	
	@Test
	public void whenCallingCountToWordForFirstTimeItWillBe—ounted1AsInitialValue(){
		WordCounter wordCounter =  new WordCounter();
		wordCounter.count("maher");
		
		assertEquals(wordCounter.getCount("maher"), Integer.valueOf(1));
		
	}
	
	@Test
	public void whenCallingCountToWordAlreadyExistItsCounterWillIncrementBy1(){
		WordCounter wordCounter =  new WordCounter();	
		wordCounter.count("maher");
		Integer counterBeforeIncrement = wordCounter.getCount("maher");
		wordCounter.count("maher");
		assertEquals(wordCounter.getCount("maher"), Integer.valueOf(counterBeforeIncrement + Integer.valueOf(1)));
		
	}
	
	
	@Test
	public void testCallingCounterDefferentTimesIncrementsCounterAsManyTimeItsCalledForSameWord(){
		WordCounter wordCounter =  new WordCounter();	
		wordCounter.count("maher");
		wordCounter.count("maher");
		wordCounter.count("maher");
		
		wordCounter.count("ahmad");
		wordCounter.count("ahmad");
		
		assertEquals(wordCounter.getCount("maher"), Integer.valueOf(3));
		assertEquals(wordCounter.getCount("ahmad"), Integer.valueOf(2));
		
	}
	
	@Test
	public void whenCountToWordDoesNotExistReturns0(){
		WordCounter wordCounter =  new WordCounter();	

		assertEquals(wordCounter.getCount("maher"), Integer.valueOf(0));
	}		
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testEmptyWordsThrowsIllegalArgumentExceptionOnCount(){
		WordCounter wordCounter =  new WordCounter();	
        wordCounter.count("");    
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testNullValuesThrowsIllegalArgumentExceptionOnCount(){
		WordCounter wordCounter =  new WordCounter();	
        wordCounter.count(null);    
	}

	@Test(expected=IllegalArgumentException.class)
	public void whenGetCountToEmptyWordThrowsIllegalArgumentException(){
		WordCounter wordCounter =  new WordCounter();	
		wordCounter.getCount("");
	
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void whenGetCountToNullVAlueThrowsIllegalArgumentException(){
		WordCounter wordCounter =  new WordCounter();	
		wordCounter.getCount(null);
        
		
	}
	
	
}
