function gerarSenha(comprimento) {
  const caracteres =
    'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+';
  let senha = '';

  for (let i = 0; i < comprimento; i++) {
    const indice = Math.floor(Math.random() * caracteres.length);
    senha += caracteres.charAt(indice);
  }

  return senha;
}

const comprimentoSenha = 12;
const senhaGerada = gerarSenha(comprimentoSenha);
console.log('Senha gerada: ' + senhaGerada);
