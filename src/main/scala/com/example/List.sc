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
(0 to 10).reduce(_+_)
l.foreach((i: Int) =>
  i match {
    case 3 => List(3)
    case _ =>
  }
)
def hasItemOnList(i: Int, l: List[Int]): Boolean = {
  l.contains(i)
}
def addItem(l: List[Int], res: ArrayBuffer[Int]): Unit = {
  if (l.isEmpty) return res
  else if (l.tail.contains(l.head)) {
    res+=l.head
  }

  addItem(l.tail, res)
}

//def addItem2(l: List[Int]): List[Int] = {
//  case head => ()
//  case head :: tail if (tail.contains(head)) => List(head)
//}
var res = new ArrayBuffer[Int]()
addItem(l, res)
res.toList

for (i <- (0 to l.length - 1).reverse) {
  println(s"i[$i] = ${l(i)}")
  for (j <- ((i+ 1) to l.length - 1).reverse) {
      println(s"j[$j] = ${l(j)}")
  }
}
val i = 10
((i+1) to 100).reverse.toList
l.head
l.tail.contains(l.head)
