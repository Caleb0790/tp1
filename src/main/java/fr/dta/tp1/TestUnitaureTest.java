package fr.dta.tp1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class TestUnitaureTest {

	@Test
	public void testEstDivisiblePar3par5OuLesDeux_null() {
		Assert.assertEquals(Collections.emptyList(), TestUnitaure.estDivisiblePar3par5OuLesDeux(0));
	}
	
	@Test
	public void testEstDivisiblePar3par5OuLesDeux_par3() {	
		List<Integer> ints=Arrays.asList(3);
		Assert.assertEquals( ints, TestUnitaure.estDivisiblePar3par5OuLesDeux(3));
	}
	
	@Test
	public void testEstDivisiblePar3par5OuLesDeux_par5() {
		List<Integer> ints=Arrays.asList(5);
		Assert.assertEquals( ints, TestUnitaure.estDivisiblePar3par5OuLesDeux(10));
	}
	@Test
	public void testEstDivisiblePar3par5OuLesDeux_par3et5() {
		List<Integer> ints=Arrays.asList(3,5);
		Assert.assertEquals( ints, TestUnitaure.estDivisiblePar3par5OuLesDeux(15));
	}

}
