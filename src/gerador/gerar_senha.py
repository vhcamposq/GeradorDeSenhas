import random
import string

def gerar_senha(comprimento):
    caracteres = string.ascii_letters + string.digits + string.punctuation
    senha = ''.join(random.choice(caracteres) for _ in range(comprimento))
    return senha

comprimento_senha = 12
senha_gerada = gerar_senha(comprimento_senha)
print(f"Senha gerada: {senha_gerada}")
