package com.generali.burritoorderingservice.enums;

/**
 * Enum class for allowed order items in Protein.
 * @author Rajesha
 *
 */
public enum Protein {
	BEAN("Bean"), 
	BEEF("Beef"), 
	CHICKEN("Chicken"), 
	PORK("Pork"), 
	SHRIMP("Shrimp"), 
	STEAK("Steak");
	
	public final String label;

    private Protein(String label) {
        this.label = label;
    }
}
