package com.chen.study.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyCustomConstraintValidator implements ConstraintValidator<MyCustomConstaint,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (!s.equals("北京")){
            return false;
        }
        return true;
    }
}
