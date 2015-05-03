package main.scala.com.example

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by clelio on 03/05/15.
 */
object ListOperations extends App {

  def hasDuplicatesUsingSet(l: List[Int]): Boolean = {
    val mySet: mutable.HashSet[Int] = new mutable.HashSet[Int]()
    l.foreach(mySet add)
    l.length != mySet.size
  }

  val l1: List[Int] = List(3, 4, 1, 2, 1, 3)
  println(hasDuplicatesUsingSet(l1))

  val l2: List[Int] = List(3, 4, 1, 2)
  println(hasDuplicatesUsingSet(l2))

  def addItem(l: List[Int], res: ArrayBuffer[Int]): Unit = {
    if (l.isEmpty) return res

    if (l.tail.contains(l.head)) res+=l.head

    addItem(l.tail, res)
  }

  var res = new ArrayBuffer[Int]()
  addItem(l1, res)
  println(res.toList.sorted)
}
