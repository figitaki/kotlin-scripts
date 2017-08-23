import react.*
import react.dom.*
import kotlin.browser.*
import kotlinx.html.*

import myapp.*

fun main(args: Array<String>) {
    runtime.wrappers.require('./index.css')

    ReactDOM.render(document.getElementById("root")) {
        div {
            Application {}
        }
    }

    // require('./registerServiceWorker')();
}
