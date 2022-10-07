# Statements, Expressions and Blocks

## Statement

A statement is simply an instruction that tells the programming language what to do. In Java, statements are a single line of code that should end with a ‘;’. You should already be familiar with the examples below.

```
int score; // variable declaration

System.out.println(“Hello, world!”); // print out text on the console
```

## Expression

An expression a piece of code that contains a series of variables, operators and values that can evaluate into a single value. So far, our expressions have been really simple statements, using a single operator at most after the = operator.

Take a look at a few examples:

```
int score = 80; // expression to declare and assign a variable

int a = 5; 
a += 5; // expression to do operator assignment

a = 2; 
b = 4; 
c = a + b; // expression to do arithmetic

```

But expressions can be longer and have more than one operator, just make sure to group things properly!

```
double a = 2.2;
double b = 3.4;
double result = a + b – 1.3;
```

In class today, we will be playing with more complex expressions such as...

```
double price, vat, due; 
price = 500;
vat = 17.5;
// expression to calculate amount due, notice the use of variables, operators and numerical values
due = price + (price * (vat/100)); // note how brackets are being used to group terms correctly
```
## Block

A block is group of statements that is enclosed in curly braces {}.

```
{  // start of block
	System.out.println(“Hi, there”);
	int b = 7;
    int a = 5 + (2 * b);
} // end of block

```



