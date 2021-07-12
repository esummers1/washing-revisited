package washingRevisited.world.originalRooms

import washingRevisited.display
import washingRevisited.world.Room
import washingRevisited.world.World

/**
 * The first room in the world, introducing the player to the game and requiring them to move
 * forwards.
 */
class EntryRoom(world: World, successors: List<Room>) : Room(world, successors) {
  override fun play() {
    display(
      "One day you are in your garden, hanging out washing and minding your own business, when " +
      "you glimpse a mysterious figure with a pointed hat in your neighbour's window. The next " +
      "moment, you feel a rush of air and hear a high-pitched roar, and find yourself standing " +
      "on a rough, spongy surface."
    )
    display(
      "As you catch your breath, you begin to recognize the shapes around you. It looks like you " +
      "are in a large room whose walls are made up of large, coloured sheets of fabric - except " +
      "the fibres are thick, and the patterns very large."
    )

    // TODO
  }
}
