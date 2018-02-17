package Assignment_15

class partial_func {

  val sum = (a:Int, b:Int, c:Int) => a + b + c

  //it will accept only two integers as input
  val f = sum(_:Int,_:Int, 5)

  //squaring the output of f function
  def sum_val(value: Int): Long ={
    math.pow(value,2).toLong
  }

}

object Main_sum extends App {
  var exec = new partial_func

  var sum = exec.f(2,3)

  println("Square of " + sum + " is " + exec.sum_val(sum))
}
