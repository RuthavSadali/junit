# Purpose
In this lab, I created an object 'Area' that had multiple methods to call. After creating the object, I called whatever method I needed in order to find the area of a specific shape.

The shapes that I calculated the areas of are listed below.

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
