package com.github.joschi.jadconfig.validators;

import com.github.joschi.jadconfig.ValidationException;
import com.github.joschi.jadconfig.Validator;

import java.nio.file.Files;
import java.nio.file.Path;

public class PathWritableValidator implements Validator<Path> {

    @Override
    public void validate(String name, Path value) throws ValidationException {
        if (value == null || (Files.isWritable(value))) {
            return;
        }
        throw new ValidationException("Cannot write to " + name + " at path " + value + ". Please specify the correct path or change the permissions");
    }
}