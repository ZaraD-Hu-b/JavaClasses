package com.class19;

public class scoreGradeHW3 {
	/**
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 * 
	 * @return
	 */

	char getGrade(int score) {
		char grade;
		if (score > 90) {
			grade = 'A';
		} else if (score > 80 && score <= 90) {
			grade = 'B';
		} else if (score > 70 && score <= 80) {
			grade = 'C';
		} else if (score > 50 && score <= 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
		}

	public static void main(String[] args) {
		scoreGradeHW3 grade = new scoreGradeHW3();
		char ch = grade.getGrade(77);
		System.out.println("The grade is: " + ch);
	}
}