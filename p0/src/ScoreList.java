/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2016 
// PROJECT:          p0
// FILE:             ScoreList.java
//
// Authors: Zhiheng Wang
// Author1: (name1,email1,netID1,lecture number1)
// Author2: (name2,email2,netID2,lecture number2)
//
// ---------------- OTHER ASSISTANCE CREDITS 
// Persons: Identify persons by name, relationship to you, and email. 
// Describe in detail the the ideas and help they provided. 
// 
// Online sources: avoid web searches to solve your problems, but if you do 
// search, be sure to include Web URLs and description of 
// of any information you find. 
//////////////////////////// 80 columns wide //////////////////////////////////

/**
 * (ScoreList is a class to implement the ScoreListADT interface)
 *
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author (Zhiheng Wang)
 */
public class ScoreList implements ScoreListADT {
    private Score[] score= new Score[10];
	private int numScores = 0;
	public ScoreList() {
		
		
	}

	
	/** 
	 * Returns the number of Scores in the list or zero
	 * @return the number of scores in this list
	 */
	public int size() {
		return numScores;
	}

	/** 
	 * Adds the score to the end of this list.
	 * 
	 * @param s a non-null Score to place as the last item in the list.
	 * @throws IllegalArgumentException
	 */
	public void add(Score s) {
		if(s == null){
			throw new IllegalArgumentException();
		}
		if(numScores >= score.length){
			expandArray();
		}
		score[numScores] = s;
		numScores ++;
	}
	
	/**
	 * Expands the score list 
	 */
	private void expandArray() {
		//create new array
		Score[] a = (Score[]) new Object[score.length*2];
		
		//copy items from old array to new
		for(int i = 0; i< numScores; i++ )
			a[i] = score[i];
		
		//reassign items to point to new array
		score = a;
	}

	/**
	 * Removes and returns the item at index position i.
	 * If i is less than zero or greater than size()-1,
	 * will throw an IndexOutOfBoundsException.
	 * @param i must be greater than or equal to zero and less than size()
	 * @return the item at index i
	 * @throws IndexOutOfBoundsException
	 */
	public Score remove(int i) {
		if(i < 0 || i > score.length-1){
			throw new IndexOutOfBoundsException();
		}
		Score temp = score[i];
		for(int k =i ; k < numScores -1; k++){
			score[k] = score[k+1];
		}
		numScores--;
		return temp;
	}

	/**
	 * Returns (without removing) the item at index position i.
	 * If i is less than zero or greater than size()-1,
	 * will throw an IndexOutOfBoundsException.
	 * @param i must be greater than or equal to zero and less than size()
	 * @return the item at index i
	 * @throws IndexOutOfBoundsException
	 */
	public Score get(int i) throws IndexOutOfBoundsException {
		if(i < 0 || i > score.length-1)
			throw new IndexOutOfBoundsException();
		return score[i];
	}
}
