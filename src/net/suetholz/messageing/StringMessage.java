/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.suetholz.messageing;

import java.util.Objects;
import net.suetholz.messageing.api.MessageType;

/**
 *
 * @author wsuetholz
 */
public class StringMessage implements MessageType {
    private static final String MESSAGE_IS_NULL = "Message parameter invalid!";
    private String message;
    
    public StringMessage(String message) {
	setMessage(message);
    }

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	if (message == null) {
	    throw new IllegalArgumentException(MESSAGE_IS_NULL);
	}
	this.message = message;
    }

    @Override
    public String toString() {
	return message;
    }

    @Override
    public int hashCode() {
	int hash = 3;
	hash = 29 * hash + Objects.hashCode(this.message);
	return hash;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final StringMessage other = (StringMessage) obj;
	if (!Objects.equals(this.message, other.message)) {
	    return false;
	}
	return true;
    }
    
    
}
