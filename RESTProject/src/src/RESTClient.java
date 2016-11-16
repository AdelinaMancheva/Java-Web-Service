package src;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class RESTClient {

	/**
	 * @return String of type: {"C Value":32}
	 */
	public String getFtoCResponse(int fahr) {
		String output = new String();
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/RESTProject/myurl/ftocservice/" + fahr);
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("HTTP error code : " + response.getStatus());
			}
			output = response.getEntity(String.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * @return String of type: {"F Value":35}
	 */
	public String getCtoFResponse(int cels) {
		String output = new String();
		try {
			Client client = Client.create();
			WebResource webResource = client.resource("http://localhost:8080/RESTProject/myurl/ctofservice/" + cels);
			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("HTTP error code : " + response.getStatus());
			}
			output = response.getEntity(String.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return output;
	}
}