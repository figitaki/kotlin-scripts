package myapp

import react.*
import react.dom.*
import kotlinx.html.*

class Application : ReactDOMComponent<ReactComponentNoProps, ReactComponentNoState>() {
    override fun ReactDOMBuilder.render() {
        runtime.wrappers.require('./App.css')
        var logo = runtime.wrappers.require('./logo.svg')

        div("App") {
            div("App-header") {
                img("App-logo", src = logo, alt = "logo")
                h2 { +"Hello World" }
            }
            p("App-intro") {
                +"To get started, edit" + code { +"src/App.js" } + " and save to reload."
            }
        }
    }
}
