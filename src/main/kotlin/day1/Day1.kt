package day1

import fileToList

// https://adventofcode.com/2019/day/1
fun main() {
    println("Part #1: ${partOne(fileToList("day1.txt"))}")
    println("Part #1: ${partTwo(fileToList("day1.txt"))}")
}

fun partOne(input: List<String>): Long = input.stream()
    .map { str -> str.toLong() }
    .mapToLong { fuelForModule(it) }
    .sum()

fun partTwo(input: List<String>): Long = input.stream()
    .map { str -> str.toLong() }
    .mapToLong { calculateRequiredFuelForMass(it) }
    .sum()

fun fuelForModule(mass: Long) : Long = mass.div(3) - 2

fun calculateRequiredFuelForMass(mass: Long) : Long {
    val fuel = fuelForModule(mass)
    return if (fuel <= 0) 0 else fuel + calculateRequiredFuelForMass(fuel)
}
