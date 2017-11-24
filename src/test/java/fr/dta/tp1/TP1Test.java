package fr.dta.tp1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TP1Test {

	private MyIpService myIpService;
	private HttpDataService httpDataService;

	@Before
	public void before() {
		//httpDataService = new HttpDataService();
		//myIpService= new MyIpService(httpDataService);
		
		httpDataService = Mockito.mock(HttpDataService.class);
		Mockito.when(httpDataService.getJsonIp()).thenReturn("{\"ip\":\"92.154.66.22\",\"about\":\"/about\",\"Pro!\":\"http://getjsonip.com\",\"reject-fascism\":\"Support the ACLU: https://action.aclu.org/secure/donate-to-aclu\"}");
		myIpService= new MyIpService(httpDataService);
	}

	@Test
	public void testGetMyIp() {
		String ip=myIpService.getMyIp();
		
		Assert.assertEquals("92.154.66.22", ip);
	}


}
