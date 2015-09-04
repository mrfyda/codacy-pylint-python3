package codacy.pylint

import codacy.dockerApi.ParameterName

private[pylint] object ParameterHeader {

  def get(name: ParameterName): String = values.getOrElse(name.value, "MASTER")

  private[this] lazy val values = Map(
    "required-attributes" -> "BASIC",
    "bad-functions" -> "BASIC",
    "good-names" -> "BASIC",
    "bad-names" -> "BASIC",
    "name-group" -> "BASIC",
    "include-naming-hint" -> "BASIC",
    "function-rgx" -> "BASIC",
    "function-name-hint" -> "BASIC",
    "variable-rgx" -> "BASIC",
    "variable-name-hint" -> "BASIC",
    "const-rgx" -> "BASIC",
    "const-name-hint" -> "BASIC",
    "attr-rgx" -> "BASIC",
    "attr-name-hint" -> "BASIC",
    "argument-rgx" -> "BASIC",
    "argument-name-hint" -> "BASIC",
    "class-attribute-rgx" -> "BASIC",
    "class-attribute-name-hint" -> "BASIC",
    "inlinevar-rgx" -> "BASIC",
    "inlinevar-name-hint" -> "BASIC",
    "class-rgx" -> "BASIC",
    "class-name-hint" -> "BASIC",
    "module-rgx" -> "BASIC",
    "module-name-hint" -> "BASIC",
    "method-rgx" -> "BASIC",
    "method-name-hint" -> "BASIC",
    "no-docstring-rgx" -> "BASIC",
    "docstring-min-length" -> "BASIC",
    "spelling-dict" -> "SPELLING",
    "spelling-ignore-words" -> "SPELLING",
    "spelling-private-dict-file" -> "SPELLING",
    "spelling-store-unknown-words" -> "SPELLING",
    "min-similarity-lines" -> "SIMILARITIES",
    "ignore-comments" -> "SIMILARITIES",
    "ignore-docstrings" -> "SIMILARITIES",
    "ignore-imports" -> "SIMILARITIES",
    "logging-modules" -> "LOGGING",
    "max-line-length" -> "FORMAT",
    "ignore-long-lines" -> "FORMAT",
    "single-line-if-stmt" -> "FORMAT",
    "no-space-check" -> "FORMAT",
    "max-module-lines" -> "FORMAT",
    "indent-string" -> "FORMAT",
    "indent-after-paren" -> "FORMAT",
    "expected-line-ending-format" -> "FORMAT",
    "notes" -> "MISCELLANEOUS",
    "ignore-mixin-members" -> "TYPECHECK",
    "ignored-modules" -> "TYPECHECK",
    "ignored-classes" -> "TYPECHECK",
    "zope" -> "TYPECHECK",
    "generated-members" -> "TYPECHECK",
    "ignore-iface-methods" -> "CLASSES",
    "defining-attr-methods" -> "CLASSES",
    "valid-classmethod-first-arg" -> "CLASSES",
    "valid-metaclass-classmethod-first-arg" -> "CLASSES",
    "exclude-protected" -> "CLASSES",
    "max-args" -> "DESIGN",
    "ignored-argument-names" -> "DESIGN",
    "max-locals" -> "DESIGN",
    "max-returns" -> "DESIGN",
    "max-branches" -> "DESIGN",
    "max-statements" -> "DESIGN",
    "max-parents" -> "DESIGN",
    "max-attributes" -> "DESIGN",
    "min-public-methods" -> "DESIGN",
    "max-public-methods" -> "DESIGN",
    "deprecated-modules" -> "IMPORTS",
    "import-graph" -> "IMPORTS",
    "ext-import-graph" -> "IMPORTS",
    "int-import-graph" -> "IMPORTS",
    "overgeneral-exceptions" -> "EXCEPTIONS"
  )
}
