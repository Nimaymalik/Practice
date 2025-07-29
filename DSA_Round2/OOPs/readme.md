# Theroy
OOPs os a programming paradign based on concept of objects It emphesis code around data and objects it is used to promote reusability maintainability in software development

# Polymorphism
1 Method overloading
Compile time polymorphism which means that the function has same name with different parameters

2 Method overridding
Run-time Ploymorphism means that method name of child class is same as on parent class

# Interfaces
Interfce is define as a set of abstract methods that any implementing class must define
We use interface to achieve multiple inheritence

# diamond Problem
The problem in which multiple inheritence ambiguity occurs when a class inherits from 2 classes.
To solve it we use interface to solve the ambiguity problem

# Abstract class vs Interface
| Feature                  | **Abstract Class**                         | **Interface**                                                    |
| ------------------------ | ------------------------------------------ | ---------------------------------------------------------------- |
| **Purpose**              | Partial abstraction                        | Complete abstraction                                             |
| **Methods**              | Can have abstract and non-abstract methods | Only abstract methods (Java 7), default/static/private (Java 8+) |
| **Access Modifiers**     | Can be `private`, `protected`, `public`    | Methods are `public` by default                                  |
| **Variables**            | Instance variables allowed                 | Only `public static final` (constants)                           |
| **Constructors**         | Yes                                        | No                                                               |
| **Multiple Inheritance** | Not supported (single class inheritance)   | Supported (can implement multiple interfaces)                    |
| **Inheritance**          | Use `extends` keyword                      | Use `implements` keyword                                         |
| **Speed**                | Slightly faster                            | May be slower due to extra indirection                           |
| **Use Case**             | Shared code among related classes          | Common behavior across unrelated classes                         |
| **Example**              | `abstract class Animal`                    | `interface Flyable`                                              |



