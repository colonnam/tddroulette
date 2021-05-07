package roulette;
import java.util.Random;
public class Roulette {
	
    private boolean spinning = false;
    private final StateRoulette etat;
    private long spinForMs;
    private long currentMs = 0;
    private final Random random = new Random();
	
    Roulette(final StateRoulette etat) {
        this.etat = etat;
    }

	public void play(int i) {
		 this.spinning = true;
	     this.spinForMs = i;
		
	}

	public ResultRoulette stop(int i) {
		 currentMs = i;
	        if (spinning && currentMs >= spinForMs)
	        {
	            spinning = false;
	            final int location = random.nextInt(38);
	            this.etat.stopped(location);
	            return new ResultRoulette(location);
	        }
	        return null;
	    }
		
	}

