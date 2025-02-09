package no.campnofo.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, World!"
    }

    @GetMapping("/hello_world")
    fun sayHelloWorld(): String {
        return "Hello, World!"
    }

}
