package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class TodoTask extends CommonMethods {


    // Scenario 1: Navigate to the website and verify no ToDos
    @Given("I am on to do app for the first time")
    public void i_am_on_http_localhost_for_the_first_time() {

    }
    @Then("I should see No ToDos")
    public void i_should_see_no_to_dos() {
        String expected="No ToDos";
        String actual = driver.findElement(By.xpath("//p[@class='app_emptyText__11zUS']")).getText();

        Assert.assertEquals(expected,actual);
    }

    // Scenario 2: Click on Add Task button and verify the dialog
    @Given("I click on Add Task button")
    public void i_click_on_add_task_button() throws InterruptedException {

        WebElement addTaskButton = driver.findElement(By.xpath("//button[@type='button']"));
        System.out.println(addTaskButton.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", addTaskButton);
        Thread.sleep(5000);

    }

    // Scenario 3: Create a ToDo

    @Given("I am on a Add ToDo dialog box")
    public void i_am_on_a_add_to_do_dialog_box() {

    }

    @Then("I should see a dialog to add tasks")
    public void i_should_see_a_dialog_to_add_tasks() {

    }
        @Given("I provide Title and Status")
        public void i_provide_title_and_status() {

            WebElement titleField = driver.findElement(By.id("title"));
            titleField.sendKeys("My New ToDo");
            WebElement statusField = driver.findElement(By.id("type"));
            statusField.sendKeys("Incomplete");
        }

    @Then("I should see Update TODO dialog box")
    public void i_should_see_update_todo_dialog_box() {

    }

    @Given("I click Add Task")
    public void i_click_add_task() {

        WebElement addTaskButtonInDialog = driver.findElement(By.xpath("//button[@type='submit']"));
        addTaskButtonInDialog.click();
    }

    // Scenario 4: Click on Edit icon and verify the Update ToDo dialog

    @Then("I should see that task on ToDo list home page")
    public void i_should_see_that_task_on_to_do_list_home_page() {

    }
    @Given("I click on Pencil \\(Edit) icon")
    public void i_click_on_pencil_edit_icon() {
        WebElement editIcon = driver.findElement(By.xpath("(//div[@class='todoItem_icon__+DYyU'])[2]"));
        editIcon.click();
    }

    // Scenario 5: Update a ToDo

    @Given("I am on a Update TODO dialog box")
    public void i_am_on_a_update_todo_dialog_box() {

    }
    @Given("I update the Title and Status")
    public void i_update_the_title_and_status() {

        WebElement updatedTitleField = driver.findElement(By.id("title"));
        updatedTitleField.sendKeys("Updated ToDo");
        WebElement updatedStatusField = driver.findElement(By.id("type"));
        updatedStatusField.sendKeys("Completed");
    }

    @Then("I click Update Task")
    public void i_click_update_task() {

        WebElement updateTaskButtonInDialog = driver.findElement(By.xpath("//button[@type='submit']"));
        updateTaskButtonInDialog.click();
    }

    @Then("I should see the updated task on ToDo list home page")
    public void i_should_see_the_updated_task_on_to_do_list_home_page() {

    }

    // Scenario 6: Delete a ToDo

    @Given("I click on delete icon")
    public void i_click_on_delete_icon() {

        WebElement deleteIcon = driver.findElement(By.xpath("(//div[@class='todoItem_icon__+DYyU'])[1]"));
        deleteIcon.click();
    }

    @Then("I should see the corresponding task getting deleted")
    public void i_should_see_the_corresponding_task_getting_deleted() {

        driver.quit();

    }
}










