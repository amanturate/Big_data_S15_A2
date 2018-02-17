package Assignment_15

class print_price(input:String) {

  input match {
    case "1" => println("Android-12999")
    case "2" => println("Big Data Development-17999")
    case "3" => println("Big Data Development-17999")
    case "4" => println("Spark-19999")
    case _ => println("Please enter a valid input")
  }
}


object main_function extends App{
  var inp = ""
  println("Please enter a input(1/2/3/4): ")
  inp = scala.io.StdIn.readLine()
  var price = new print_price(inp)
}
