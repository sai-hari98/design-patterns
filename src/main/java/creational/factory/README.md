## Factory Pattern

### Purpose
To separate object creation from the codebase separately by keeping them under a creator class

### Terminologies
1. Creator
   1. Creator helps in creating new objects of desired type.
   2. There should be an abstract class / interface and should be extended / implemented by a creator class for each product class
2. Product
   1. The object created as the output.
   2. Once again product should have an interface which will be implemented by a subclass for each product type. For eg: Vehicle is the base product interface implemented by Car and Truck

### Usage
1. Object creation will get messy if there are multiple product types. If conditions are required wherever object creation is necessary. Instead of this, managing them in a centralized manner is organized and better.
2. If there can be more product types in the future. Once again, to add another else if condition wherever object creation is done is tedious. Creating another creator class for the new product type would be helpful.
3. Providing an option for users of a library to extend the behavior of the internal components.


