Feature:    Github A Test



  Scenario Outline:   user validates unsuccessful Github API responses

    Given  user sets the API request on the "<url>"
    And user authenticates the API request with  with "<token>"
    When user  makes the request to get list of all repositories
    Then user should confirm  status code


    Examples:statusCode
      | url                    | token                                    |
      | https://api.github.com | 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 |