package washingRevisited

fun fancy(message: String) {
  bar()
  display("** $message")
  bar()
  spacer()
}

fun display(message: String) {
  println("\n$message")
}

fun spacer() {
  println()
}

private fun bar() {
  print("--------------------------------------------------------------------------------")
}
