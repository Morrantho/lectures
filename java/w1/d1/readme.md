<div align="center">
	<img align="center" src="../../res/img/java_logo.png" width=128 />
</div>

# Week 1 Day 1 - Intro To Java

## Topics / Concepts:

* Compiled VS Intepreted

* Static VS Dynamic

* PascalCase

* Types, Conditionals, Loops, and Operators

* Casting

* Imports & Packages

* Static Arrays, Dynamic Arrays

* Hashmaps

## End Of Day: Cafe Java

## Compiled VS Interpreted:

### Interpreted:

TL;DR Your code isn't binary and requires a host program / language to run.

Interpreted languages are languages that DO NOT compile code to binary. They instead are programs themselves (Likely written in ASM, C, C++, Rust) that operate on source code as input. E.G. They require a host language to operate (Like parasites). The interpreter first performs lexical analysis which is the act of breaking up the source code input into "tokens" that represent keywords or actions to be processed by the parser in the next step. After lexing, the parse phase begins. This is where the source code is checked for grammatical problems and errors, and that it conforms to the language's rules. During parsing, the source code is also organized into a tree structure, typically referred to as an abstract syntax tree (A.S.T). After parsing, the interpreter has gathered enough information to execute the code it generated into the AST. The AST is then walked / travered / iterated, and the code is executed.

### Compiled:

TL;DR Your code is either binary, or close to it, and must be compiled with a compiler in order to run.

Compiled languages are languages that DO compile code to binary / machine code, or come close to it. ( Bytecode in Java's case ). This means there is an additional compilation step performed before the program can even execute or run. Compilation also involves lexical analysis and parsing, but is much more strict, since it must be converted to machine code (Not necessarily binary 1s and 0s). The compiler must be able to read each line of code and substitute what it believes to be the most optimal CPU instruction opcode equivalent. An opcode is a hexadecimal number that corresponds to an operation that the CPU must perform, such as the SUB instruction which corresponds to the hexadecimal value 0x28 on intel x86 processors. It must do this subsitution for all code written. After this compilation process, we can finally execute the raw machine code (or byte code via JVM in Java's case) as an executable process.

## Java Virtual Machine - J.V.M.

TL;DR Translates code into a machine and O.S. independant executable.

The java virtual machine (JVM) lets us write code once and use that same code on any machine or operating system. The reason this is possible is because of JVM and an intermediate form of binary called bytecode upon compilation of a Java program. At this stage, we could take the resulting .class files / bytecode, and hand it off to Java / JVM on any machine or operating system and it would translate those same instructions to that machine's specific architecture. This means that the developers of Java and the JVM had to write code that would function on each operating system the same way the user intended without side effects. This means we don't have to learn how to write code for Windows, Linux, OSX, or any other platforms we intend our software to run on. Before Java, we would've had to write 3 separate programs each targeting the aforementioned platforms. With Java, we write that code once.

## Useful Resources:

https://godbolt.org/

https://javap.yawk.at

http://ref.x86asm.net/coder64.html#x0F90
