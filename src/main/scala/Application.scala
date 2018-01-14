
import org.apache.log4j.Logger

object Application {
  def main(args: Array[String]) {

    val log = Logger.getLogger(this.getClass)
    val operation = new Operation

    val number1 = -1
    val number2 = -2
    val number3 = -3
    val number4 = -4

    val square = (firstVal: Int, secondVal: Int) => firstVal * firstVal + secondVal * secondVal
    val cubes = (firstVal: Int, secondVal: Int) => firstVal * firstVal * firstVal + secondVal * secondVal * secondVal
    val ints = (firstVal: Int, secondVal: Int) => firstVal + secondVal

    val sum = (fisrt: Int, second: Int) => fisrt + second
    val multi = (fisrt: Int, second: Int) => fisrt * second
    val max = (fisrt: Int, second: Int) => if (fisrt > second) fisrt else second

    log.info(operation.sum(cubes, number1, number2) + "\n")
    log.info(operation.sum(square, number1, number2) + "\n")
    log.info(operation.sum(ints, number3, number4) + "\n")
    log.info(operation.pascal(0, 1) + "\n")
    log.info(operation.pascal(1, 2) + "\n")
    log.info(operation.pascal(1, 3) + "\n")

    log.info(operation.operateList(List(number1, number2, number3, number4), "sum", sum) + "\n")
    log.info(operation.operateList(List(number1, number2, number3, number4), "multi", multi) + "\n")
    log.info(operation.operateList(List(number1, number2, number3, number4), "max", max))
  }
}
