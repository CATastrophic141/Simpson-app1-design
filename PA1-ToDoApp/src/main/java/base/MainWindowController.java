package base;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainWindowController {
    //ToDoItem variable for storage
    ToDoItem listItem;
    boolean showCompleted;
    boolean showIncomplete;

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
    private void setDateText() {
        //Set the label's text as the date of from the to-do item's information package
        dateText.setText(listItem.getDueDate());
    }

    @FXML
    private Label detailText;

    @FXML
    private void setDetailText(){
        //Set the label's text as the date of from the to-do item's information package
        detailText.setText(listItem.getItemDetails());
    }

    @FXML
    private Label nameText;

    @FXML
    private void setItemNameText(){
        //Set the label's text to the name of the item
        nameText.setText(listItem.getItemName());
    }

    @FXML
    private CheckBox hideCompletedBtn;

    @FXML
    private void setHideCompletedBtn(){
        //Set the showCompleted boolean to false
        showCompleted = !showCompleted;
    }

    @FXML
    private CheckBox hideIncompleteBtn;

    @FXML
    private void setHideIncompleteBtnBtn(){
        //Set the showIncomplete boolean to false
        showIncomplete = !showIncomplete;
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
    private ListView<ToDoItem> listOfItemsList;

    @FXML
    private Button selectItemButton;

    @FXML
    private void selectFromListOfItems(){
        //Get data from the selected item in list
        ObservableList<ToDoItem> item = listOfItemsList.getSelectionModel().getSelectedItems();
        listItem = (ToDoItem) item;
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
    private void useListOfItemsRmvBtn(ActionEvent event) {
        //Remove item from arraylist
        if (listOfItemsList.getSelectionModel().getSelectedIndex() != -1) {
            int itemIndex = listOfItemsList.getSelectionModel().getSelectedIndex();
            listOfItemsList.getItems().remove(itemIndex);
        }
    }

}
