# 1.1 Our first program

## Hello, world!

A program is an ordered sequence of instructions for the computer to execute. Anyone who knows anything about programming will tell you that the first program that you write a new language has always got to be a program that displays "Hello, world!" on screen; so we will stick to the tradition also, and our first program will do exactly that!

## Breaking it down

The first line (the header) looks like this:

```
public class HelloWorld
```

and it is very important to pay attention to the word **class**. This concept is very important in Java because it is an *object-oriented language*. We will get into more detail about what this means later but for now you should understand that all the source code that we write in Java must be in a `public class` and the name of the class must match the filename.

We then move on to write more code within the {}; these tell the compiler (recall from introduction) where a class begins and ends.

As our programs become larger and more complex you can imagine that our projects will contain multiple classes therefore multiple files to keep our source code neat and organised. However, *just one* of the classes must declare the `main` method which indicates the beginning of a program.

```
public static void main(String[] args)
```

Finally let us look at the most exciting bit. The single line of code that actually produces an output! The line below prints out text of our choice on to the console when we **run** our program. 

```
System.out.println("Hello, world!");
```

## Keep in mind

* Java is case-sensitive.
* Must declare just one main method as indicated above.
* Every statement we write in java must end with a semi-colon `;` .
* Text meant to be outputted is surrounded by double quotes `" "`.
* File names should start with a capital letter, no spaces and no special characters. Instead of separating words with spaces, each word starts with a capital letter.

## FAQ

**What do public and static mean?**<br/>
Those are special words in Java that mean something quite important but let us not worry about that for now. If you are programming for the very first time you have learned a lot already. As we progress we will come across them again and at that point you would be able to understand better.

Want to learn more? Why not do so from [here](https://www.w3schools.com/java/default.asp)? 

**My first program is not working. What could be the problem?**<br/>
It is difficult to anticipate what problems you might have. However, when people just start out it is probably because they typed something incorrectly. Make sure to be very very careful and type out exactly what is in the code in this repository.
