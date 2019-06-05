package org.shaalakosh.school;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.json.JSONObject;

public class CustomOauthExceptionSerializer implements ExceptionMapper<UserOauthException>
{
    @Override
    public Response toResponse(UserOauthException exception)
    {
    	JSONObject jsonObject = new JSONObject();
    	jsonObject.put("error", "invalid_token");
    	jsonObject.put("error_description", exception.getMessage());
        return Response.status(Status.BAD_REQUEST).entity(jsonObject).build(); 
    }
}