package edu.nccu.misdu.stu103306037.hw6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class KeywordCounter {
	private String urlStr;
	private String content;

	public KeywordCounter(String urlStr) {
		this.urlStr = urlStr;

	}

	private String fetchCountent() throws IOException {
		URL url = new URL(this.urlStr);
		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(in,
				"UTF-8"));

		String retVal = "";
		String line = null;
		while ((line = br.readLine()) != null) {

			retVal += (line + "\n");

		}
		return retVal;

	}

	public int countKeyword(String keyword) throws IOException {
		if (content == null) {
			content = fetchCountent();
		}
		int retVal = 0;
		int fromIdx = 0;
		int found = -1;
		while ((found = content.indexOf(keyword, fromIdx)) != -1) {
			// type type = (type) (found = content.nextElement();
			retVal++;
			fromIdx = found + keyword.length();
		}
		return retVal;
	}

}