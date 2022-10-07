# Loops in Java

Allows us to instruct the computer to carry out a task over, and over again by repeating a small body (encapsulated in {}) of code. The programming structure that is used to control this repetition is often called a loop.

We will be looking at the most common two in Java:

## For Loop

Let's say that we want to write a simple program that needs to display a square (five by five).

                                    * * * * *
                                    * * * * *
                                    * * * * *
                                    * * * * *
                                    * * * * *

In the beginning one would probably code:

```
System.out.println("* * * * *");
System.out.println("* * * * *");
System.out.println("* * * * *");
System.out.println("* * * * *");
System.out.println("* * * * *");
```

And this is valid, but if we had to repeat the same code every time we wanted repetition our code would get big very quickly. Also something like the above does not give us flexibility, what if we do not know the width of the square and it should be based on user input?

We have so much more control using the `for loop`. This is how it works:
1. A loop counter is initialised to a value
2. There is a test condition for the counter, while this test returns a true then it loops; as soon as it tests false the loop breaks.
3. After each repetition the value of the counter must change (not doing so will result in an infinite loop -- not fun).

```
for (/* start counter */; /* test counter */; /* change counter; */) {
    // instruction(s) to be repeated go here
}
```

Examples:
```
for (int i = 1; i <= 5; i = i + 1) {
    System.out.println("* * * * *");
}
// i = i + 1 can be shortened to i++
```

Example in Loops:

```
System.out.println("Let us do the three times table...");
    for (int i = 1; i <= 12; i++) {
        int timesRow = 3 * i;
        System.out.println(i + " x 3 = " + timesRow);
    }
}
```