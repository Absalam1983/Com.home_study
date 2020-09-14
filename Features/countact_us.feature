Feature: User want to contact with us


Scenario Outline: Positive validation of contact us with valid E-Mail Address and full name

Given user visit homepage 
And click the contact us button   

When user enter "<E-Mail Address>" , "<full name>" and "<Enquiry>"  
And user click on continue button

Then user should successfully send the contact information

 

Examples:

| E-Mail Address       | full name | Enquiry  |
| pat@yahoo.com        | MD Salam  | Hi there |