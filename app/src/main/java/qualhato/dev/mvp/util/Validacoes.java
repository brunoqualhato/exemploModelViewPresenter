package qualhato.dev.mvp.util;

public class Validacoes {

    public boolean validarEmail(String email){

        return email.contains("@") && email.contains(".")  && email.indexOf("@")>=5;
    }
}
