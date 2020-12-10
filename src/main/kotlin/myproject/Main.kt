package myproject

import com.yngvark.robothelper.RobotHelper
import java.awt.Robot

val robot = RobotHelper(Robot())

fun main(args: Array<String>) {
    println("Hello!")
    robot.type("Hello there")
}
