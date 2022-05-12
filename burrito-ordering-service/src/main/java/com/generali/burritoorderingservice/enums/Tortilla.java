package com.generali.burritoorderingservice.enums;


/**
 * Enum class for allowed order items in Tortilla.
 * @author Rajesha
 *
 */public enum Tortilla {
	
	CORN ("Corn"), 
	FLOUR ("Flour");
	
	public final String label;

    private Tortilla(String label) {
        this.label = label;
    }
}
