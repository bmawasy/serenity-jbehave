JBehave Story - Calculate Salary
Narrative:
As an a business I wat to pay to the employee


Scenario: end of month
Given account has 2000 dollar in his bank account
Given the employee monthly salary is 1000 dollar
When the employee got his monthly salary to the bank account
Then his accounts balance should equal to 3000
Then the yearly salary should be 12000
