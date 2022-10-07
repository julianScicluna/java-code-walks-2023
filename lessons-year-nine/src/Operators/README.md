# Operators

An operator is a character or group of characters that perform one or more actions. For example, '*' is an operator that should be placed between two integers, or variables that are of type integer to perform multiplication:

```
// multiplication in Java
int c;
c = 5 * 2;

// or
int a = 5;
int b = 2;
c = a * b;
```

In the coming lessons we will cover the following kinds of operators:
- Arithmetic Operators (to do math)
- Relational Operators (to do comparisons)
- Logical Operators (to do boolean logic and expressions, hello there Chapter 10)
- Assignment Operators (to update the value of a variable, we already met with one of these)

# Guess what, we already met with an assignment operator!

When we did our lesson Basic Variables, we already met with one operator. Recall...

```
boolean isYoung = false;
```

The '=' is an *assignment operator* that puts the value 'false' in a memory location named 'isYoung' in our computer.

# Arithmetic Operators

It is very common to need to perform some kind of arithmetic. Java has 4 familiar arithmetic operators plus a remainder operator. Refer to the table below:

| Operation      | Java Operator |
| -------------- | ------------- |
| Addition       | +             |
| Subtraction    | -             |
| Multiplication | *             |
| Division       | /             |
| Remainder      | %             |

## Usage

```
int x;
x = 10 + 25;
```
It is always a good idea to group terms using parenthesis when expressions have multiple operators. Precendence as follows: brackets, division, multiplication, addition and subtraction (BODMAS).  

```
double cost;
cost = 500 * (1 + 17.5/100);
```

## The remainder operator or modulus

Returns remainder after integer division. Some examples:

| Expression     | Result        |
| -------------- | ------------- |
| 29 % 9         | 2             |
| 6 % 8          | 6             |
| 40 % 40        | 0             |
| 10 % 2         | 0             |

## Usage

```
x = 10 % 2; // x will be 0
x = 10 % 3; // x will be 1
```

# Logical Operators

An operator that works on two boolean operands, or variables. Except for NOT which is the only unary operator, so it gets applied to only one operand.

| Operation        | Java Operator |
| ---------------- | ------------- |
| `&&`             | AND           |
| <code>&#124;&#124;</code>        | OR            |
| `!`              | NOT           |
| `^`              | XOR           |

# Relational Operators

An operator that works on two operands of the same type so that we can make comparisons e.g. which is larger, are they equal?

| Expression     | Operator      |
| -------------- | ------------- |
| a > b          | Greater than  |
| a < b          | Less than     |
| a == b         | Equal         |
| a != b         | Not equal     |

## Usage

```
int a = 3;
int b = 4;

boolean isGreater = a > b; // will result in false
```

# Assignment Operators

As we already seen, assignment operators are characters used to update a value of a variable. We have already seen the '=' operator. However, Java gives us assignment operators that also perform basic arithmetic! Look at the table below.

| Expression     | Result        | Equivalent    |
| -------------- | ------------- |-------------- |
| =              | a = 2;        |a = 2;         |
| +=             | a += 2;       |a = a + 2;     |
| -=             | a -= 2;       |a = a - 2;     |
| *=             | a *= 2;       |a = a * 2;     |
| /=             | a /= 2;       |a = a / 2;     |
| %=             | a %= 2;       |a = a % 2;     |

## Usage

```
int a = 4;
a += 2; // a gets updated to 6

// you can also do
int b = 2;
a += b; // a gets updated to 8 in the line
```