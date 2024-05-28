## Builder Pattern

### Usage
When a complex object has to be built and / or when the object has many variations with optional parameters.<br>
Eg: Car with features, Laptop built based on its purpose.


### Terminologies
1. Builder - the component that manages the initialization of the complex object.
2. Director - the component that orchestrates the sequence in which the builder method should be called to create the product / object.
   1. For eg: For a house to be built, we build the base, then walls, roofs, windows, etc. in that order.