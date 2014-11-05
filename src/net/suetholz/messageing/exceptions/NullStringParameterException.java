/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing.exceptions;

/**
 *
 * @author wsuetholz
 */
public class NullStringParameterException extends IllegalArgumentException {
    private static final String exceptionString = "Invalid Parameter!  NULL Pointer Exception!";
    
    public NullStringParameterException() {
	super (exceptionString);
    }

    public NullStringParameterException(String s) {
	super(exceptionString);
    }

    public NullStringParameterException(String message, Throwable cause) {
	super(exceptionString, cause);
    }

    public NullStringParameterException(Throwable cause) {
	super(exceptionString, cause);
    }

}
