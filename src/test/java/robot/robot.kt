package robot


sealed class Direction
object North : Direction()
object South : Direction()
object West : Direction()
object East : Direction()

data class Position(val x: Int, val y: Int)

data class Robot(val position: Position, val direction: Direction)

fun move(robot: Robot, command: String): Robot = when (command) {
    "F"  -> Robot(position = Position(0, robot.position.y + 1), direction = North)
    "B"  -> Robot(position = Position(0, -1), direction = North)
    else -> robot
}