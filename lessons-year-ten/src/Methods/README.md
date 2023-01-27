# Methods

We have already started defining and calling methods to be quite frank with you, you just did not know it. Every time we created a new class in Java we always declared the `main()` which is the entry point of a program in Java. 

Let's have a closer look:

```
public class SimpleCalculator() {

    // This block of code is a method that is called when you click on 'Run'
    public static void main(String[] args) {
        // ...
    }
}
```

So what does a method look like? A method is made up of a...

- Header
  *The first four words followed by parenthesis with parameters inside*
- Body
  *The two curly brackets and its contents*

## Using the Method

This is also known as a *method call*. This is a recall of what we normally do in our lessons. 
The lesson code is neatly stowed in its own class and whenever we want to run it, we simply call it in our `App` class.

```
public class App {
    public static void main(String[] args) {
        // This is a method call
        ClassName.lesson()
    }
}
```
## Methods Check List

As we create some methods I will be showing you a few things that we can do:

- Method names that make sense and proper convention
    Method name that has one word: `add`
    Method name that has more than one word: `addTwoNumbers`
- Method without parameters e.g. ``lesson()``
- Method with parameters e.g. ``sub(int a, int b)``
- Method that does not give back a value, we say it is *void* e.g. ``sayHello()``
- Method that does give back a value, we say it *returns* something e.g. ``mul(int a, int b)``