@Discovery
Feature: Discovery My Videos validations

  Scenario: Verify the videos added to favourites list appear with correct title and description
    Given I launch Chrome browser and open url
    When I add video "shark-week" to favourites list
    And I add video "naked-and-afraid-xl" to favourites list
    And Navigate to my videos
    Then Verify the first video appear with correct title "SHARK WEEK" and description "Television's longest running must-see summer TV event is filled with all things sharks! Shark Week 2019 will kick off Sunday, July 28."
    And Verify the second video appear with correct title "NAKED AND AFRAID XL" and description "A group of the best survival experts in the world take on an un-survivable situation: 40 days. 40 nights. No food, water or clothes. To…"