package raindrops;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class RaindropsMoreTests
{
	@Test
	public void test_convert_NegativeInteger_ThrowsException( ) {
		try {
			Raindrops.convert( -10 );
			fail("Supposed to catch InvalidParameterException");
		} catch ( InvalidParameterException ipe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch InvalidParameterException");
		}
	}
	
	@Test
	public void test_convert_NullInteger_ThrowsException( ) {
		try {
			Raindrops.convert( null );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}
}
