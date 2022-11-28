# Unit Testing Examples

We're going to start out with the `Demo` class and talk about how to unit test the `addEm` method. Once we create the unit tests we'll implement `addEm` to make sure it works correctly.

We'll look at the `assert` method, but there are tons of other [assertation methods](https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/Assertions.html) that you are free to use. 

Once we've done that you'll move on and create test methods for each of the methods in `Area`.



## The Lab...

In the project you'll also find a file named `Area.java`. For this lab you need to create at least 4 unit test methods for each of the area methods in `Area`. You'll also need to implement each of the methods to make sure that your unit tests are correct, but you should create the test files first to prove that your implementations are correct, not the other way around. 



## Triangle

There are 3 overloaded versions of the triangle area method. One takes just the side and assumes an equilateral triangle. One takes all 3 side lengths and uses Heron's formula. And the third takes the base and height.

### Equilateral Triangle

<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;\frac{\sqrt{3}}{4}&space;\times&space;s^{2}" title="\Large area = \frac{\sqrt{3}}{4} \times s^{2}" />

### 3 Known Sides

This is known as [Heron's Formula](https://en.wikipedia.org/wiki/Heron%27s_formula). To solve using 3 sides you also need to know the semiperimeter, which we will call s. The 3 sides will be a, b, and c.

<img src="https://latex.codecogs.com/gif.latex?\Large&space;s&space;=&space;\frac{a&space;&plus;&space;b&space;&plus;&space;c}{2}\" title="\Large s = \frac{a + b + c}{2}\" />



<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;\sqrt{s&space;\times&space;(s&space;-&space;a)&space;\times&space;(s&space;-&space;b)&space;\times&space;(s&space;-&space;c)}" title="\Large area = \sqrt{s \times (s - a) \times (s - b) \times (s - c)}" />





### Base and Height

This is probably the triangle area formula that you know from Geometry.

<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;\frac{height&space;\times&space;base}{2}" title="\Large area = \frac{height \times base}{2}" />





## Square

This is the easiest area formula on this lab. Knowing side length \(s\), the formula is

<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;s^2" title="\Large area = s^2" />



## Pentagon

Given side length s

<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;\frac{1}{4}&space;\times&space;\sqrt{5&space;\times&space;(5&space;&plus;&space;(2&space;\times&space;\sqrt{5}}))&space;\times&space;s^2" title="\Large area = \frac{1}{4} \times \sqrt{5 \times (5 + (2 \times \sqrt{5}})) \times s^2" />

## Hexagon

Given side length s

<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;\frac{3&space;\times&space;\sqrt{3}}{2}&space;\times&space;s^2\" title="\Large area = \frac{3 \times \sqrt{3}}{2} \times s^2\" />

## Octagon

Given side length s

<img src="https://latex.codecogs.com/gif.latex?\Large&space;area&space;=&space;2&space;\times&space;(1&space;&plus;&space;\sqrt{2})&space;\times&space;s^2" title="\Large area = 2 \times (1 + \sqrt{2}) \times s^2" />



## Icosagon

An icosagon is a 20 sided polygon.

Given side length s

![img](https://latex.codecogs.com/gif.latex?%5CLarge%20area%20%3D%205%20%5Ctimes%20s%5E2%20%5Ctimes%20%281%20&plus;%20%5Csqrt%7B5%7D%20&plus;%20%5Csqrt%7B5%20&plus;%202%20%5Ctimes%20%5Csqrt%7B5%7D%7D%29)


## Thanks
And thanks to [Codecogs](http://www.codecogs.com) for the scripts to make images out of math formulas. 