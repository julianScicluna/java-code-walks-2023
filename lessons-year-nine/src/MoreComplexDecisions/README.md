# More Complex Decisions

Recall the humble `if` statement from previous lessons...

```
if (temperature >= 26) {
    System.out.println("It is warm.");
}
```

In reality, any valid Java commands can be inserted in between the `{ ... }` curly brackets. Even another `if` statement, so an `if` inside an `if`. This form of control is referred to as *nesting*. With nesting we are able to program very complex decisions. Beware, they can get a bit *too complex* but don't worry, you are ready for this!

<img src="https://media.giphy.com/media/YPahwXZZ5zyySJRRB7/giphy.gif">

Here is an example of a program that asks a student to enter his or her lab group and depending on the group the program displays the correct lesson time and room number:

```
public class LabGroupTimeTable {
    public static void main(String[] args) {
        System.out.println("Enter your year e.g. 8, 9");
        int year = Keyboard.readInt();

        System.out.println("Enter your group letter, 'X' or 'Y'");
        char group = Keyboard.readChar();

        if (year == 8) {
            System.out.print("Time: 10.00am | ");
            if (group == 'X') {
                System.out.print("Room: A524");
            } else {
                System.out.print("Room: A525");
            }
        } else if (year == 9) {
            System.out.print("Time: 12.05pm | ");
            if (group == 'X') {
                System.out.print("Room: A523");
            } else {
                System.out.print("Room: A524");
            }
        }
    }
}
```

You can notice *nesting* in the following part:

```
if (year == 8) {
    System.out.print("Time: 10.00am | ");
    // We are nesting here...
    if (group == 'X') {
        System.out.print("Room: A524");
    } else {
        System.out.print("Room: A525");
    }
}
```

Tip: Use even tabs to make the code nice to read, and write meaningful comments.

# Pseudocode

We learn Java to learn how to express algorithms that can be run by a real computer. However, a programming language is not the only way to talk about algorithms.

In fact, we can describe algorithms in the following ways:
1. Simple English
2. Flow charts
3. Pseudocode <== 
4. Programming language like Java <==

Today, we learnt a little bit about pseudocode which is as an informal way of programming describing a program without strict rules. It is used to explain a rough idea of what to do with a programming language. 

By now, we got used to seeing `TODO`s in our comments. Up to now, they were in simple English and you will continue to see comments in English. However, sometimes it is so much easier to give you clues in pseudocode. 

Below is a comment that summarises an `if` statement in pseudocode:

```
// TODO: if fruit.equals("apple") then isApple = true
```

There is no Java keyword `then` so the above needs to be converted to valid Java. From now on, you will be seeing comments similar to the above in your programming tasks. This should not be too difficult so be brave and give it a go!

<img src="https://c.tenor.com/NII7Z9YQLsMAAAAC/go-for-it-you-can-do-it.gif">
