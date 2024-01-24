import java.security.SecureRandom

fun main() {
    val comprimentoSenha = 12
    val senhaGerada = gerarSenha(comprimentoSenha)
    println("Senha gerada: $senhaGerada")
}

fun gerarSenha(comprimento: Int): String {
    val caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+"
    val random = SecureRandom()

    val senha = StringBuilder(comprimento)
    repeat(comprimento) {
        val indice = random.nextInt(caracteres.length)
        senha.append(caracteres[indice])
    }

    return senha.toString()
}
