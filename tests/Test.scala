object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(90, 82, 14, 20, 12)
    assert(Policy.score(signalcase_1) == 158)
    assert(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(59, 81, 27, 24, 13)
    assert(Policy.score(signalcase_2) == 25)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(92, 100, 25, 19, 9)
    assert(Policy.score(signalcase_3) == 124)
    assert(Policy.classify(signalcase_3) == "review")
  }
}
