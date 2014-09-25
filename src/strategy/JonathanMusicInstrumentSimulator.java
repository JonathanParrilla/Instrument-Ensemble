//Jonathan Parrilla - Lab 6

package strategy;
import java.util.ArrayList;

public class JonathanMusicInstrumentSimulator {

	public static void main(String[] args) 
	{
	    // Create an array list that servers as my ensemble. 
		//This array list will hold instrument objects.
		ArrayList<Instrument> ensemble = new ArrayList<Instrument>();
		
		//Add a Violin to the ensemble
		ensemble.add( new Violin() );
		
		//Add a Tuba to the ensemble
		ensemble.add( new Tuba() );
		
		//Add a Clarinet to the ensemble
		ensemble.add( new Clarinet() );
		
		//Add a Harp to the ensemble
		ensemble.add( new Harp() );
		
		//Add a Double Bass to the ensemble
		ensemble.add( new DoubleBass() );

		//Now go through  the instruments in the ensemble.
		//For each instrument, display what it is, and play the instrument.
		for( Instrument I : ensemble)
		{
			I.display();
			//I.performInstrument();
			I.performPlay();
			System.out.println();
		}				
	}	

}
