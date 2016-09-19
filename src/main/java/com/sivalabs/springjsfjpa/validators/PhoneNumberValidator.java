package com.sivalabs.springjsfjpa.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("phoneNumberValidator")
public class PhoneNumberValidator implements Validator {

	private final static String PHONE_NUMBER_PATTERN = "([0-9])?(\\d{10})?";

	private final static Pattern PHONE_NUMBER_COMPILED_PATTERN = Pattern.compile(PHONE_NUMBER_PATTERN);

	/**
	 * Validate method.
	 */
	public void validate(FacesContext fc, UIComponent c, Object o) throws ValidatorException {
		// No value is not ok
		if (o == null || "".equals((String) o)) {
			FacesMessage msg = new FacesMessage("No phone number value!", "Phone number Validation Error");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}

		// The email matcher
		Matcher matcher = PHONE_NUMBER_COMPILED_PATTERN.matcher((String) o);

		if (!matcher.matches()) { // Email doesn't match
			FacesMessage msg = new FacesMessage("Invalid phone number value!", "Phone number Validation Error");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}

	}
}
