package contoh.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("contoh.micronaut")
                .mainClass(Application.javaClass)
                .start()
    }
}