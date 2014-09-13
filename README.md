nyu-scps-LearningJavaForAndroid
===============================

# For Android Intensive Course - Fall 2014 - NYU SCPS - Learning Java for Android

## Day 1
* Course introductions
  ** Know why you're here as well as your workbench & tools
    *** Android development from zero to sixty in 14 weeks; from i++ to advanced android development with sensors (GPS/camera);
* Introduction to Collaborative SW Engineering
  ** Android Studio as your main workbench
    *** Android Studio; Gradle as build system (maven for backward compatability)
  ** Collaborative source control
    *** Github basics, or how to communicate to other engineers using project files
  ** Collaborative project management
    *** Basics of specifying tasks, grooming and planning them for a sprint; managing sprints to deliver MVP
* Introduction to Java
  ** General overview as a programming language
    *** Explaination of programming paradigms, e.g., imperative vs declarative programming; functional programming is declarative. Imperative programming – defines computation as statements that change a program state. Procedural programming, structured programming – specifies the steps the program must take to reach the desired state. Declarative programming – defines computation logic without defining its control flow. Functional programming – treats computation as the evaluation of mathematical functions and avoids state and mutable data. Object-oriented programming (OOP) – organizes programs as objects: data structures consisting of datafields and methods together with their interactions. Event-driven programming – the flow of the program is determined by events, such as sensor outputs or user actions (mouse clicks, key presses) or messages from other programs or threads.Automata-based programming – a program, or part, is treated as a model of a finite state machine or any other formal automata.
  ** Program structure
    *** How to write a Java program - like a C/C++/C#/Python/etc engineer
  ** Commenting
    *** How to communicate to other engineers using your source code
  ** Code access control
    *** How to protect your data and functions to be used properly, as designed. Library unit; inline code access specifiers (public, private, protected)
  ** Main line code example
    *** Show basics of a mainline
* OO language concepts and constructs
  ** Basics of OO programming
    *** Data abstraction (classes then objects); encapsulation (data/functions); composition ("has-a"); inheritance ("is-a"); polymorphism
  ** Operators
    *** Precedence; assignment; mathematical operators; increment/decrement operators; relational operators; logical operators; literals; bitwise operators; shift operators; ternary if-else operator; String operator; summary of operators

Day 2
* OO language concepts and constructs
  ** Initialization & cleanup
    *** Member initialization; constructor initialization; static initialization; array initialization; enumerated types; "this" keyword; finalization and garbage collections; initialization & class loading
  ** Class code reuse
    *** Composition (simple inclusion); inheritance; delegation (via containment); upcasting; "final" keyword
  ** Polymorphism
    *** Upcasting revisited; method-call binding; order of constructor calls; covariant return type (SE5); designing with inheritance vs composition (cost/benefits); run-time type identification (RTTI)
  ** Interfaces
    *** Abstract classes and methods; interfaces; multiple inheritance in Java vs C++; extending an interface with inheritance; name collisions when combining interfaces; adapting to an interface; fields/members in interfaces; nesting interfaces; interfaces & factory design patterns;
  ** Inner classes - Part 1
    *** Creating inner classes; the link to the outer class; using ".this" and ".new"; inner classes and upcasting; inner classes in methods and scopes; anonymous inner classes; nested classes; classes within interfaces; reaching outward from a multiply nested class;
  ** Inner classes - Part 2
    *** Closures & callbacks; inner classes & control frameworks; inheriting from inner classes; local inner classes; inner class identifiers;