package edu.escuelaing.arep.Networking;

import java.util.ArrayList;
import java.util.List;

import edu.escuelaing.arep.Networking.Square.EchoServerSquare;
import edu.escuelaing.arep.Networking.Url.URLReader;
import edu.escuelaing.arep.Networking.Url.URLScanner;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for networking.
 */
public class NetworkingTest 
    extends TestCase
{
	/**
	 * this test checks the square of a number
	 */
    public void testSquare() 
    {
    	EchoServerSquare serverSquare = new EchoServerSquare();
        assertEquals(serverSquare.calculateSquare("4"),"16.0");
     
    }
   /**
    * this test reads the data from the url and saves it to a file that is generated called resultado.html
    * @throws Exception The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
    */
    public void testURLReader() throws Exception 
    {
    	URLReader urlReader = new URLReader();
    	String[] array = {"http://www.google.com/"};
    	urlReader.main(array);
    }
    /**
     * this test checks the return of all 8 methods in urlscanner
     * @throws Exception The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
     */
    public void testURLScanner() throws Exception 
    {
    	URLScanner urlScanner = new URLScanner();
    	String[] array = {"http://ldbn.escuelaing.edu.co:80/publicaciones.pdf?val=456r=78#publicaciones"};
    	assertEquals("ref: http"
    	    	+"authority: ldbn.escuelaing.edu.co:80"
    	    	+"host: ldbn.escuelaing.edu.co"
    	    	+"port: 80"
    	    	+"path: /publicaciones.pdf"
    	    	+"query: val=456r=78"
    	    	+"file: /publicaciones.pdf?val=456r=78"
    	    	+"ref: publicaciones",urlScanner.methodsValue(array[0]));
    	
    }
}
