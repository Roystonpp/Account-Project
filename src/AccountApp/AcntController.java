package AccountApp;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/stock")
public class AcntController 
{

	@Inject
	private AcntService acntService;
	
	
}
