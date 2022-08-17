package com.valleybee.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String andOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {
        andOfEmail = checkEmail.value();

    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {
        return enteredValue.endsWith(andOfEmail);
    }
}
