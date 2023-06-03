Narrative: In order to communicate effectively to the business some functionality
As a user I want to perform an mathematical operations remotely
So that I can archive this history for future usage

Lifecycle:
Before:
Scope: SCENARIO|STORY
Outcome: ANY
Given account has 0 dollar in his bank account


Scenario: reset Before balance, add put money in bank account
Given account has 2000 dollar in his bank account
When he added 19000 to the account
Then his accounts balance should equal to 21000

Scenario: continue the same balance, put money and withdraw from bank account
When he added 19000 to the account
Then his accounts balance should equal to 19000
When he withdrawn 19000 from my account
Then his accounts balance should equal to 0
