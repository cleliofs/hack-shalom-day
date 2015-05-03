import scala.collection.mutable.ArrayBuffer

val l = List(3, 4, 1, 2, 1, 3)
l(1)
l(0)
l.sorted


var l2: ArrayBuffer[Int] = new ArrayBuffer[Int]();
l2+=3
l2+=4
l2+=1
l2+=2
l2+=3
l2

l eq l2

(0 to 100)