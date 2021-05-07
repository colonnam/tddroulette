package roulette;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Testroulette {
	
	  	@Test
	    public void isStopped() {
	        StateRoulette etat = mock(StateRoulette.class);
	        Roulette roulette = new Roulette(etat);

	        roulette.play(20000);
	        roulette.stop(20000);

	        verify(etat).stopped(anyInt());
	    }
	  

	    
	    @Test
	    public void testballlocation() {
	    	 StateRoulette etat = mock( StateRoulette.class);
	        Roulette roulette = new Roulette(etat);


	 
	        roulette.play(20000);
	        roulette.stop(20000);

	        verify(etat, times(1)).stopped(anyInt());
	    }
	    
	    @Test
	    public void locationonlyonstop() {
	    	 StateRoulette etat = mock( StateRoulette.class);
		        Roulette roulette = new Roulette(etat);

		      
		        roulette.play(20000);
		        roulette.stop(20000);
		        roulette.stop(20001);

	        verify(etat, times(1)).stopped(anyInt());
	    }
	    
	    @Test
	    public void nolocationonspin() {
	    	StateRoulette etat = mock( StateRoulette.class);
	        Roulette roulette = new Roulette(etat);

	      
	       roulette.play(20000);

	       
	       roulette.stop(10000);

	        verify(etat, never() ).stopped(anyInt());
	    }
	    


}
