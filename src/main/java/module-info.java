module com.example.local_repo_moved_to_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.local_repo_moved_to_git to javafx.fxml;
    exports com.example.local_repo_moved_to_git;
}