fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Por favor informar um valor")
        return
    }
    val numero = argumentos[0].toIntOrNull()

    if( numero == null ){
        println("O valor não é válido")
        return
    }

    println("O número digitado foi $numero")


    var soma = 0
    soma = numero + numero
    println("A soma de numero + numero é de: $soma")

}