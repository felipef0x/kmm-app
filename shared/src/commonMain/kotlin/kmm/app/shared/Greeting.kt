package kmm.app.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${PlatformImpl().platformStr}!"
    }
}
