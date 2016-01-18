package br.com.hackerrank.contratado.teste6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
	
	static String getDayWeak(int year){	
		String dayWeak = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dayEx = null;
        String yearStr = String.valueOf(year);
		try {
			dayEx = sdf.parse("22/04/".concat(yearStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dayEx);
        int dayWeakInt = gc.get(GregorianCalendar.DAY_OF_WEEK);
        switch (dayWeakInt) {
		case 1:
			return "Domingo";
		case 2:
			return "Segunda" ;
		case 3:
			return "Terça-feira" ;
		case 4:
			return "Quarta-feira" ;
		case 5:
			return "Quinta-feira" ;
		case 6:
			return "Sexta-feira";
		case 7:
			return "Sábado";
		default:
			return dayWeak;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int year = sc.nextInt();
			System.out.println(getDayWeak(year));
		}
	}

}
