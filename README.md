# typed-repl

Demo of core.typed integration into Clojure's compilation process.

## Demo

Load `typed-repl.core` in your favourite editor or REPL. core.typed will automatically
type check all interactions.

## Usage

To integrate core.typed into the compilation process for your own project, simply add this
line to your `project.clj`:

```clojure
  :repl-options {:nrepl-middleware [clojure.core.typed.repl/wrap-clj-repl]}
```

Then all REPL interactions in namespaces with truthy `:core.typed` metadata entries
will be typed, along with any interactions that eventually call `clojure.core/load`
like `require` or `use`.

## License

Copyright © 2015 Ambrose Bonnaire-Sergeant

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
