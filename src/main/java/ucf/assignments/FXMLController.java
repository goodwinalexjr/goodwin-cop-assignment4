package ucf.assignments;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;


public class FXMLController {

    @FXML
    private TableView todolist;
    @FXML
    private TableColumn todolistlist;
    @FXML
    private TableView itemList;
    @FXML
    private TableColumn item;
    @FXML
    private TableColumn dueDate;
    @FXML
    private TableColumn finished;
    @FXML
    private TableColumn description;

    public void newButtonClickedTDL(ActionEvent actionEvent) {
        //will call the todolistaddcontroller and addtodolist class
    }

    public void edidButtonClickedTDL(ActionEvent actionEvent) {
        //will call the todolistaddcontroller and the edittodolist class
    }

    public void deleteButtonClickedTDL(ActionEvent actionEvent) {
        //call the removetodolist class and remove function
    }

    public void addbuttonClicked(ActionEvent actionEvent) {
        //will call the listaddcontroller and the additem class
    }

    public void removeButtonClicked(ActionEvent actionEvent) {
        //call the removeitemlist class and remove function
    }

    public void editlistButtonClicked(ActionEvent actionEvent) {
        // will call the listaddcontroller and the edititem class
    }
    

    public void displayAllbuttonClicked(ActionEvent actionEvent) {
        //will display everything on the to do list by re adding everything to the tableview item list
        //
    }

    public void checkboxClicked(ActionEvent actionEvent) {
        //will call the edititem class and call a funciton to change the boolean
    }

    public void displayincompleteButtonClicked(ActionEvent actionEvent) {
        //checks to see which items boolean are false and then loads only those
    }

    public void displaycompleteButtonClicked(ActionEvent actionEvent) {
        //checks to see which items booleans are true and then loads only them
    }

    public void exportlistButtonClicked(ActionEvent actionEvent) {
        //calls the export class
    }

    public void ExportalllistButtonClicked(ActionEvent actionEvent) {
        //calls the export class
    }

    public void importlistsButtonClicked(ActionEvent actionEvent) {
        //calls the inport class
    }
}
