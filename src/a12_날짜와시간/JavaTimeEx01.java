package a12_날짜와시간;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaTimeEx01 {

	public static void main(String[] args) {
		
		//날짜
		LocalDate curDate = LocalDate.now();//현재 날짜를 리턴
		System.out.println(curDate);		
		
		LocalDate targetDate = LocalDate.of(2023, 4, 17); //매개 변수의 값으로 주어진 날짜를 리턴
		System.out.println(targetDate);
		
		
		//시간
		LocalTime curTime = LocalTime.now(); //현재 시간을 리턴
		System.out.println(curTime);
		
		LocalTime targetTime = LocalTime.of(21, 8, 51, 3123323); //매개 변수의 값으로 주어진 시간을 리턴
		System.out.println(targetTime);
		
		
		//날짜와 시간
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println(curDateTime);
		
		
		//날짜와 시간 더하기 빼기
		System.out.println(curDateTime.minusYears(1)); //년 -
		System.out.println(curDateTime.plusYears(1)); //년 +
		System.out.println(curDateTime.minusMonths(1)); //월 -
		System.out.println(curDateTime.plusMonths(1)); //월 +
		System.out.println(curDateTime.minusDays(1)); //일 -
		System.out.println(curDateTime.plusDays(1)); //일 +
		System.out.println(curDateTime.minusHours(1)); //시 -
		System.out.println(curDateTime.plusHours(1)); //시 +
		System.out.println(curDateTime.minusMinutes(1)); //분 -
		System.out.println(curDateTime.plusMinutes(1)); //분 +
		System.out.println(curDateTime.minusSeconds(1)); //초 -
		System.out.println(curDateTime.plusSeconds(1)); //초 +  
		
		//시간 비교
		LocalTime startTime = LocalTime.now(); //21:32:50
		LocalTime endTime = LocalTime.of(22, 22, 22); //22: 22: 22
		
		System.out.println(startTime.isBefore(endTime)); //startTime이 endTime보다 이전 시간인지 비교
		System.out.println(startTime.isAfter(endTime)); //startTime이 endTime보다 이후 시간인지 비교
		
		
		//시간 차이 계산
		Duration d = Duration.between(startTime, endTime);
		System.out.println(d.getSeconds());
		
		
		//날짜 차이 계산
		LocalDate startDate = LocalDate.now(); //2022-04-17
		LocalDate endDate = LocalDate.of(2020, 2, 2); //2020-02-02
		
		Period p = Period.between(startDate, endDate);
		System.out.println(p.getYears()); //2년 차이
		System.out.println(p.getMonths()); //2개월 차이
		System.out.println(p.getDays()); //15일 차이
		
		//전체 시간을 기준으로 차이 계산
		System.out.println(ChronoUnit.YEARS.between(startDate, endDate));
		System.out.println(ChronoUnit.MONTHS.between(startDate, endDate));
		System.out.println(ChronoUnit.DAYS.between(startDate, endDate));
		
		
		
		//형식 포맷
		LocalDateTime curDateTime2 = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String now = curDateTime2.format(format);
		System.out.println(now);
		
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
				
	
	}
}
