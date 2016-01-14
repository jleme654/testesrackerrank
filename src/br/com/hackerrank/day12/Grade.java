package br.com.hackerrank.day12;

public class Grade extends Student {

	private int score;

	Grade(String fname, String lname, int p, int scor) {
		super(fname, lname, p);
		if (this.firstName.length() >= 4 && this.firstName.length() <= 10) {
			this.firstName = fname;
		} else {
			System.exit(0);
		}

		if (this.lastName.length() >= 4 && this.lastName.length() <= 10) {
			this.lastName = lname;
		} else {
			System.err.close();
		}

		if (String.valueOf(this.phone).length()==7) {
			this.phone = p;
		} else {
			System.exit(0);
		}
		this.score = scor;
	}

	public char calculate() {
		int sc = this.score;
		if (sc > 1 && sc < 40) {
			return 'D';
		}
		if (sc >= 40 && sc < 60) {
			return 'B';
		}
		if (sc >= 60 && sc < 75) {
			return 'A';
		}
		if (sc >= 75 && sc < 90) {
			return 'E';
		}
		if (sc >= 90 && sc <= 100) {
			return 'O';
		}
		if (sc > 100 && sc < 1) {
			System.exit(0);
		}
		return ' ';
	}	

}
