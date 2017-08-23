# Kotlin Scripts

```
$ yarn create react-app my-app -- --scripts-version kotlin-scripts
```

Kotlin Scripts provides a JS-like development environment for developing web apps with the [Kotlin](https://kotlin-lang.org/) programming language and [React](https://react.facebook.io/). It bootstraps an environment to automatically compile all Kotlin code to JS, provide features like reloading and bundling, and seamlessly use JS code from Kotlin.

## Getting Started

### Using [Yarn](https://yarnpkg.org/)

> Note that using `yarn create` requires Yarn 0.25 or later

To create a new app using Kotlin and React, run:

```
$ npm install -g bs-platform
$ yarn create react-app <app-name> -- --scripts-version reason-scripts
$ cd <app-name>
$ yarn start
```

### Using npm

```
$ npm install -g bs-platform create-react-app
$ create-react-app <app-name> --scripts-version reason-scripts
$ cd <app-name>
$ npm start
```

### Directory Layout

Creating a new app makes an `<app-name>` directory with the following layout:

```
<app-name>/
  README.md
  node_modules/
  package.json
  build.gradle
  .gitignore
  public/
    favicon.ico
    index.html
  src/
    main/
      kotlin/
        index.kt
        app.kt
    style/
      index.css
      app.css
    img/
      logo.svg
```

## Features

### [Everything from Create React App](https://github.com/facebookincubator/create-react-app/blob/master/packages/react-scripts/template/README.md)

* Highly-optimized build configuration
* Pre-configured test runner
* Friendly developer environment
* "eject" Webpack config
* Environment variable configuration
* Automatic PWA configuration
* Low configuration builds

### Kotlin Entrypoint

The entry point to the app is `src/main/kotlin/index.kt`. From the start your new
app will be based on Kotlin, but can seamlessly interop with existing JS
files and projects!

### Automatic Compilation of Kotlin files

Any Kotlin file will be automatically compiled to a JS file. Once the bundle is
compiled, any Kotlin code can be called from JavaScript. For example, to
call a method from a specific Kotlin module:

```js
import { add } from 'main'

const sum = add(1, 4)
```


### Importing non-Kotlin files

You can require CSS files with:

```kotlin
runtime.wrapper.require("./App.css")
```

or any other kind of file (like SVG's) with:

```kotlin
var logo : string = runtime.wrapper.require("./logo.svg")
```


## Help, Tips, and Tricks

<p><details>
<summary><b>My editor isn't autocompleting</b></summary>

In order to get all the benefits of the Kotlin tool-system, use
the Intellij IDE with the Kotlin plugin.
</details></p>

<p><details>
<summary><b>Kotlin is awesome! Where can I learn more?</b></summary>

Checkout the Kotlin website: https://kotlinlang.org/ !

There's also Slack to come talk about Reason, and ask for help: https://slack.kotlinlang.org
</details></p>

## Contributing

This project was conceived by [Carey Janecka](mailto:careyjanecka@gmail.com)
and was in large part inspired by the [reason-scripts](https://github.com/reasonml-community/reason-scripts)
project. If you wish to contribute, please start by [submitting an issue](https://github.com/figitaki/kotlin-scripts)
for documentation. If you have the requisite skills to tackle the problem,
please fork this repository and submit a pull request.
