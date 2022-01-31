package chapter2;

import java.util.Date;

public class List01 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1643633213041L);
		System.out.println("-------------------------");
		System.out.println(past);
		
	}

}
