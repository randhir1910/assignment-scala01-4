
import org.apache.log4j.Logger

object Application {
  def main(args: Array[String]) {

    val log = Logger.getLogger(this.getClass)
    val operation = new Operation

    val number1 = 2
    val number2 = 3
    val number3 = 5
    val number4 = 10

    val square = (firstVal: Int, secondVal: Int) => firstVal * firstVal + secondVal * secondVal
    val cubes = (firstVal: Int, secondVal: Int) => firstVal * firstVal * firstVal + secondVal * secondVal * secondVal
    val ints = (firstVal: Int, secondVal: Int) => firstVal + secondVal

    log.info(operation.sum(cubes, number1, number2) + "\n")
    log.info(operation.sum(square, number1, number2) + "\n")
    log.info(operation.sum(ints, number3, number4) + "\n")
    log.info(operation.pascal(0, 1) + "\n")
    log.info(operation.pascal(1, 2) + "\n")
    log.info(operation.pascal(1, 3) + "\n")
  }
}
