package kmm.app.shared

import android.os.Build.VERSION

actual class PlatformImpl actual constructor() : Platform() {

    actual override val platformStr: String = "Android ${VERSION.SDK_INT}"

}