package org.shaalakosh.school;

import java.io.Serializable;

import javax.servlet.ServletException;

public class UserOauthException extends ServletException implements Serializable
{
    private static final long serialVersionUID = 1L;
    public UserOauthException() {
        super();
    }
    public UserOauthException(String msg)   {
        super(msg);
    }
    public UserOauthException(String msg, Exception e)  {
        super(msg, e);
    }
}
