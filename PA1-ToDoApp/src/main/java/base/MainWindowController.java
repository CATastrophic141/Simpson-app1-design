package base;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class MainWindowController {

    /*All present active code is to allow
     the sub-windows to be accessed in this pseudocode stage*/

    @FXML
    private Button saveBtn;

    @FXML
    private void saveList(ActionEvent event) {
        //Open save window
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FileSavePrompt.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("File Save");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button uploadBtn;

    @FXML
    private void uploadList(ActionEvent event) {
        //Open upload window
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FileUploadPrompt.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("File Upload");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Label dateText;

    @FXML
    private void setDateText(){
        //Set the label's text as the date of from the to-do item's information package
    }

    @FXML
    private Label detailText;

    @FXML
    private void setDetailText(){
        //Set the label's text as the date of from the to-do item's information package
    }

    @FXML
    private CheckBox hideCompletedBtn;

    @FXML
    private void setHideCompletedBtn(){
        //Set the showCompleted boolean to false
    }

    @FXML
    private CheckBox hideIncompleteBtn;

    @FXML
    private void setHideIncompleteBtnBtn(){
        //Set the showIncomplete boolean to false
    }

    @FXML
    private Label itemNameText;

    @FXML
    private void setItemNameText(){
        //Set the label's text to the name of the item
    }

    @FXML
    private Button listOfItemsAddBtn;

    @FXML
    private void useListOfItemsAddBtn(){
        //Open prompt window
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ItemPrompt_ADD.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Add Item");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    //Display complete and incomplete based on boolean "show values"
    @FXML
    private ListView<?> listOfListsList;

    @FXML
    private void selectFromListOfItems(){
        //Get data from the selected item in list
    }

    @FXML
    private Button listOfItemsEditBtn;

    @FXML
    private void useListOfItemsEditBtn(){
        //Open prompt window
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ItemPrompt_EDIT.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Edit Item");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button listOfItemsRmvBtn;

    @FXML
    private void useListOfItemsRmvBtn(){
        //Remove item from arraylist
    }

    @FXML
    private Button listOfListAddBtn;

    @FXML
    private void useListOfListAddBtn(){
        //Open prompt window
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListPrompt_ADD.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Add List");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private ListView<?> listOfItemsList;

    @FXML
    private void selectFromListOfList(){
        //Get data from the selected item in the list
                //Save to ToDoItem array
    }

    @FXML
    private Button listOfListEditBtn;

    @FXML
    private void useListOfListEditBtn(){
        //Open prompt window
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ListPrompt_EDIT.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setTitle("Edit List");
            stage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private Button listOfListRmvBtn;

    @FXML
    private void useListOfListRmvBtn(){
        //Remove array list
    }
}
