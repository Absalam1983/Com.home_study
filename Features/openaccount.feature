 Feature: User want to create a benk account


Scenario Outline: Positive create a valid bank account with valid E-Mail Address and Password

Given user should visiting homepage 
And click create a new bank account button

When user should enter "<E-Mail Address>" and "<password>"  
And user click on sign in button

Then user should successfully login to the system
And click on Log off Button for logout
 

Examples:

| E-Mail Address       | password |
| pat@yahoo.com        | Abc123   |
