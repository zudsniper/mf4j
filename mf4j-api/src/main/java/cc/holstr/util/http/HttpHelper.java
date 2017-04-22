package cc.holstr.util.http;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Jason McElhenney on unknown.
 * zudsniper on GitHub.
 */

public class HttpHelper {

	/**
	 * Charset used for requests.
	 */
	private static final String CHARSET = "UTF-8";

	/**
	 * Perform a GET request onto a web address.
	 *
	 * @param url The web address of which is to be connected to.
	 *
	 * @return An InputStream containing the response from querying the web address specified.
	 * @throws Exception if a connection fails
	 */
	public static InputStream get(String url) throws Exception {
		//http GET
		boolean failed = false;
		URLConnection connection = new URL(url).openConnection();
		connection.setRequestProperty("accept-charset", CHARSET);
		connection.setRequestProperty("content-length", "0");

		return connection.getInputStream();
	}

	/**
	 * Perform a POST request onto a web address.
	 *
	 * @param url        The web address of which is to be connected to.
	 * @param jsonString String of json to be sent in the POST request.
	 *
	 * @return An InputStream containing the response from querying the web address specified.
	 * @throws Exception if a connection fails
	 */
	public static InputStream post(String url, String jsonString) throws Exception {
		//http POST
		boolean failed = false;
		URLConnection connection = new URL(url).openConnection();
		connection.setDoOutput(true); // Triggers POST.
		connection.setRequestProperty("accept-charset", CHARSET);
		connection.setRequestProperty("content-type", "application/json;charset=" + CHARSET);
		connection.setRequestProperty("content-length", "" + jsonString.length());

		try(OutputStream output = connection.getOutputStream()) {
			output.write(jsonString.getBytes(CHARSET));
		} catch(Exception e) {
			failed = true;
			e.printStackTrace();
		}

		return connection.getInputStream();
	}

	/**
	 * Perform a PUT request onto a web address.
	 *
	 * @param url        The web address of which is to be connected to.
	 * @param jsonString String of json to be sent in the POST request.
	 *
	 * @return An InputStream containing the response from querying the web address specified.
	 * @throws Exception if a connection fails
	 */
	public static InputStream put(String url, String jsonString) throws Exception {
		//http PUT
		boolean failed = false;
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setDoOutput(true);
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("accept-charset", CHARSET);
		connection.setRequestProperty("content-type", "application/json;charset=" + CHARSET);
		connection.setRequestProperty("content-length", "" + jsonString.length());

		try(OutputStream output = connection.getOutputStream()) {
			output.write(jsonString.getBytes(CHARSET));
		} catch(Exception e) {
			failed = true;
			e.printStackTrace();
		}

		return connection.getInputStream();
	}
}
