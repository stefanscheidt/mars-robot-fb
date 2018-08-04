package robot

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class MoveTest {

    @Test
    fun `no instructions robot stands still`() {
        val robot = Robot(position = Position(0, 0), direction = North)

        assertThat(move(robot, ""))
                .isEqualTo(robot);
    }

    @Test
    fun `moving forward increases y coordinate`() {
        val robot = Robot(position = Position(0, 0), direction = North)

        assertThat(move(robot, "F"))
                .isEqualTo(Robot(position = Position(0, 1), direction = North));
    }

    @Test
    fun `moving forward twice increases y coordinate by 2`() {
        val robot = Robot(position = Position(0, 0), direction = North)

        assertThat(move(move(robot, "F"), "F"))
                .isEqualTo(Robot(position = Position(0, 2), direction = North));
    }


    @Test
    fun `moving backward decreases y coordinate`() {
        val robot = Robot(position = Position(0, 0), direction = North)

        assertThat(move(robot, "B"))
                .isEqualTo(Robot(position = Position(0, -1), direction = North));
    }
}