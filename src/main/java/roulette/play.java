package roulette;

import static org.mockito.Mockito.mock;

public class play {

	public static void main(String[] args) {
		int number = 37; 
		int plays = 100;
		
		int win=0;
		int invest=0;
		int benefit=0;
		
		for (int i=0;i<plays;i++)		{
			Player p= new Player(i+1,number);
			StateRoulette etat = mock(StateRoulette.class);
			Roulette r= new Roulette(etat);
			
			invest+=i;
			
			r.play(10000);
			ResultRoulette result=r.stop(10000);
			System.out.println("the result is : "+result.getNumber()+" and your bet was on : "+ p.getnumber()); 
			if(result.getNumber().equals(p.getnumber())) {
				System.out.println("you won :"+p.getmise()*36);
				win++;
				benefit+=+p.getmise()*36;
			}
			else
				System.out.println("you lost :"+p.getmise());
	
		}
		System.out.println("number of win :"+win+"\n-->benefit : "+ (benefit - invest)+"$");
	}
}
