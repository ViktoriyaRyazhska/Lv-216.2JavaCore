import static org.junit.Assert.*;

import org.junit.Test;

import HomeWork4Task1.HTTPError;
import HomeWork4Task1.WriteNameOfHTTPErrorsTaskC;


public class WriteNameOfHTTPErrorsTests {

	@Test
	public void badRequestErrorCodetest() {
		assertEquals(HTTPError.BADREQUEST.toString(), WriteNameOfHTTPErrorsTaskC.recogniseHTTPErrorCode(400));
	}
	
	@Test
	public void forbiddenErrorCodetest() {
		assertEquals(HTTPError.FORBIDDEN.toString(), WriteNameOfHTTPErrorsTaskC.recogniseHTTPErrorCode(403));
	}
	
	@Test
	public void unknownErrorCodetest() {
		assertEquals("Incorrect Error Code!", WriteNameOfHTTPErrorsTaskC.recogniseHTTPErrorCode(598));
	}

}
