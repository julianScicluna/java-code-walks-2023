# Making Decisions

So far we have just written instructions in a particular order (input, process, output) but very often we need our programs to make decisions so that the algorithms we write can take one path or another depending on a situation... e.g. if we are assembling a burger perhaps we can decide whether or not to include tomatoes because perhaps we don't like them.

Key points:
- A program that can make choices can behave slightly differently each time it is run depending on the input.
- A program that just executes instructions in sequence will behave the same way each time no matter the input.


In Java we can code decision making in a few ways...

1. an if statement
2. an if ... else statement
3. a switch statement

## The IF statement

```
if (/* boolean logic goes here (hello again chapter 10) */) {
    // instruction(s) that only get invoked when true
}
```

## The IF ... ELSE statement

```
if (/* boolean logic goes here (hello again chapter 10) */) {
    // instruction(s) that only get invoked when true
} else {
    // instruction(s) that only get invoked when false
}
```
<img src="https://static.javatpoint.com/tutorial/arduino/images/arduino-if-else-and-else-if.png" />

## The SWITCH statement

Do you find yourself doing too many IF statements nested into each other? Or too many IF...ELSE statements? Maybe you need a switch! A switch statement tests whether a given variable has a particular value from a possible set of values. This works very well with three or more values, for example, checking the day of the week of a particular date!

```
switch(/* a variable to check */) {
    case valueOne : {
        // instruction(s) that only get invoked when variable has valueOne
        break; // use break to get out of the switch when there is a match
    }
    case valueTwo : {
        // instruction(s) that only get invoked when variable has valueTwo
        break;
    }
    case valueThree : {
        // instruction(s) that only get invoked when variable has valueThree
        break;
    }
    default : {
        // instruction(s) that only get invoked when variable has none of values
    }
}
```
Why not try it out to check whether your code looks neater?

<img src="https://cdn.programiz.com/sites/tutorial2program/files/cpp-switch-flowchart.png" height="500" width="auto">

# Arithmetic Comparison and Boolean Logic

In Operators we already covered how we can compare values and evaluate boolean expressions. This information is going to come really handy now! When we apply decision making, we normally want the program to make decisions based on a combination of:

## Relational Comparison

- Equality `==` e.g. `password == confirmPassword`
- Less Than `<` e.g. `a > b`
- Greater Than `>` e.g. `b < c`
- Greater Than or Equal To `>=` e.g. `myHeight >= 110`
- Less Than or Equal To `<=` e.g. `myAge <= 16`

## Boolean Logic
- AND `&&` e.g. `isSunny && isWarm`
- OR  `||` e.g. `isSunny || isWarm`
- NOT `!` e.g. `isSunny && !isRaining`