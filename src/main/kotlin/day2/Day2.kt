package day2

import fileToString
import java.lang.IllegalStateException
import java.util.stream.Collectors

// https://adventofcode.com/2019/day/2
fun main() {
    println("Part #1: ${partOne(fileToString("day2.txt").split(","))}")
    println("Part #2: ${partTwo(fileToString("day2.txt").split(","))}")
}

fun partOne(input: List<String>): Int {

    val data = mutableIntList(input)

    data[1] = 12
    data[2] = 2

    return opCode(data)[0]
}

fun partTwo(input: List<String>): String {

    val data = mutableIntList(input)

    for (verb in 1 until 99) {
        for (noun in 1 until 99) {
            data[1] = verb
            data[2] = noun
            if (opCode(data)[0] == 19690720) {
                return "$verb$noun"
            }
        }
    }

    throw IllegalStateException("should find result")
}

fun mutableIntList(input: List<String>): MutableList<Int> =
    input.stream()
        .map { i -> i.toInt() }
        .collect(Collectors.toList())
        .toMutableList()

fun opCode(input : List<Int>): List<Int> {

    if (input.isEmpty()) {
        throw IllegalStateException("input cannot be empty")
    }

    val instructions = input.toMutableList()
    var address = 0

    while (true) {

        val opcode = instructions.get(address++)

        if (opcode == 99) {
            break
        }

        val param1 = instructions.get(address++)
        val param2 = instructions.get(address++)
        val param3 = instructions.get(address++)

        instructions[param3] = when(opcode) {
            1 -> instructions[param1] + instructions[param2]
            2 -> instructions[param1] * instructions[param2]
            else -> throw IllegalStateException("invalid opcode $opcode")
        }
    }

    return instructions
}



