@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import org.w3c.dom.WebSocket
import org.w3c.dom.events.Event

@JsModule("sockjs-client")
external object SockJS {
    @nativeInvoke
    operator fun invoke(url: String, _reserved: Any? = definedExternally, options: dynamic = definedExternally): WebSocket
    var prototype: WebSocket
    var CONNECTING: String /* 0 */
    var OPEN: String /* 1 */
    var CLOSING: String /* 2 */
    var CLOSED: String /* 3 */
}

external interface BaseEvent : Event {
    override var type: String
}

external interface CloseEvent : BaseEvent {
    var code: Number
    var reason: String
    var wasClean: Boolean
}

external interface MessageEvent : BaseEvent {
    var data: String
}

// external interface Options {
//    var server: String?
//        get() = definedExternally
//        set(value) = definedExternally
//    var sessionId: dynamic /* Number | SessionGenerator */
//        get() = definedExternally
//        set(value) = definedExternally
//    var transports: dynamic /* String | Array<String> */
//        get() = definedExternally
//        set(value) = definedExternally
// }
