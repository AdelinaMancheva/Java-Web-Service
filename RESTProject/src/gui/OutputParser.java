package gui;

import src.RESTClient;

public class OutputParser {

	private RESTClient restClient;
	
	public OutputParser(){
		restClient = new RESTClient();
	}

	public String parseOutput(String output) {
		String[] arr = output.split(":");

		StringBuilder builder = new StringBuilder(arr[1]);
		builder.deleteCharAt(builder.length() - 1);
		return builder.toString();
	}

	public String getOutputFtoC(int input) {
		String resp = restClient.getFtoCResponse(input);

		return parseOutput(resp);
	}

	public String getOutputCtoF(int input) {
		String resp = restClient.getCtoFResponse(input);

		return parseOutput(resp);
	}
}
