Feature:  rover control

  Scenario: Rover should be able to return on different directions from (0 0) N
    Given rover turns left
    When rover turns right
    Then rover moves one grid forward

  Scenario: Rover should be able to navigate to exact location by inputting (2 4) E
    Given rover moves to given location 2 4 2 and verify the location

  Scenario: Rover should be able navigate by setting exact location and process positions
    Given rover moves to given location 1 2 1
    When rover processing to move by letters "LMLMLMLMM" then verify the location