2.3:
val pi: Float = 3.14159
this line of code would trigger compiler error
In kotlin, floating-point literals without suffix would be recognized as Double
Also, what matters is that Kotlin doesn't conduct implicit narrowing conversion
Above all, this line of code would trigger compiler error

appropriate amendments:
1. removing type declaration
e.g. val pi = 3.14159 //Double
2. appending 'f' this suffix to the line
e.g. val pi: Float = 3.14159f
3. change type declaration into Double
e.g. val pi: Double = 3.14159