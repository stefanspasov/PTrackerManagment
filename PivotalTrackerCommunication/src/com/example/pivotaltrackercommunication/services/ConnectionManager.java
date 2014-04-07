package com.example.pivotaltrackercommunication.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConnectionManager {
    static HttpURLConnection connection = null;
	static URL targetURL;
	public static String getResponse(String URLatt, String methodType, String Token)
	{
		try{
		targetURL = new URL(URLatt);
		connection = (HttpURLConnection)targetURL.openConnection();
		connection.setRequestMethod(methodType);
		connection.setRequestProperty("X-TrackerToken", Token);
		
		java.io.InputStream is = connection.getInputStream();
		BufferedReader rd = new BufferedReader(new InputStreamReader(is));
		String line;
		StringBuffer response = new StringBuffer();
		while ((line = rd.readLine()) != null) {
			response.append(line);
			response.append('\r');
		}
		rd.close();
		
		return response.toString();
		}
		catch(Exception e){e.printStackTrace();};
		return "";
	}
}
