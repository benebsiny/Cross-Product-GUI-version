package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Controller {
    public TextField a1str;
    public TextField a2str;
    public TextField a3str;
    public TextField b1str;
    public TextField b2str;
    public TextField b3str;
    public Label ans;
    public void pressed(ActionEvent actionEvent){
        try{
            int a1 = Integer.valueOf(a1str.getText());
            int a2 = Integer.valueOf(a2str.getText());
            int a3 = Integer.valueOf(a3str.getText());
            int b1 = Integer.valueOf(b1str.getText());
            int b2 = Integer.valueOf(b2str.getText());
            int b3 = Integer.valueOf(b3str.getText());
            int answerx = a2*b3-a3*b2;
            int answery = a3*b1-a1*b3;
            int answerz = a1*b2-a2*b1;
            String x = String.valueOf(answerx);
            String y = String.valueOf(answery);
            String z = String.valueOf(answerz);
            ans.setText("("+x+"),("+y+"),("+z+")");

        }catch (Exception e){
            ans.setText("錯誤啦");
        }
    }

    public void helpButton(ActionEvent actionEvent) {
        Alert help = new Alert(Alert.AlertType.INFORMATION);
        help.setTitle("邊緣人出沒");
        help.setHeaderText(null);
        help.setContentText("臭邊緣沒人想幫你");
        help.show();
    }
}
