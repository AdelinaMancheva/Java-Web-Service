package src;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/ftocservice")
public class FtoCService {

	@Path("{f}")
	@GET
	@Produces("application/json")
	public Response convertFtoCfromInput(@PathParam("f") int f) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		int celsius = (f - 32) * 5 / 9;
		jsonObject.put("C Value", celsius);

		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}
}