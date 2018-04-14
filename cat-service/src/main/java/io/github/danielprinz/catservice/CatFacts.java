package io.github.danielprinz.catservice;

public class CatFacts {

	static final String FACT_1 = "On average, cats spend 2/3 of every day sleeping.";
	static final String FACT_2 = "A cat's hearing is better than a dog's.";
	static final String NO_FACT_FOND = "No cat fact found.";

	public String getFact(int id) {
		switch (id) {
		case 1:
			return FACT_1;
		case 2:
			return FACT_2;
		default:
			return NO_FACT_FOND;
		}
	}
}
