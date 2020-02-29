package main.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import main.java.Calculator;

public class CalTest {
	Calculator x;

	@Test
	public void Both_Positive() {
		x=new Calculator();

		double add=x.add(21.1, 2);
		assertTrue("two input are positive and the result must be positive", add>0);


	}

	@Test
	public void Both_Negative() {
		x=new Calculator();
		double add=x.add(-1, -1);
		assertTrue("both input are negative ->output should be negative", add<0);

	}
	public void Both_Zero() {
		x=new Calculator();


		double add=x.add(0, 0);
		assertTrue("both zeros and output shoudl be zero",0.0==add);


	}
	@Test
	public void Have_Diff_Sign() {

		x=new Calculator();
		double para1=-15;
		double para2=10;
		double add=x.add(para1, para2);

		if(para1<0&&(Math.abs(para1)>Math.abs(para2))) {

			assertTrue("the result should be negative",add<0);
		}
		else {
			assertTrue("the result should be positive",add>0);

		}



	}

}
