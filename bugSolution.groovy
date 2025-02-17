```groovy
def myMethod(a, b) {
  a = a ?: 0 // Assign 0 to a if it's null
  b = b ?: 0 // Assign 0 to b if it's null
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 2) // 5
println myMethod(2, 5) // 5
println myMethod(null, 5) // 5
println myMethod(5, null) // 5
println myMethod(null, null) //0
```