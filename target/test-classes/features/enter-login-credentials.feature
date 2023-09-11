Feature: User Login

	@LoginScreenPage
	Scenario Outline: User successfully logs in with valid credentials
	
		Given the user is on the login page
		When the user enters valid credentials <Login> and <Password>
		Then the user should be redirected to the home page
		And the home page should be displayed
		
		Examples:
		| Login  										| Password  |
		| joao.ger@maiffarm.com.br 	|	123				|


	@LoginScreenPage
	Scenario: Blank Username and Password
	
		Given the user is on the login page
		When the username and password are empty
		Then the button enter should be enabled

		
	@LoginScreenPage
	Scenario Outline: Invalid username and password
	
		Given the user is on the login page
		When enter an invalid <Login> and <Password> into the fields
		Then the user should be able to see the error message.
		And the user remains on the login page
		
		Examples:
		| Login  										| Password  		|
		| noexist@maiffarm.com.br 	|	noexist12			|