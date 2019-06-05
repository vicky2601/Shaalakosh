package org.shaalakosh.auth.config;

import java.io.IOException;
import java.util.Map;

import org.shaalakosh.auth.constant.StatusMaster;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;



public class CustomOauthExceptionSerializer extends StdSerializer<UserOauthException> {

	private static final long serialVersionUID = 1L;

	public CustomOauthExceptionSerializer() {
		super(UserOauthException.class);
	}

	@Override
	public void serialize(UserOauthException value, JsonGenerator gen, SerializerProvider provider)
			throws IOException {
		gen.writeStartObject();
		System.out.println("========================" + value.getMessage());
		if (value.getMessage().equalsIgnoreCase("Block Users")) {
			gen.writeStringField("error", "" + StatusMaster.BLOCKED_USER.getResponseCode());
			gen.writeStringField("error_description", "" + StatusMaster.BLOCKED_USER.getResponseDescription());
		} else {
			gen.writeStringField("error", "" + StatusMaster.INVALID_USER_NAME_PASSWORD.getResponseCode());
			gen.writeStringField("error_description",
					"" + StatusMaster.INVALID_USER_NAME_PASSWORD.getResponseDescription());
		}
		if (value.getAdditionalInformation() != null) {
			for (Map.Entry<String, String> entry : value.getAdditionalInformation().entrySet()) {
				String key = entry.getKey();
				String add = entry.getValue();
				gen.writeStringField(key, add);
			}
		}
		gen.writeEndObject();
	}
}
