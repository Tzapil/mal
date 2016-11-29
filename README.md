# rss-get

A Telegram bot for myanimelist based on tblibrary on clojure.

## Instalation
The easiest way to run the app is:

```
lein run
```

or

```
lein deps
lein compile
lein uberjar 
java -jar ./target/uberjar/rss-get-0.1.0-SNAPSHOT-standalone.jar
```

## Dependencies

- a Java JDK/JRE installation, version 8 or above
- Clojure 1.8.0
- http-kit 2.2.0 (provided via a dependency)
- core.async 0.2.374 (provided via a dependency)
- data.zip 0.1.2 (provided via a dependency)
- tblibrary 0.1.2-SNAPSHOT (provided via a dependency)

## License

Copyright © 2016 du.kulaevskiy

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
