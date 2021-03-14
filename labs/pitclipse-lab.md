# raik-383-pitclipse-lab
### Introduction

The Raikes School students are thankful for your efforts in testing their prediction algorithms, however, they realize that more bugs could still exist! Instead of writing tests to maximize the number of lines covered, they want you to carefully write your tests so that the program outcomes are covered appropriately.

### Pitclipse

Mutation testing is a method of automatically adding faults into your code (called mutations) and checking to see if your tests are written well enough to detect these faults or not. If your tests still pass with the mutation, then that is a sign your tests can be more specific!

Pitclipse is a library allowing you to test the quality of your tests through mutation testing within Eclipse. In this lab, you will be attempting to kill as many mutations as possible by writing even more unit tests. To add Pitclipse to your Eclipse, use the following steps: follow Installation steps listed in [Pitclipse's GitHub](https://github.com/pitest/pitclipse) read me.

To run Pitclipse, use the following steps:

1. Right click on your project

2. Click on `Run As -> PIT Mutation Test`

   ![img](https://lh6.googleusercontent.com/wF_-dQu7oIQZoNSl_mH92OUMORPU9vAuOGe7W30nkt1EjzVjujiXZ32UQCJH1_avsS0SisMNYzRPyolsIJd4JbMoMm0HNOY6iSwLz7rwURWylqGv_RIVEuCiq3kx0zuR1-uwzAr9)

3. After a lot of red text, you should have the PIT Mutations and PIT Summary pages within your navigation bar. If a window doesn't show up go to `Window` > `Navigation` > `Find Actions` and search `PIT Summary` or `PIT Mutations`

4. On the PIT Summary page, you will see how well your tests did at crushing mutations and a breakdown by class. If you navigate to a class of code from within this interface, you can always navigate back by right clicking the page then clicking the back button.

   ![img](https://lh4.googleusercontent.com/26uT8sHrzvPVWnNvbWAfaaOmT2DcXACG2H50mmYFsmaoyBl-4k_iYxlvcrr3Y3c7-0Vaj_bxAk3vsNI8X1-artAVCvzGnbqTL19noVYC85o2yKR6vu48rUTHesbaU9tyttN_U0e-)

5. On the PIT Mutations page, you can see each survived or killed mutation in-depth, and it will tell you the objective of the mutation and what line(s) it can be found on.

   ![img](https://lh4.googleusercontent.com/IAurC9wjryJJAk4Fztt8Q-BQc6q23Bs6dfQ4V-tY5t5sALmxWptpdervB04DoNPFAVPpVvns8jHHC3YjhB4QIQY9moPEsZm6e8WnXNPn-I8fTXi7TQaxjVgfl3jNwk9UCd4xpVb0)

### Challenge 

For this lab, your challenge is to work with your team to add an additional 20 unit tests focused around maximizing the mutation coverage of your program. Because `MainApplication.java` can be a source of many mutations that you are not allowed to test, for this lab, the first step is to delete the `MainApplication.java` file. After deleting the `MainApplication.java` file, you should create another class within the tests package named `AmongUsMutationTests`. In this file, you can create an additional 20 unit tests, whose names do not matter, similar to those created in the previous lab.
Note: If you had any unit tests previously that depended on the `MainApplication` class, those should be commented out after deleting the file.

### Unit Tests

We would like you to write unit tests that test very specific pieces of functionality and are concise. Every line of code in the test should do something important and contribute to the functionality being tested. This means that there should only be one assert statement per unit test. This is to ensure the uniformity of tests between teams. (Please do not consolidate multiple mini-tests into a boolean and test the value of that). All tests require an error message, making it clear what went wrong. “Was True, should have been False” is not valid.

### Deliverables
**Leaderboard:** Again, once you feel like you have maximized your mutation coverage, you can post a screenshot of your coverage to [this Google Doc](https://docs.google.com/document/d/1yeSXUBekgRyrwFzWLNS9xvkz7n97-l3lDbMstK5P1PE/edit?usp=sharing).

**Reflection Paper:** As a group, write a 2-3 page double spaced reflection paper outlining your experience creating the additional unit tests. In the paper, please reflect on:

1. How mutation coverage differs from the code coverage that you measured in the previous lab
2. What additional insights mutation coverage can offer about your unit tests
3. Downsides of the mutation coverage metric
4. What your takeaways from this lab are
5. How you could apply what you learned from this lab to your project

**Code:** Lastly please submit your team’s `AmongUsMutationTests.java` file with your additional 20 unit tests.

The reflection paper and code file can both be turned in on Canvas for this assignment.
