/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2016 
// PROJECT:          p0
// FILE:             Score.java
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
 * (The methods of getting names, points, possible points, max possible points, percent, and categories)
 *
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author (Zhiheng Wang)
 */
public class Score {
	private String name;
	private double point;
	private double possible;

	public Score(String name, double point, double possible) {
		if (name == null || point <0 || possible <0 || point >possible){
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.point = point;
		this.possible = possible;
		
	}
	
 /** ACCESSOR METHOD
  * Returns the name of this score.
  *
  * @return the name of this score
  */
	public String getName() {
		return name;
	}
	
	
 /** ACCESSOR METHOD
  * Returns the points of this score.
  *
  * @return the points of this score
  */
	public double getPoints() {
		return point;
	}

  /** ACCESSOR METHOD
   * Returns the max possible points of this score.
   *
   * @return the max possible points of this score
   */
	public double getMaxPossible() {
		return possible;
	}

	
/** ACCESSOR METHOD
 * Returns the percentage of points/possible times 100.
 *
 * @return the percentage of points/possible times 100.
 */
	public double getPercent() {
		return (point/possible)*100;
	}
	
	/** ACCESSOR METHOD
	 * Returns the first character of the name.
	 *
	 * @return the first character of the name.
	 */
	public String getCategory() {
		return Character.toString(((String) getName()).charAt(0));
	}

}
