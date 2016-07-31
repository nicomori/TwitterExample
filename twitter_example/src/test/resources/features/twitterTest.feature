@Regression @twiterSimpleTest
Feature: Twitter - interview Nicolas Mori

Scenario Outline: Access to twitter and write a post.

Given I access to the browser "<browser>" and the path "<project_location>"
When I access to the "<url>"
And I press in the button login
And in the field username I access the "<username>" 
And in the field password I access the "<password>"
And I press in the button access
Then I verify the correct access to the dashboard

Examples:
| browser 	| username					| password		| url							 	| project_location										| 
| chrome  	| nicolas.mori+1@gmail.com	| a4610b		| https://twitter.com/?lang=es 		| /Users/nico/Documents/workspace/twitter_example/		|