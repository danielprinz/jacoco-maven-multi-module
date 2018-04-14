package io.github.danielprinz.dogservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DogFactsTest {

	private DogFacts dogFacts = new DogFacts();

	@Test
	public void correctCatFactForId1IsReturned() {
		assertEquals(DogFacts.FACT_1, dogFacts.getFact(1));
	}

	@Test
	public void correctCatFactForId2IsReturned() {
		assertEquals(DogFacts.FACT_2, dogFacts.getFact(2));
	}

	@Test
	public void forId13NoDogFactIsReturned() {
		assertEquals(DogFacts.NO_FACT_FOND, dogFacts.getFact(13));
	}
}
