package com.springmvc.validation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RUNTIME)
@Constraint(validatedBy = StartsWithValidator.class)

public @interface StartsWith {
	
	// Type mismatch: cannot convert from Class<StartsWithValidator> to Class<? extends ConstraintValidator<?,?>>[]
	// EndPoint: @StartsWith(prefix="XAB", message="Must start with XAB")

	public String prefix() default "";
	
	public String message() default "";
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
}
