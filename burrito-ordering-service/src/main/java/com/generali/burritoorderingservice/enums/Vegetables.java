package com.generali.burritoorderingservice.enums;

/**
 * Enum class for allowed order items in Vegetables.
 * @author Rajesha
 *
 */
public enum Vegetables {
	
	CABBAGE("Cabbage"), 
	CORN("Corn"), 
	JALAPENOS("Jalapenos");
	
	public final String label;

    private Vegetables(String label) {
        this.label = label;
    }
}
