package washingRevisited.world

/**
 * The basic unit of the game. A room will give the player a description of the scenario, prompt
 * them for an action, and delegate to one of its [successors] if the player chooses to visit them.
 *
 * @property world The world that this room is part of
 * @property successors The list of rooms accessible from this one.
 */
abstract class Room(protected val world: World, protected val successors: List<Room>) {
  abstract fun play()
}
