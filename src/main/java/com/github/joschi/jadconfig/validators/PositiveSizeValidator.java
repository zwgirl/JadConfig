package com.github.joschi.jadconfig.validators;

import com.github.joschi.jadconfig.ValidationException;
import com.github.joschi.jadconfig.Validator;
import com.github.joschi.jadconfig.util.Size;

/**
 * {@link Validator} class which checks if the named parameter is a positive {@link Size}.
 *
 * @author jschalanda
 */
public class PositiveSizeValidator implements Validator<Size> {

    /**
     * Validates if the value {@literal value} the of provided configuration parameter {@literal name} is a positive
     * {@link Size}
     *
     * @param name  The name of the configuration parameter
     * @param value The value of the configuration validator
     * @throws ValidationException If the value {@literal value} configuration parameter {@literal name} can't be parsed
     *                             as an {@link Size} or is negative.
     */
    @Override
    public void validate(final String name, final Size value) throws ValidationException {
        if (value != null && value.getQuantity() < 0L) {
            throw new ValidationException("Parameter " + name + " should be positive (found " + value + ")");
        }
    }
}
