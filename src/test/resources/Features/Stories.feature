Feature: First time user

  Background:  Given I am on to do app for the first time

  @Test1
  Scenario: I should see no ToDos
    Then I should see No ToDos

  @Test2
  Scenario: I should be able to see a Add ToDo dialog box
    And I click on Add Task button


  @Test3
  Scenario: I should be able to create a ToDo
    Given I click on Add Task button
    And I provide Title and Status
    And I click Add Task


  @Test4
  Scenario: I should be able to see a Update ToDo dialog box
    Given I click on Add Task button
    And I provide Title and Status
    And I click Add Task
    And I click on pencil icon
    Then I should see Update TODO dialog box

  @Test5
  Scenario: I should be able to update a ToDo
    Given I click on Add Task button
    And I provide Title and Status
    And I click Add Task
    And I click on pencil icon
    Then I should see Update TODO dialog box
    And I update the Title and Status
    And I click Update Task
    And I should see the updated task on ToDo list home page

  @Test6
  Scenario: I should be delete a ToDo
    Given I click on Add Task button
    And I provide Title and Status
    And I click Add Task
    And I click on pencil icon
    Then I should see Update TODO dialog box
    And I update the Title and Status
    And I click Update Task
    And I should see the updated task on ToDo list home page
    And I click on delete icon
    Then I should see the corresponding task getting deleted