class Operation {

  def sum(f: (Int, Int) => Int, first: Int, second: Int): Int = {
    f(first, second)
  }

  def operateList(list: List[Int], operation: String, function: (Int, Int) => Int): Int = {
    def innerOperate(result: Int, list1: List[Int], f: (Int, Int) => Int): Int = {
      list1 match {
        case Nil => result
        case head :: tail => innerOperate(function(result, head), tail, f)
      }
    }

    operation match {
      case "sum" => innerOperate(0, list, function)
      case "multi" => innerOperate(1, list, function)
      case "max" => list match {
        case head :: tail => innerOperate(head, tail, function)
      }
    }

  }

  def pascal(column: Int, row: Int): Int = {
    if (column <= 0 || column == row) {
      1
    }
    else {

      pascal(column, row - 1) + pascal(column - 1, row - 1)
    }
  }

}
