package src;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/ctofservice")
public class CtoFService {

	@Path("{c}")
	@GET
	@Produces("application/json")
	public Response convertCtoFfromInput(@PathParam("c") int c) throws JSONException {

		JSONObject jsonObject = new JSONObject();

		int fahrenheit = ((c * 9) / 5) + 32;
		jsonObject.put("F Value", fahrenheit);

		String result = "" + jsonObject;
		return Response.status(200).entity(result).build();
	}

}