package washingRevisited.engine

import washingRevisited.world.World

/**
 * Responsible for starting the game, and holding its state.
 */
class Game {
  private val world = World(this)

  fun play() = world.rootRoom.play()
}
