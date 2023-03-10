# Arrays

- An <b>array</b> is a *collection* or *list* of <u>similar elements</u> grouped by a variable name. Here is an example of a list of double data items that are grouped under the name `myRealNumbers`. 

```
double[] myRealNumbers = new double[10]; 
```

- Elements in an array occupy memory locations that are next to each other. In Java, array positions start at zero and go to up to <b>one less than the size</b> of the array.

```
double firstElements = myRealNumbers[0];

double lastElement = myRealNumbers[9];
```

- A single array element can be treated just like any other variable in Java if we use the `[ ]` and specify the correct position.

```
// when we just have one price and we are calculating a discountedPrice
double price = 0.5;

double discountPrice = price - 0.1;

// when we have many prices, but we want to just make use of one of them in an array
double prices = new double[5]; // list of prices

double discountedPrice = prices[2] - 0.1;
```
