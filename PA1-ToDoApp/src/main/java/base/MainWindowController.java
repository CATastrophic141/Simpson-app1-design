package base;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainWindowController {

    @FXML
    private Button saveBtn;

    @FXML
    private void saveList(){
        //Open save window
    }

    @FXML
    private Button uploadBtn;

    @FXML
    private void uploadList() throws IOException {
        //Open upload window
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("FIleUploadPrompt.fxml")));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("Styles.css")).toExternalForm());
        Stage stage = new Stage();
        stage.setTitle("List upload prompt");
        stage.setScene(scene);
        stage.show();
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
    }

    @FXML
    private Button listOfItemsRmvBtn;

    @FXML
    private void uselistOfItemsRmvBtn(){
        //Remove item from arraylist
    }

    @FXML
    private Button listOfListAddBtn;

    @FXML
    private void uselistOfListAddBtn(){
        //Open prompt window
    }

    @FXML
    private ListView<?> listOfItemsList;

    @FXML
    private void selectFromListOfList(){
        //Get data from the selected item in the list
    }

    @FXML
    private Button listOfListEditBtn;

    @FXML
    private void useListOfListEditBtn(){
        //Open prompt window
    }

    @FXML
    private Button listOfListRmvBtn;

    @FXML
    private void useListOfListRmvBtn(){
        //Remove array list
    }
}
