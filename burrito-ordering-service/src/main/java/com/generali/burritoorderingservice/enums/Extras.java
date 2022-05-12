package com.generali.burritoorderingservice.enums;

/**
 * Enum class for allowed order items in Extras.
 * @author Rajesha
 *
 */
public enum Extras {
	AVOCADO("Avocado");
	
	public final String label;

    private Extras(String label) {
        this.label = label;
    }
}
