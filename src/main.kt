fun main (){

  var n1=10
    var n2=90
    var sum:Int?
    sum=n1+n2
    println("total: $sum")

  println("------------SUBTRACTON------------")
  println("enter input1: ")
  var n3= readLine()!!.toFloat()
  println("enter input2: ")
  var n4= readLine()!!.toFloat()
  var sum2:Float?
  sum2=n3-n4
  println("subtraction answer: $sum2")

  println("------------MULTIPLICATION------------")
  println("enter input1: ")
  var n5= readLine()!!.toFloat()
  println("enter input2: ")
  var n6= readLine()!!.toFloat()
  var sum3:Float?
  sum3=n5*n6
  println("multiplication answer: $sum3")

  println("------------DIVISION------------")
  println("enter input1: ")
  var n7= readLine()!!.toFloat()
  println("enter input2: ")
  var n8= readLine()!!.toFloat()
  var sum4:Float?
  sum4=n7/n8
  println("division answer: $sum4")


}   