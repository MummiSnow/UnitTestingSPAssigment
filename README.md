# UnitTestingProject
School project at Cph Business Academy for unit testing

Addition task for given assignment:

Run a code coverage analysis on the chosen project.

1. How much of the code is covered by test cases to start out?

  100%

2. Could and should the code coverage of your project be raised?

    Coverege can depending on project vary, since this is purely implemented logic, 100% is a good number, but given any number of getters and setters, coverage at 80% or maybe even way less is very reasonable. 
  The important parts to test remain to be logic and business critical use cases.
  
  
Do not implement anything, but identify the parts of the code to focus on if more test cases were to be
implemented.

    I could have possibly tested for the given max value of year ((2^31)-1) however, given the safety net of integers, I decided against it due to Java simply not accepting non integer input into and integer
