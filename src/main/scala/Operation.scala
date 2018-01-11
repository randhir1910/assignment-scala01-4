class Operation {

  def sum(f: (Int, Int) => Int, first: Int, second: Int): Int = {
    f(first, second)
  }

  def pascal(column: Int, row: Int): Int = {
    if (column <= 0 || column == row) 1
    else pascal(column, row - 1) + pascal(column - 1, row - 1)
  }

}
