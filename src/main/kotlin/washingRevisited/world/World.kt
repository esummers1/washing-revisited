package washingRevisited.world

import washingRevisited.engine.Game
import washingRevisited.world.originalRooms.EntryRoom

/**
 * Holds the graph of rooms that makes up the game world.
 *
 * Also makes specific hooks into the game state available to the logic in each room.
 *
 * @property game The game object this belongs to.
 */
class World(private val game: Game) {
  // TODO the game rooms
  val rootRoom = EntryRoom(this, listOf())
}
