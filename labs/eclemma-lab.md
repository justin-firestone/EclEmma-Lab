### Introduction

Some Raikes School students are working on prediction algorithms for Among Us. They have replicated a portion of the game in Java with an additional class titled `SuspiciousCalculator` to capture different prediction functionalities, but they forgot to write unit tests! You will write unit tests and use EclEmma to provide code coverage statistics for your test suite.

### EclEmma

[JUnit Assert class link](https://junit.org/junit4/javadoc/4.13/org/junit/Assert.html) You will use a built-in extension for Eclipse called EclEmma. After cloning and opening this project in Eclipse, you can run EclEmma:

1. Right click on the project

2. Click on `Coverage As -> JUnit Test`

   <img src="../images/Step2.png" alt="Screenshot showing how to run EclEmma" style="zoom:25%;" />

3. A panel will then pop up showing the code coverage for the different packages and the classes in the project

4. Lines that have been covered will be highlighted in green and lines that have not will be highlighted in red

   <img src="../images/Step4.png" alt="Screenshot showing code coverage percents and red/green lines" style="zoom:25%;" />

5. To remove these highlights, select `Remove All Sessions` in the panel

   <img src="../images/Step5.png" alt="Screenshot showing button for removing all sessions" style="zoom:50%;" />

### Challenge

Work with your team to obtain as much code coverage as possible in `src.edu.unl.raikes.amongus`. However, you are allowed only 20 unit tests! Each unit test must follow traditional best practices for unit tests, meaning you cannot use loops or other strategies to effectively violate the "one assert per unit test" rule. Write concise unit tests that test specific pieces of functionality. All tests must include a meaningful error message! “Was True, should have been False” is not meaningful.

### Deliverables

Take a screenshot of your code coverage and add it to your reflection paper.

**Reflection paper:** As a group, write a roughly 2-page reflection paper outlining your experience creating your unit tests. Discuss, at minimum, the following:

1. How code coverage is useful
2. What code coverage does or does not tell you about your unit tests
3. How you could have used code coverage on previous assignments in other coding courses to create better unit tests
4. General takeaways from using this tool and its output
5. How you could apply what you learned to the class project

**Code:** Submit your team's `AmongUsTests.java` file with your 20 completed unit tests to Canvas as a separate file.
