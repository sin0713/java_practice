package chapter2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class List02 {
	public static void main(String[] args) {
		Instant i1 = Instant.now();
		Instant i2 = Instant.ofEpochMilli(31920291332L);
		System.out.println(i2);
		long l = i2.toEpochMilli();
		System.out.println(l);
		System.out.println("----------------------------------------");
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);
		ZonedDateTime z2 = ZonedDateTime.of(2014,  1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println(z2);
		System.out.println("-----------------------------------------");
		
		Instant i3 = z2.toInstant();
		System.out.println(i3);
		
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println(z3);
		System.out.println("--------------------------------------");
		
		System.out.println("東京:" + z2.getYear() +  z2.getMonthValue() + " " + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonthValue()  + " " +  z3.getDayOfMonth());
		
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
		
		
		
		
		
	}

}
