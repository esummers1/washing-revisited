@file:JvmName("Main")

package washingRevisited

import washingRevisited.engine.Game
import washingRevisited.world.World

fun main(args: Array<String>) {
  fancy(
    "Welcome to Washing. On your journey you will be asked to make decisions using numbers - " +
    "please just type the number and press return.")

  Game().play()

  spacer()
  fancy("Thank you for playing Washing.")
}
