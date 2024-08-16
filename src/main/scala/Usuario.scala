import scala.collection.mutable.ArrayBuffer

class Usuario( nomeProps: String, cpfProps: String, cidadeProps : String){
    val nome : String = nomeProps;
    val cpf: String = cpfProps;
    val cidade : String = cidadeProps;
    var listaTimes : ArrayBuffer[Times] = ArrayBuffer();

    def ListarTimes () : Unit = {
        println(s" A lista de time do usuario: ${this.nome}")
        for (i <- listaTimes){
            println(s" Time: ${i.nome}, estado: ${i.estado}")
        }
    }
    def AdicionarTimes (timeProps : Times) : Unit = {
        listaTimes += timeProps
    }

};