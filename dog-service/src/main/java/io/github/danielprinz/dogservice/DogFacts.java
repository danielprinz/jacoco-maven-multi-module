package io.github.danielprinz.dogservice;

public class DogFacts {

	static final String FACT_1 = "Dogs are omnivores -- they eat meat, grains and vegetables.";
	static final String FACT_2 = "Dogs can hear 4 times as far as humans.";
	static final String NO_FACT_FOND = "No dog fact found.";

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
