package roulette;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestResultRoulette {
	
	 @Test
	 public void colorisred() {
		 ResultRoulette r= new ResultRoulette(1);
		 Assertions.assertEquals("red",r.getColor());
	 }
	 @Test
	 public void colorisblack() {
		 ResultRoulette r= new ResultRoulette(2);
		 Assertions.assertEquals("black",r.getColor());
	 }
	 @Test
	 public void colorisgreen() {
		 ResultRoulette r= new ResultRoulette(0);
		 Assertions.assertEquals("green",r.getColor());
	 }
	 
	 @Test
	 public void isimpair() {
		 ResultRoulette r= new ResultRoulette(1);
		 Assertions.assertEquals("impair",r.getParity());
	 }
	 @Test
	 public void ispair() {
		 ResultRoulette r= new ResultRoulette(2);
		 Assertions.assertEquals("pair",r.getParity());
	 }
	 @Test
	 public void isnone() {
		 ResultRoulette r= new ResultRoulette(0);
		 Assertions.assertEquals("none",r.getParity());
	 }

}
