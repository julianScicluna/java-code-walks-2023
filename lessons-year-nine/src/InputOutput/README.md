# Input and Output

When we learn about computers, input and output are two of the main modules so naturally we need to deal with them when building programs.

## Display Output

We have already seen how we can output a message to the console using the following command:

`System.out.println("Do you see this message?");`

We have also used it to display joined text and variables:

`System.out.println("The discounted price is: " + discountedPrice);`

The part `println` tells Java to display text in a new line, ln is line for short. But there are other kinds of *print* that we can use if we really want to.

- `print` We can use this do display text without moving to a new line
- `printf` We can use this to format text neatly, like in a table format. This is advanced. But, I bet you are smart enough to follow this [video](https://www.youtube.com/watch?v=g_BsIuRVfvk) if you are up for the challenge! 

## Accept User Input

How can we accept input? Surely if Java provides a feature to display output that it already provides something for us to use to accept user input from the keyboard. After all, many programs would need this feature! And of course, you are right in thinking this way.

However, accepting input using Java is not as easy as displaying output. Do not fret, because some kind people came to the rescue. We are going to use a `Keyboard` *class* that was given to us for free! 

![programmer](https://media1.giphy.com/media/XXAKgZR1EbAqmuGBE9/giphy.gif)

There are some nice people out there. :)

You should find the `Keyboard` *class* in this project.

But, wait? What is a class?!

This is a long explanation and you will understand what it is in due course. However, I can tell you a few secrets about Java to help you understand.

   1. A class is a .java file of code with one or many code blocks.
   2. Java is an object-oriented language and we create classes to *model* real world objects.
   3. We have already used classes given to us by Java to display output. The class is called `System`.

### How to use the Keyboard class?

When you include the `Keyboard` class in your project then is very easy to use, and pretty similar to using `System`.

Here is an example of accepting an integer from the user and putting it in a variable:

`int integerInput = Keyboard.readInt();`

It is always a good idea to let the user know you are accepting input. So make sure to <b>display</b> prompt messages like so:

```
// display message to ask user to input an integer
System.out.println("Please input a whole number: ");
// put the number typed in by the user in a variable
int integerInput = Keyboard.readInt();
```

| Type of input      | Keyboard block to use | Syntax                                    |
| ------------------ | --------------------- |------------------------------------------ |
| int                | Keyboard.readInt()    | `ìnt integerInput = Keyboard.readInt();`  |
| float              | Keyboard.readFloat()  | `float floatInput = Keyboard.readFloat();`|
| double             | Keyboard.readDouble() | `double doubleInput = Keyboard.readDouble();`|
| char               | Keyboard.readChar()   | `char charInput = Keyboard.readChar();`   |
| byte               | Keyboard.readByte()   | `byte byteInput = Keyboard.readByte();`  |
| String **          | Keyboard.readString() | `String stringInput = Keyboard.readString();`  |

### The Scanner Class

Java does provide something for us to use to accept user input from the keyboard. It is just a little tricky to use at first.

Java provides a `Scanner` *class* in a package called `util`. To access it place the following line at the very beggining of your class file:

`import java.util.Scanner`

To get an instance of the `Scanner` *class* we need to write:

`Scanner sc = new Scanner(System.in)`

I am sure you have heard me say a number of times that Java is an object-oriented language. The `new` keyword in Java is a sign that we are creating an object in our program. The object we created with the line above gives us basic features to accept input from the user via the keyboard so that we do not have to worry about how the hardware works. The object hides the complexity of all that. All we have to do is something like:

`int age = sc.nextInt();`

`double salary = sc.nextDouble();`

Unfortunately, Java does not give us a nice and easy function to accept a character from the user. It is is a little bit more meaty...

`char c = sc.next().charAt(0);`

** We will do `String` in more detail next lesson. Notice how the data type is with a captial S... String is also a class in Java. All classes start with a capital letter! It is like a rule in Java.
** You will probably understand the line above much better once we talk about another widely used class called the `String` class in the next lesson!