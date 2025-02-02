Feature: OrangeHRM
@loginsingledata
Scenario: validate login test
Given  i launch url in chrome url
When  i enter username and password in textbox
When  i click on login button
Then  verify the url