Feature: check product on clearance fuctionality
  Background: operating system :windows 7
              Browser version :chrome 55.0
    @QueenTest
    Scenario: user check clearance product sucessfully
      Given I am  already home page
      When I click on clearance
      Then I see I am on clearance page
      When I click on home and garden
      Then I see I am on clearance home and garden page
      When I click on garden furniture
      Then I can see garden furniture page
