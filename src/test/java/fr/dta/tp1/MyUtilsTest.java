package fr.dta.tp1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsCollectionContaining.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsNull.*;
import static org.hamcrest.core.StringContains.*;

public class MyUtilsTest {

	@Test
	public final void testSum() {
		List<Integer> ints =Arrays.asList(1,2,3,4,5);
		int result=MyUtils.sum(ints);	
		Assert.assertEquals(15, result);	
	}

	@Test
	public final void testEmptyToNull_null() {
		Assert.assertEquals(null, MyUtils.emptyToNull(""));
	}
	
	@Test
	public final void testEmptyToNull() {
		Assert.assertEquals("azerty", MyUtils.emptyToNull("azerty"));
	}

	@Test
	public final void testFilterEvenNumbers() {
		List<Integer> ints =Arrays.asList(1,2,3,4,5,6);
		List<Integer> expectedList =Arrays.asList(2,4,6);
		
		Assert.assertEquals(expectedList, MyUtils.filterEvenNumbers(ints));
	}

	@Test
	public final void testFilterEvenNumbers_hasNumber() {
		List<Integer> ints =Arrays.asList(1,2,3,4,5,6);
		
		Assert.assertThat(MyUtils.filterEvenNumbers(ints), hasItem(4));
	}
	
	@Test
	public final void testTransformSquarePlusPointFive() {
		List<Integer> ints =Arrays.asList(1,2,3);
		List<Float> expectedList =Arrays.asList(1.5F,4.5F,9.5F);
		
		Assert.assertEquals(expectedList, MyUtils.transformSquarePlusPointFive(ints));
	}

}
