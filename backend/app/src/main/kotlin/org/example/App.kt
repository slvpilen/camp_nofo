// /*
//  * This source file was generated by the Gradle 'init' task
//  */
// package org.example

// class App {
//     val greeting: String
//         get() {
//             return "Hello World!"
//         }
//     val person = Person("Alice", 20)
//     println("Is ${person.name} an adult? ${person.isAdult}")
// }

// class Person(val name: String, val age: Int)
//     val isAdult: Boolean
//         get() {
//             return age >= 18
//         }

// fun main() {
//     println(App().greeting)

// }
package org.example

class App {
    
    private val greeting: String = "Hello World!"

    
    val person = Person("Alice", 20)
    
    init {
        println(greeting)
        println("Is ${person.name} an adult? ${person.isAdult}")
    }
}


class Person(val name: String, val age: Int) {
    val isAdult: Boolean
        get() {
            return age >= 18
        }
}

fun main() {
    App()
}
