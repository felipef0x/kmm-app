package kmm.app.shared

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import platform.UIKit.UIDevice

actual class PlatformImpl actual constructor() : Platform() {

    actual override val platformStr: String = UIDevice.currentDevice.run { "$systemName $systemVersion" }

    /**
    Uncomment the block below and delete init block from commonMain/Platform,
    then InvalidMutabilityException will no longer be thrown **/
//    init {
//        CoroutineScope(Dispatchers.Default).launch {
//            while (true) {
//                println("platformStr: $platformStr")
//                delay(1000)
//            }
//        }
//    }

}