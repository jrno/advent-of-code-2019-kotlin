package day2

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Day2Test {

    @Test
    fun partOne_spec() {
        Assertions.assertThat(opCode(listOf(1,0,0,0,99))).isEqualTo(listOf(2,0,0,0,99))
        Assertions.assertThat(opCode(listOf(2,3,0,3,99))).isEqualTo(listOf(2,3,0,6,99))
        Assertions.assertThat(opCode(listOf(2,4,4,5,99,0))).isEqualTo(listOf(2,4,4,5,99,9801))
        Assertions.assertThat(opCode(listOf(1,1,1,4,99,5,6,0,99))).isEqualTo(listOf(30,1,1,4,2,5,6,0,99))
    }
}