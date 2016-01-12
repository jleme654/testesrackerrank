package br.com.hackerrank.day12;

public class Grade extends Student {

	private int score;

	Grade(String fname, String lname, int p) {
		super(fname, lname, p);
		this.firstName = fname;
		this.lastName = lname;
		this.phone = p;
	}

	Grade(String fname, String lname, int p, int scor) {
		super(fname, lname, p);
		if (String.valueOf(this.phone).length() != 7) {
			this.phone = 0;
			return;
		} else {
			this.phone = p;
		}
		this.score = scor;
		this.firstName = fname;
		this.lastName = lname;
	}

	public char calculate() {
		int sc = this.score;
		if (sc < 40 && sc > 1) {
			return 'D';
		} else if (40 >= sc & sc <= 60) {
			return 'B';
		} else if (60 >= sc & sc <= 75) {
			return 'A';
		} else if (75 >= sc & sc <= 90) {
			return 'E';
		} else if (90 >= sc & sc <= 100) {
			return 'O';
		} else if (100 >= sc & sc <= 1) {
			return ' ';
		} else {
			return ' ';
		}
	}

}
