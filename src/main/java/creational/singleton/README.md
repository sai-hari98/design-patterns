## Singleton Pattern

### Purpose
To manage object creattion for an entity. If we want to create a shared resource like a shared file or a DB connection, we can go for a singleton pattern.

Not necessarily the number of objects should be one. It can be any pre-determined number of objects to create a shared pool of objects as well.

### Cons

1. Need special handling in multi threaded situations. Different threads can access the object at different times and can pave way for:
   1. duplicate object creation or worse
   2. overwriting of the previously created object
2. Breaks Single Responsibility Principle. The class manages both the behavior (attributes and methods) and the object creation as well.
3. Cannot write unit test cases. Since the object creation method will be static, most test frameworks cannot mock a static method.