# Groovy NullPointerException in Comparison

This example demonstrates a common pitfall in Groovy: unexpected `NullPointerExceptions` arising from implicit null handling during comparisons.

The `myMethod` function intends to return the larger of two numbers. However, if either `a` or `b` is `null`, a `NullPointerException` occurs because Groovy doesn't automatically handle null comparisons as some languages do.

The solution shows how to explicitly handle null values to prevent this error.