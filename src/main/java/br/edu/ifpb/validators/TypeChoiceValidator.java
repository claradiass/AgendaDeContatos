package br.edu.ifpb.validators;


public class TypeChoiceValidator implements Validator<Integer> {
    @Override
    public boolean validate(Integer choice) {
        return choice >= 1 && choice <= 3;
    }
}