import scala.collection.mutable.ArrayBuffer


object Main extends App {
 val Usuario1 = new Usuario("Caique", "0000000", "Salvador")
 val time1 = new Times("Vitoria", "Bahia")
 Usuario1.AdicionarTimes(timeProps = time1 )
 Usuario1.ListarTimes()
}