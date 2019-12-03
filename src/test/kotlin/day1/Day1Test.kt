package day1

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class Day1Test {

    @Test
    fun partOne_spec() {
        assertThat(fuelForModule(12)).isEqualTo(2)
        assertThat(fuelForModule(14)).isEqualTo(2)
        assertThat(fuelForModule(1969)).isEqualTo(654)
        assertThat(fuelForModule(100756)).isEqualTo(33583)
    }

    @Test
    fun partTwo_spec() {
        assertThat(calculateRequiredFuelForMass(14)).isEqualTo(2)
        assertThat(calculateRequiredFuelForMass(1969)).isEqualTo(966)
        assertThat(calculateRequiredFuelForMass(100756)).isEqualTo(50346)
    }

}