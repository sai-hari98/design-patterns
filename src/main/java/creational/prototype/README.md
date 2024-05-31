## Prototype

### Need

1. To create a copy of an object.
   * If the object does have complex types, creating a deep clone is not easy.
   * Also, details about the class's attributes and the class itself is required. This is impossible when the class extends an interface and the details are hidden
   * This makes the code dependent on the class as well (tight coupling)
2. If we want to protect the data in the entity of interest from getting overwritten.

### Terminologies
1. Prototype - the object / class to be cloned.
   * This prototype implements an interface with just the clone method.
   * When called, the class implementing this interface creates a new object by duplicating the primitive values.

2. Prototype Registry
   * Can be used to maintain objects of different variations (electric car, hybrid car, etc.) Rather than creating sub classes via inheritance.
   * We can pass the required type of object when calling the clone method, which clones the object of the variation required.