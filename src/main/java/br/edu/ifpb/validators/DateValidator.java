package br.edu.ifpb.validators;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator implements Validator<String> {
    @Override
<<<<<<< HEAD
    public boolean validate(String aniversario) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.parse(aniversario);
=======
    public boolean validate(String data) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.parse(data);
>>>>>>> 0d7b3ba90f0da7e367c305597dfca5a45903112f

            return true;
        } catch (ParseException e) {
            return false;
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 0d7b3ba90f0da7e367c305597dfca5a45903112f
