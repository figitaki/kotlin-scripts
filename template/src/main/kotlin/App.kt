package myapp

import react.*
import react.dom.*
import kotlinx.html.*

class Application : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    companion object : ReactComponentSpec<Application, ReactComponentNoProps, ReactComponentNoState>

    init {
        state = ReactComponentNoState()
    }

    override fun ReactDOMBuilder.render() {
        runtime.wrappers.require("./App.css")
        var logo = runtime.wrappers.require("./logo.svg")

        div("App") {
            div("App-header") {
                img(classes = "App-logo", src = logo, alt = "logo")
                h2 { +"Welcome to React and Kotlin" }
            }
            p("App-intro") {
                +"To get started, edit"
                code { +" src/main/kotlin/App.kt " }
                +" and save to reload."
            }
        }
    }
}
