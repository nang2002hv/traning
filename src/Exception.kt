import kotlin.Exception

open class Exception(message: String) : Exception(message){
    override fun toString(): String {
        return "Exception: $message"
    }
}