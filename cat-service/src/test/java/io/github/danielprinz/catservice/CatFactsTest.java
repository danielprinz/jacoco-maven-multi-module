package io.github.danielprinz.catservice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatFactsTest {

	private CatFacts catFacts = new CatFacts();

	@Test
	public void correctCatFactForId1IsReturned() {
		assertEquals(CatFacts.FACT_1, catFacts.getFact(1));
	}

	@Test
	public void correctCatFactForId2IsReturned() {
		assertEquals(CatFacts.FACT_2, catFacts.getFact(2));
	}
}
