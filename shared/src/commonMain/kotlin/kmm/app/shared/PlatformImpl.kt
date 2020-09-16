package kmm.app.shared

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

expect class PlatformImpl() : Platform {

    override val platformStr: String

}

abstract class Platform {

    abstract val platformStr: String

    init {
        CoroutineScope(Dispatchers.Default).launch {
            while (true) {
                /** Uncomment the line below... InvalidMutabilityException will continue to be thrown **/
                //println("this: ${this@Platform}")
                println("platformStr: $platformStr")
                delay(1000)
            }
        }
    }

}