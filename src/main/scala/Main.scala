import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val lista : ArrayBuffer[Int] = ArrayBuffer(1,2,3,4,5,6)
  println(lista.mkString(", "))
  lista.addOne(7)
  print(lista.mkString(", "))
}