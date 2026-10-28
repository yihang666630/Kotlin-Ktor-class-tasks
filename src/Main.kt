// Task 2.3: Defining variables of different types in Kotlin
// (Variables taken from the Programming Guide, Section 2.3)

fun main() {

    val myAge = 29u

    val universeAge = 13_800_000_000L

    val status = 'M'

    val name = "Sarah"

    val height = 1.78f

    val root2 = Math.sqrt(2.0)

    // Print the runtime class of each variable to verify its inferred type
    println(myAge::class)
    println(universeAge::class)
    println(status::class)
    println(name::class)
    println(height::class)
    println(root2::class)
    // Print the actual value of the square root of 2
    println(root2)
}
