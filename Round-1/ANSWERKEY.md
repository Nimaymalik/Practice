# NETWORKING
C) Session Layer

C) To forward data packets between different networks.

C) HTTP

B) Reliable, Unreliable

C) To resolve domain names to IP addresses.

C) 80

A) HyperText Transfer Protocol Secure

B) 172.16.0.0 - 172.31.255.255

C) MAC Address

C) Star Topology

B) To prevent unauthorized access to or from a private network.

C) TCP

C) Subnetting

B) 32 bits

B) The time delay before a transfer of data begins following an instruction.

C) Switch

B) To dynamically assign IP addresses to devices on a network.

B) Sends a SYN-ACK packet

B) Presentation Layer

B) A device that connects two networks that use different protocols.

DBMS:

C) ALTER

C) Foreign Key

A) Consistency

D) SELECT

C) LEFT JOIN

B) 2NF

B) A data structure that improves the speed of data retrieval operations on a database table.

C) COUNT()

C) GROUP BY

B) Ensures that a column contains only unique (no duplicate) values.

C) DROP TABLE

B) A row in a table.

B) Concurrent transactions do not affect each other's execution.

C) LIKE

D) Atomicity

C) Increased data redundancy and potential for anomalies

C) ORDER BY

C) An unknown or missing value

A) DEFAULT

B) A set of SQL statements that can be executed as a single unit.

Operating Systems:

C) Database Design

B) A lightweight process that shares the same memory space as other threads of the same process.

A) Paging

B) Multiple processes try to access and modify the same shared resource concurrently, and the outcome depends on the order of execution.

D) Round Robin

B) To request services from the operating system kernel.

B) Circular Wait

B) Managing system resources and providing services to applications.

B) A technique that allows a program to use more memory than is physically available by swapping data between RAM and disk.

B) The process of saving the state of one process and restoring the state of another so that execution can continue from the same point.

C) Shared Memory

B) The process of starting up a computer and loading the operating system into memory.

B) Process Scheduling

A) Excessive page faults occurring when processes spend more time paging than executing.

B) Multiple programs can be loaded into memory, and the CPU switches between them.

B) To provide a command-line interface or graphical user interface for user interaction.

B) Free memory is scattered in small, non-contiguous blocks.

B) A synchronization tool used to control access to common resources in a concurrent system.

C) Blocked/Waiting

B) A special type of software that allows hardware devices to communicate with the operating system.

OOPS:

C) Encapsulation

C) Inheritance

A) Compile-time polymorphism

C) It can have both concrete (implemented) and abstract (unimplemented) methods, and cannot be instantiated.

C) private

B) Initializing the state of an object when it is created.

B) A class is a blueprint or template, an object is an instance of that class.

B) A class can implement multiple interfaces.

B) A subclass provides a specific implementation for a method that is already defined in its superclass.

B) To retrieve the value of a private variable.

C) Abstraction

B) A Dog object is an Animal.

B) To refer to the current instance of the class.

B) Aggregation

B) A member that belongs to the class itself, not to any specific object.

B) Increased coupling between classes.

B) Runtime polymorphism

C) To modify the value of a private variable, often with validation.

B) Open/Closed Principle (OCP)

A) To ensure a class has only one instance and provides a global point of access to it.

System Design:

C) Microservices Architecture

B) To distribute web content (like images, videos) geographically closer to users to reduce latency.

B) Having duplicate components or systems to take over if one fails.

C) For decoupling services and handling asynchronous tasks or events.

A) Consistency, Availability, Partition Tolerance

C) Document Database (NoSQL)

B) To control the number of requests a client can make to an API within a given time frame.

B) Data will eventually become consistent across all replicas, but there might be a delay.

B) It provides a single entry point for clients, handling routing, authentication, and rate limiting.

B) Sharding

A) Allowing a system to continue operating without interruption when a component fails.

C) Read replicas or caching

B) To protect internal servers from direct client exposure and balance traffic.

B) An operation that can be applied multiple times without changing the result beyond the initial application.

C) Stream processing

A) A component whose failure will cause the entire system to stop functioning.

C) gRPC

B) The trade-offs between development speed, scalability, and operational complexity.

A) Ensuring all parts of a transaction across multiple services either commit or roll back together.

A) To prevent a single failing service from cascading failures throughout the system.

C Output:

D) Undefined behavior (Due to multiple modifications of 'a' within the same sequence point).

B) Hi (x++ increments x after the comparison. So 5 > 5 is false).

D) a (Array str is {'C', ' ', 'L', 'a', 'n', 'g', 'u', 'a', 'g', 'e', '\0'}. ptr+2 points to the third element, which is 'L'. *(ptr+3) points to 'a').

C) 30 (arr + 2 points to the third element, which is 30).

A) 0 1 2

B) 10 (Ternary operator: condition ? value_if_true : value_if_false).

B) a = 10, b = 20 (C uses pass-by-value for primitive types. swap modifies copies, not the original a and b).

B) 3 (Type casting float to int truncates the decimal part).

B) TwoThreeDefault (Missing break statements cause fall-through).

B) 4 (Common size for int on most modern systems).

B) 65 (Printing a char with %d prints its ASCII value).

D) Undefined behavior (Similar to Q1, multiple modifications without sequence points).

B) A garbage value (Accessing arr[5] is out of bounds for an array declared as arr[3], leading to undefined behavior, most commonly a garbage value or a crash).

A) 0 1 2

A) 25 (MAX is replaced by 10 by the preprocessor. So 10 * 2 + 5 = 20 + 5 = 25).

B) 5 (Integer division).

A) 1 (In C, true is represented by 1 and false by 0). (1 < 2) is 1, (2 < 3) is 1. 1 && 1 is 1.

C) ello (Pointer arithmetic s + 1 shifts the pointer to point to the 'e' in "Hello").

B) 0 1 3 4 (continue skips the current iteration when i is 2).

A) 1 2 (*(ptr++) means dereference ptr then increment ptr. So *(ptr++) prints 1, and then ptr points to 2).