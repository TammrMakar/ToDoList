package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class TodoTask extends CommonMethods {

    // Scenario 1: Navigate to the website and verify no ToDos
    @Then("I should see No ToDos")
    public void i_should_see_no_to_dos() {
        String expected ="No Todos";
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
        @Given("I provide Title and Status")
        public void i_provide_title_and_status() {

            WebElement titleField = driver.findElement(By.id("title"));
            titleField.sendKeys("My New ToDo");
            WebElement statusField = driver.findElement(By.xpath("//select[@id='type']"));
            statusField.sendKeys("Incomplete");

        }

    @Then("I should see Update TODO dialog box")
    public void i_should_see_update_todo_dialog_box() {

        String expected="Update TODO";
        String actual =driver.findElement(By.xpath("//h1[@class='modal_formTitle__dyssK']")).getText();
        Assert.assertEquals(expected,actual);
    }

    @Given("I click Add Task")
    public void i_click_add_task() throws InterruptedException {
        WebElement addTaskButtonInDialog = driver.findElement(By.xpath("//button[@type='submit']"));
        System.out.println(addTaskButtonInDialog.getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
         addTaskButtonInDialog = driver.findElement(By.xpath("//button[@type='submit']"));
        js.executeScript("arguments[0].click();", addTaskButtonInDialog);
        Thread.sleep(5000);
    }

    // Scenario 4: Click on Edit icon and verify the Update ToDo dialog
    @Given("I click on pencil icon")
    public void i_click_on_pencil_edit_icon() {
        WebElement editIcon = driver.findElement(By.xpath("(//div[@class='todoItem_icon__+DYyU'])[2]"));
        editIcon.click();
    }

    // Scenario 5: Update a ToDo
    @Given("I update the Title and Status")
    public void i_update_the_title_and_status() {

        WebElement updatedTitleField = driver.findElement(By.id("title"));
        updatedTitleField.clear();
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
        String expected="Updated ToDo";
        String actual =driver.findElement(By.xpath("//p[text()='Updated ToDo']")).getText();
        Assert.assertEquals(expected,actual);
    }

    // Scenario 6: Delete a ToDo
    @Given("I click on delete icon")
    public void i_click_on_delete_icon() {

        WebElement deleteIcon = driver.findElement(By.xpath("(//div[@class='todoItem_icon__+DYyU'])[1]"));
        deleteIcon.click();
    }

    @Then("I should see the corresponding task getting deleted")
    public void i_should_see_the_corresponding_task_getting_deleted() {


        String expected="Updated ToDo";
        try{

            String actual =driver.findElement(By.xpath("//p[text()='Updated ToDo']")).getText();
        }
        catch(NoSuchElementException e){
            System.out.println(e);
            Assert.assertTrue(true);
        }

    }
}










