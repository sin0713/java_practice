package chapter2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class List04 {
	public static void main(String[] args) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDate d = LocalDate.parse("2011/08/21", f);
		
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("1000日後は" + str);
		
		LocalDate now = LocalDate.now();
		if(now.isAfter(d)) {
			System.out.println("nowはdより新しい");
		}
	}

}
