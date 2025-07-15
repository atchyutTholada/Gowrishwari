
// 1-Hour Java Datatypes Class
// ==========================

// 1. Introduction 
// -----------------------
// - What are datatypes?
// - Why are datatypes important in Java?

// 2. Primitive Datatypes 
// ------------------------------
// - Overview: 8 primitive datatypes in Java
// - Table of primitive datatypes:

// | Type     | Size    | Example Value | Description           |
// |----------|---------|---------------|-----------------------|
// | byte     | 1 byte  | 100           | Small integer         |
// | short    | 2 bytes | 10000         | Short integer         |
// | int      | 4 bytes | 123456        | Integer (default)     |
// | long     | 8 bytes | 123456789L    | Large integer         |
// | float    | 4 bytes | 3.14f         | Single precision      |
// | double   | 8 bytes | 3.14159       | Double precision      |
// | char     | 2 bytes | 'A'           | Single character      |
// | boolean  | 1 bit   | true/false    | True or false value   |

// - Code examples for each type

// Java code examples for each primitive datatype
public class PrimitiveDatatypesDemo {
    public static void main(String[] args) {
        // byte: 1 byte, range: -128 to 127
        byte b = 100;
        System.out.println("byte: " + b);

        // short: 2 bytes, range: -32,768 to 32,767
        short s = 10000;
        System.out.println("short: " + s);

        // int: 4 bytes, range: -2^31 to 2^31-1
        int i = 123456;
        System.out.println("int: " + i);

        // long: 8 bytes, range: -2^63 to 2^63-1
        long l = 123456789L;
        System.out.println("long: " + l);

        // float: 4 bytes, single precision
        float f = 3.14f;
        System.out.println("float: " + f);

        // double: 8 bytes, double precision
        double d = 3.14159;
        System.out.println("double: " + d);

        // char: 2 bytes, single character
        char c = 'A';
        System.out.println("char: " + c);

        // boolean: true or false
        boolean bool = true;
        System.out.println("boolean: " + bool);
    }
}

// 3. Non-Primitive Datatypes 
// ----------------------------------
// - What are non-primitive/reference datatypes?
// - Examples: String, Arrays, Classes, Interfaces
// - Code examples

// 4. Type Conversion 
// --------------------------
// - Implicit (widening) conversion
// - Explicit (narrowing) casting
// - Code examples


