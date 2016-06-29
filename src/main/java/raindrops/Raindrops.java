package raindrops;

import java.security.InvalidParameterException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import primefactors.PrimeFactors;

public class Raindrops
{
	/**
	 * Converts input to desired String.
	 * Unit tests specify that prime factors should not be duplicated.
	 * @param input
	 * @return
	 */
	public static String convert(Integer input) {
		if ( input == null ) {
			throw new NullPointerException();
		} else if ( input < 0 ) {
			throw new InvalidParameterException();
		}
		
		List<Long> primeFactors = deduplicateList( PrimeFactors.getForNumber( input.longValue( ) ) );
		StringBuilder sb = new StringBuilder();

		for ( int i = 0 ; i < primeFactors.size( ) ; i++ ) {
			sb.append( checkFactor( primeFactors.get( i ) ) );
		}
		
		if ( sb.toString( ).isEmpty( ) ) {
			return input.toString( );
		} else {
			return sb.toString( );
		}
	}
	
	/**
	 * Checks the given factor to see if it matches one of the desired factors.
	 * Responds with an empty string if the factor does not match.
	 * @param factor
	 * @return
	 */
	public static String checkFactor(Long factor) {
		if ( factor == 3L ) {
			return "Pling";
		} else if ( factor == 5L ) {
			return "Plang";
		} else if ( factor == 7L ) {
			return "Plong";
		} else {
			return "";
		}
	}
	
	/**
	 * Removes duplicates.
	 * Inspired by: http://stackoverflow.com/questions/2849450/how-to-remove-duplicates-from-a-list
	 * @param input
	 * @return
	 */
	private static List<Long> deduplicateList( List<Long> input ) {
		Set<Long> dedupe = new LinkedHashSet<Long>(input);
		input.clear();
		input.addAll( dedupe );
		return input;
	}
}
