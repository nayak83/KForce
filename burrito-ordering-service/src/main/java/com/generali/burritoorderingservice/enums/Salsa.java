package com.generali.burritoorderingservice.enums;

/**
 * Enum class for allowed order items in Salsa.
 * @author Rajesha
 *
 */
public enum Salsa {
	
	MILD("Mild"), 
	MEDIUM("Medium"), 
	HOT("Hot");
	
	public final String label;

    private Salsa(String label) {
        this.label = label;
    }
}
