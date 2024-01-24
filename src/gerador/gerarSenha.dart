import 'dart:math';

void main() {
  int comprimentoSenha = 12;
  String senhaGerada = gerarSenha(comprimentoSenha);
  print('Senha gerada: $senhaGerada');
}

String gerarSenha(int comprimento) {
  String caracteres =
      'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#\$%^&*()-_=+';
  Random random = Random();

  StringBuffer senha = StringBuffer();
  for (int i = 0; i < comprimento; i++) {
    int indice = random.nextInt(caracteres.length);
    senha.write(caracteres[indice]);
  }

  return senha.toString();
}
