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
public class AddressMessage implements MessageType {
    private static final String FIRST_NAME_INVALID = "First name invalid!";
    private static final String LAST_NAME_INVALID = "Last name invalid!";
    private static final String ADDRESS_LINE_INVALID = "Address invalid!";
    private static final String CITY_INVALID = "City invalid!";
    private static final String STATE_INVALID = "State invalid!";
    private static final String POSTAL_CODE_INVALID = "Zip Code invalid!";
    
    private String firstName;
    private String lastName;
    private String addressLine;
    private String city;
    private String state;
    private String postalCode;

    public AddressMessage(String firstName, String lastName, String addressLine, String city, String state, String postalCode) {
	setFirstName (firstName);
	setLastName(lastName);
	setAddressLine(addressLine);
	setCity(city);
	setState(state);
	setPostalCode(postalCode);
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	if (firstName == null) {
	    throw new IllegalArgumentException(FIRST_NAME_INVALID);
	}

	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	if (lastName == null) {
	    throw new IllegalArgumentException(LAST_NAME_INVALID);
	}

	this.lastName = lastName;
    }

    public String getAddressLine() {
	return addressLine;
    }

    public void setAddressLine(String addressLine) {
	if (addressLine == null) {
	    throw new IllegalArgumentException(ADDRESS_LINE_INVALID);
	}

	this.addressLine = addressLine;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	if (city == null) {
	    throw new IllegalArgumentException(CITY_INVALID);
	}

	this.city = city;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	if (state == null) {
	    throw new IllegalArgumentException(STATE_INVALID);
	}

	this.state = state;
    }

    public String getPostalCode() {
	return postalCode;
    }

    public void setPostalCode(String postalCode) {
	if (postalCode == null) {
	    throw new IllegalArgumentException(POSTAL_CODE_INVALID);
	}

	this.postalCode = postalCode;
    }

    @Override
    public String toString() {
	return firstName + " " + lastName + ", " + addressLine + ", " + city + ", " + state + ", " + postalCode;
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 97 * hash + Objects.hashCode(this.firstName);
	hash = 97 * hash + Objects.hashCode(this.lastName);
	hash = 97 * hash + Objects.hashCode(this.addressLine);
	hash = 97 * hash + Objects.hashCode(this.city);
	hash = 97 * hash + Objects.hashCode(this.state);
	hash = 97 * hash + Objects.hashCode(this.postalCode);
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
	final AddressMessage other = (AddressMessage) obj;
	if (!Objects.equals(this.firstName, other.firstName)) {
	    return false;
	}
	if (!Objects.equals(this.lastName, other.lastName)) {
	    return false;
	}
	if (!Objects.equals(this.addressLine, other.addressLine)) {
	    return false;
	}
	if (!Objects.equals(this.city, other.city)) {
	    return false;
	}
	if (!Objects.equals(this.state, other.state)) {
	    return false;
	}
	if (!Objects.equals(this.postalCode, other.postalCode)) {
	    return false;
	}
	return true;
    }
    
    
}
