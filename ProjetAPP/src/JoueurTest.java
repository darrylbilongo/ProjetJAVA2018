import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class JoueurTest {

	@Test
	void testMain() {
		// Simulons une partie 
		
		Joueur joueur1 = new Joueur("Toto");	
		Joueur joueur2 = new Joueur("Line");
			
		joueur1.setMain(true);
		assertTrue(joueur1.isMain());
		joueur2.passerMain(joueur2);
		assertTrue(joueur2.isMain());
		
		//
	}
	
	@Test
	public void testToString() {
		Joueur j = new Joueur("Dewulf", "Arnaud", "darnaud", "M");
		j.pointsPlus();
		assertEquals("Nom: Dewulf\nPrénom: Arnaud\nPseudo: darnaud\nPoints: 50", j.toString());
	}
	
	@Test
	public void testPoints() {
		Joueur j = new Joueur("Darryl");
		j.pointsPlus();
		assertEquals(50, j.getPoints());	
	}

}
