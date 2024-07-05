
package com.example.demo1;

import javafx.application.Application;
import javafx.beans.binding.FloatExpression;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Flow;
import javafx.scene.paint.Color.*;
import javafx.css.*;

public class HelloApplication extends Application {

    Label response;
    @Override
    public void start(Stage mystage) throws IOException {
        mystage.setTitle("new window..!!");
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        Scene myscene = new Scene(root, 500, 500);
        mystage.setScene(myscene);
        response = new Label(" Press something to explore Library Management features..!!");
        response.setStyle(" -fx-text-fill: magenta ; -fx-font-size: 15 ; -fx-font-weight: bold ; -fx-font-style: oblique");

        Button add = new Button(" Add a Book");
        add.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15  ; -fx-font-weight:bolder ");
        Button issue = new Button(" Issue a New Book");
        issue.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15  ; -fx-font-weight: bolder ");
        Button returnbook = new Button(" Return a Current Book");
        returnbook.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15 ; -fx-font-weight: bolder ");
        Button display_books = new Button(" Display all Library Books");
        display_books.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15 ; -fx-font-weight: bolder");
        Button exitprog = new Button(" EXIT Application");
        exitprog.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15  ; -fx-font-weight: bolder ");


        ArrayList <String> al = new ArrayList<String>();



        root.getChildren().addAll(add,issue,returnbook,display_books,exitprog,response);
        mystage.show();

        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                Stage stage1 = new Stage();
                stage1.setTitle(" Book Database window");
                FlowPane root1=new FlowPane();
                root1.setAlignment(Pos.CENTER);
                Scene scene1= new Scene(root1,900,500);
                stage1.setScene(scene1);


                Label disptext = new Label("Enter Book name to add..");
                disptext.setStyle(" -fx-text-fill: red ; -fx-font-size: 20 ; -fx-font-weight: bold ; -fx-border-color: black ; -fx-background-color: yellow");

                disptext.setAlignment(Pos.BASELINE_CENTER);
                TextField tf= new TextField();
                tf.setPromptText(" Enter complete book name");
                tf.setPrefColumnCount(30);
                Button toadd= new Button(" ADD book");
                toadd.setStyle(" -fx-text-fill: mediumblue ; -fx-font-size: 15; -fx-font-weight: bold ");

                Button refresh = new Button(" Refresh Database");
                refresh.setStyle(" -fx-text-fill: mediumblue ; -fx-font-size: 15 ; -fx-font-weight: bold ");

                toadd.setAlignment(Pos.CENTER);
                refresh.setAlignment(Pos.CENTER);

                root1.getChildren().addAll(disptext,tf,toadd,refresh);
                stage1.show();

                toadd.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent ae) {
                        Stage st = new Stage();
                        st.setTitle(" Success Message");
                        FlowPane ft= new FlowPane();
                        ft.setAlignment(Pos.CENTER);
                        Scene sc1 = new Scene(ft,500,500);
                        st.setScene(sc1);
                        al.add(tf.getText());
                        Label disp = new Label(" Your entered book has been added successfully..!!");
                        disp.setStyle(" -fx-text-fill: red ; -fx-font-size: 15 ; -fx-font-weight: bold ; -fx-font-style: oblique");

                        disp.setAlignment(Pos.CENTER);
                        Button ok = new Button("OK !");
                        ok.setStyle(" -fx-text-fill: darkblue ; -fx-font-size: 20 ; -fx-font-weight: bold ");

                        ok.setAlignment(Pos.BOTTOM_CENTER);

                        ft.getChildren().addAll(disp,ok);
                        st.show();


                        ok.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent ae) {
                                st.close();
                            }
                        });
                    }
                });

                refresh.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent ae) {
                        Label l = new Label(" Book Database List..: ");
                        Label n =new Label("{");
                        l.setStyle(" -fx-text-fill: red ; -fx-font-size: 15 ; -fx-font-weight: bold ; -fx-border-color: black ; -fx-background-color: azure");
                        n.setStyle(" -fx-text-fill: Black ; -fx-font-size: 20 ; -fx-font-weight: bolder");

                        root1.getChildren().addAll(l,n);
                        for (String str : al) {
                            Label lb = new Label(str+","+" ");
                            lb.setAlignment(Pos.TOP_LEFT);
                            lb.setStyle(" -fx-text-fill: darkblue ; -fx-font-size: 20; -fx-font-weight: bolder; -fx-font-family: Times New Roman");

                            root1.getChildren().addAll(lb);
                        }
                        Label l1=new Label("}");
                        l1.setStyle(" -fx-text-fill: Black ; -fx-font-size: 20 ; -fx-font-weight: bolder");

                        root1.getChildren().addAll(l1);
                    }
                });

            }
        });

        issue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                Stage stage2 = new Stage();
                stage2.setTitle(" Book Issue portal window");
                FlowPane root2= new FlowPane();
                root2.setAlignment(Pos.CENTER);
                Scene scene2 = new Scene(root2,500,500);
                stage2.setScene(scene2);
                Label text = new Label(" Please enter complete Book Name to issue..");
                text.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15 ; -fx-font-weight: bolder ; -fx-background-color: yellow");

                text.setAlignment(Pos.TOP_CENTER);
                TextField tf= new TextField();
                tf.setPromptText(" Enter complete book name..");
                Button issbutton = new Button("Issue the Book");
                issbutton.setAlignment(Pos.BOTTOM_CENTER);
                issbutton.setStyle(" -fx-text-fill: red ; -fx-font-size: 20 ; -fx-font-weight: bolder ");

                root2.getChildren().addAll(text,tf,issbutton);

                stage2.show();

                issbutton.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent ae) {
                        if(al.contains(tf.getText()))
                        {
                            Stage st3= new Stage();
                            st3.setTitle(" Success Message..!!");
                            FlowPane root3= new FlowPane();
                            root3.setAlignment(Pos.CENTER);
                            Scene sc3= new Scene(root3,500,500);
                            st3.setScene(sc3);
                            al.remove(tf.getText());

                            Label succ = new Label(" You have issued the book successfully..!!");
                            succ.setAlignment(Pos.CENTER);
                            succ.setStyle(" -fx-text-fill: magenta ; -fx-font-size: 20 ; -fx-font-weight: bolder; -fx-font-style:oblique ");

                            Button okay= new Button("OK !");
                            okay.setAlignment(Pos.CENTER);
                            okay.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 20 ; -fx-font-weight: bolder ");

                            root3.getChildren().addAll(succ,okay);
                            st3.show();

                            okay.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent ae) {
                                    st3.close();
                                }
                            });
                        }
                        else {
                            Stage st4= new Stage();
                            st4.setTitle(" Not Found Message..!!");
                            FlowPane root4= new FlowPane();
                            root4.setAlignment(Pos.CENTER);
                            Scene sc4= new Scene(root4,700,500);
                            st4.setScene(sc4);


                            Label def = new Label(" Entered Book is not available in the library..!!" +
                                    " Please check the Library Database..");
                            def.setAlignment(Pos.CENTER);
                            def.setStyle(" -fx-text-fill: red ; -fx-font-size: 15 ; -fx-font-weight: bolder ; -fx-font-style: oblique");

                            Button okay= new Button("OK !");
                            okay.setAlignment(Pos.CENTER);
                            okay.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 20 ; -fx-font-weight: bolder ");

                            root4.getChildren().addAll(def,okay);
                            st4.show();

                            okay.setOnAction(new EventHandler<ActionEvent>() {
                                @Override
                                public void handle(ActionEvent ae) {
                                    st4.close();
                                }
                            });
                        }
                    }
                });
            }
        });
        returnbook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                Stage stret = new Stage();
                stret.setTitle(" Book Return portal window..");
                FlowPane ft= new FlowPane();
                ft.setAlignment(Pos.CENTER);
                Scene s = new Scene(ft,700,500);
                stret.setScene(s);

                Label txt = new Label(" Please enter Book name to return ..: ");
                txt.setAlignment(Pos.CENTER);
                txt.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 15 ; -fx-font-weight: bolder ; -fx-border-color: orangered ; -fx-background-color: yellow");

                TextField t1 = new TextField();
                Button b1 = new Button(" Return Book");
                b1.setAlignment(Pos.CENTER);
                b1.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 20 ; -fx-font-weight: bolder ");

                ft.getChildren().addAll(txt,t1,b1);

                stret.show();

                b1.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent ae) {
                        Stage s1= new Stage();
                        s1.setTitle(" Success Message..!");
                        FlowPane f = new FlowPane();
                        f.setAlignment(Pos.CENTER);
                        Scene sn = new Scene(f,500,300);
                        s1.setScene(sn);

                        al.add(t1.getText());

                        Label txt = new Label(" Your book has been returned to the library..!");
                        txt.setAlignment(Pos.CENTER);
                        txt.setStyle(" -fx-text-fill: magenta ; -fx-font-size: 15 ; -fx-font-weight: bolder ; -fx-font-style:oblique");

                        txt.autosize();
                        Button ok = new Button("OK !");
                        ok.setAlignment(Pos.CENTER);
                        ok.setStyle(" -fx-text-fill: Blue ; -fx-font-size: 20 ; -fx-font-weight: bold ");

                        f.getChildren().addAll(txt,ok);
                        s1.show();

                        ok.setOnAction(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent ae) {
                                s1.close();
                            }
                        });

                    }
                });

            }
        });
        display_books.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                Stage st1 = new Stage();
                st1.setTitle(" Libraray Book Database");
                FlowPane root = new FlowPane();
                root.setAlignment(Pos.CENTER);
                Scene s1= new Scene(root,500,500);
                st1.setScene(s1);
                Label disp = new Label("Library Book Database list..");
                Label temp = new Label("{");
                disp.setStyle(" -fx-text-fill: red ; -fx-font-size: 20 ; -fx-font-weight: bolder ; -fx-border-color: orangered ; -fx-background-color: yellow");
                temp.setStyle(" -fx-text-fill: black ; -fx-font-size: 20 ; -fx-font-weight: bolder ");

                root.getChildren().addAll(disp,temp);
                st1.show();
                for(String book : al)
                {
                    Label lb = new Label(book+","+" ");
                    lb.setStyle(" -fx-text-fill: darkblue ; -fx-font-size: 20 ; -fx-font-weight: bolder");

                    root.getChildren().addAll(lb);
                }
                Label l=new Label("}");
                l.setStyle(" -fx-text-fill: black ; -fx-font-size: 20 ; -fx-font-weight: bolder");

                root.getChildren().addAll(l);

            }
        });

        exitprog.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                Platform.exit();
            }
        });


    }
    public static void main(String[] args) {
        launch(args);
    }
}
