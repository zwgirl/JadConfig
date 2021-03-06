package com.github.joschi.jadconfig.validators;

import com.github.joschi.jadconfig.ValidationException;
import com.github.joschi.jadconfig.Validator;

/**
 * {@link com.github.joschi.jadconfig.Validator} class which checks if the named parameter is a valid UDP/TCP port (0-65535).
 *
 * @author jschalanda
 */
public class InetPortValidator implements Validator<Integer> {

    /**
     * Validates if the value {@literal value} the of provided configuration parameter {@literal name} is a valid
     * UDP/TCP port (0-65535)
     *
     * @param name  The name of the configuration parameter
     * @param value The value of the configuration validator
     * @throws ValidationException If the value {@literal value} configuration parameter {@literal name} can't be parsed
     *                             as an {@literal int} or is not in the range of 0-65535.
     */
    @Override
    public void validate(String name, Integer value) throws ValidationException {
        if (value != null && (value < 0 || value > 65535)) {
            throw new ValidationException("Parameter " + name + " should be within range 0-65535 (found " + value + ")");
        }
    }
}
