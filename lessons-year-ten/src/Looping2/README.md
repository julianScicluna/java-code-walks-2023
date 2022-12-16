# Loops in Java

Allows us to instruct the computer to carry out a task over, and over again by repeating a small body (encapsulated in {}) of code. The programming structure that is used to control this repetition is often called a loop.

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

```
System.out.println("Let us do the three times table...");
    for (int i = 1; i <= 12; i++) {
        int timesRow = 3 * i;
        System.out.println(i + " x 3 = " + timesRow);
    }
}
```

## While Loop

Sometimes, repetition which is not fixed is required. In such cases a for loop is not very useful. However, the `while` loop offers non-fixed iteration.

```
while(/* test goes here */) {
    // instruction (s) to be repeated go here, may not be run!
}
```

## Do While Loop

This is very similar to a while loop, just the test condition is at the end not at the beginning.

```
do {
    // instruction (s) to be repeated go here, run at least once
} while (/* test condition goes here */) {
}
```

## Picking The Right Loop

As we keep learning about new constructs and tools, the challenge is now going to be to decide what construct is going to help us reach our goals best. With three different loops to choose from, even picking the right loop is going to be tricky. Don't worry... I have a few tips:

### You want a For Loop if...

There is a clear start and end (like a set of stairs, you are either going up in a step, or going down in a step)

### You want a While Loop if...

You cannot know how many times a block of code is going to repeat, but you know you should stop when something becomes true.

### You want a Do While Loop if...
You don't know how many times a block of code is going to repeat, but you know that it needs to run at least once, and stop when something becomes true. 
