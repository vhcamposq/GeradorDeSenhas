package gerador;

import java.security.SecureRandom;

public class GeradorDeSenha {

    public static void main(String[] args) {
        int comprimentoSenha = 12;
        String senhaGerada = gerarSenha(comprimentoSenha);
        System.out.println("Senha gerada: " + senhaGerada);
    }

    public static String gerarSenha(int comprimento) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();

        StringBuilder senha = new StringBuilder(comprimento);
        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        return senha.toString();
    }
}
