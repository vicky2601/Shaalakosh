package org.shaalakosh.school.utility;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletContext;

import org.springframework.http.MediaType;

public class CommonUtility {

	public static MediaType getMediaTypeForFileName(ServletContext servletContext, String fileName) {
		// application/pdf
		// application/xml
		// image/gif, ...
		String mineType = servletContext.getMimeType(fileName);
		try {
			MediaType mediaType = MediaType.parseMediaType(mineType);
			return mediaType;
		} catch (Exception e) {
			return MediaType.APPLICATION_OCTET_STREAM;
		}
	}

	public static Date getCurrentDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:SSS");
		LocalDateTime currentDateTime = LocalDateTime.now();
		Instant instant = currentDateTime.toInstant(ZoneOffset.UTC);
		return Date.from(instant);
	}

}
