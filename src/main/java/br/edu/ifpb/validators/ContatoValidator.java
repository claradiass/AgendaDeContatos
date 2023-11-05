package br.edu.ifpb.validators;

import br.edu.ifpb.repository.PacienteRepository;
import br.edu.ifpb.service.PacienteService;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContatoValidator implements Validator<String> {
    private final PacienteService pacienteService = new PacienteService(PacienteRepository.getInstance());
    private final boolean checkIfExists;

    public ContatoValidator(boolean checkIfExists) {
        this.checkIfExists = checkIfExists;
    }

    @Override
    public boolean validate(String contato) {
        String contatoPattern = "\\(\\d{2}\\)\\d{5}-\\d{4}";

        // Use the Pattern and Matcher classes to perform the match
        Pattern pattern = Pattern.compile(contatoPattern);
        Matcher matcher = pattern.matcher(contato);

        return matcher.matches() && (!checkIfExists || !contatoService.existe(contato));
    }
}
