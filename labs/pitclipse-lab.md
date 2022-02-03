### Introduction

Time to kill some mutants!

### Pitclipse

Mutation testing involves automatically inserting faults into your code (mutations) and then checking to see whether your tests detect these faults (kill mutants). If tests still pass when running on the mutated code, it could mean your test suite is inadequate!

Pitclipse is a tool which performs mutation testing in Eclipse. You will try to kill as many mutants as possible by writing 20 more unit tests. To add Pitclipse to your Eclipse, follow [Pitclipse's GitHub](https://github.com/pitest/pitclipse) read me.

To run Pitclipse:

1. Right click on your project

2. Click on `Run As -> PIT Mutation Test`

   ![img](https://lh6.googleusercontent.com/wF_-dQu7oIQZoNSl_mH92OUMORPU9vAuOGe7W30nkt1EjzVjujiXZ32UQCJH1_avsS0SisMNYzRPyolsIJd4JbMoMm0HNOY6iSwLz7rwURWylqGv_RIVEuCiq3kx0zuR1-uwzAr9)

3. You should have the PIT Mutations and PIT Summary pages within your navigation bar. If a window doesn't show up go to `Window` > `Navigation` > `Find Actions` and search `PIT Summary` or `PIT Mutations`

4. On the PIT Summary page, you will see how well your tests did killing mutants with a breakdown by class. If you navigate into a class, you can navigate back by right clicking the page then clicking the back button.

   ![img](https://lh4.googleusercontent.com/26uT8sHrzvPVWnNvbWAfaaOmT2DcXACG2H50mmYFsmaoyBl-4k_iYxlvcrr3Y3c7-0Vaj_bxAk3vsNI8X1-artAVCvzGnbqTL19noVYC85o2yKR6vu48rUTHesbaU9tyttN_U0e-)

5. On the PIT Mutations page, you can see each survived or killed mutation and it will tell you give you line information.

   ![img](https://lh4.googleusercontent.com/IAurC9wjryJJAk4Fztt8Q-BQc6q23Bs6dfQ4V-tY5t5sALmxWptpdervB04DoNPFAVPpVvns8jHHC3YjhB4QIQY9moPEsZm6e8WnXNPn-I8fTXi7TQaxjVgfl3jNwk9UCd4xpVb0)

### Challenge 

Work with your team to add an additional 20 unit tests focused around maximizing the mutation coverage of your program. Because `MainApplication.java` can be a source of many mutations you are not allowed to test, the first step is to delete the `MainApplication.java` file. After deleting the `MainApplication.java` file, you should create another class within the tests package named `AmongUsMutationTests`. In this file, you can create an additional 20 unit tests, whose names do not matter, similar to those created for the EclEmma lab. Comment out any prior unit tests which depended on the `MainApplication` class.

### Unit Tests

Again, you are allowed only 20 unit tests! Each unit test must abide by the traditional best practices for unit tests, meaning you cannot use loops or other strategies to effectively violate the "one assert per unit test" rule. Write unit tests that test very specific pieces of functionality and are concise. All tests require an error message, making it clear what went wrong. “Was True, should have been False” is not a sufficient message.

### Deliverables
Take screenshots that show the metrics of your test suite and add to your reflection paper.

**Reflection Paper:** As a group, write a 2-3 page double spaced reflection paper about your experience creating your new unit tests. Reflect on:

1. How mutation coverage differs from the code coverage that measured in the EclEmma lab
2. What additional insights mutation coverage can offer about your unit tests
3. What are any downsides of the mutation coverage metric
4. What your general takeaways from this lab are
5. How you could apply what you learned from about mutation testing to your project

**Code:** Submit your team’s `AmongUsMutationTests.java` file with your additional 20 unit tests (both the paper and file should be uploaded to Canvas.
