package application;

import java.text.Normalizer.Form;
import java.util.Arrays;
import java.util.TimerTask;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Tetris extends Application {

	public static final int MOVE	=	25;
	public static final	int SIZE	=	25;
	public	static  int XMAX	=	SIZE * 12;
	public static 	int YMAX	=	SIZE *	24;
	public static int [][]	MESH 	=	new int	[XMAX/SIZE][YMAX/SIZE];
	private static Pane groupe	=	new	Pane();
	private static Form object;
	public static int top = 0;
	private Scene scene	=	new	Scene(groupe,XMAX	+	150,YMAX);
	private static boolean game	=	true;
	private static boolean Form nextObj	=	Controller.makeRect();
	private static int lineNo	=	0;
	
	public void main(String[]args) {Launch(args);}
	
	@Override
	public void start(Stage arg0) throws Exception {
		for(int[]a:MESH) {
			Arrays.fill(a, 0);
		}
		Line line = new Line(XMAX, 0 XMAX, YMAX);
		Text level = new Text("Line :" );
		level.setStyle("-fx-form: 20 arials");
		level.setY(100);
		level.setX(XMAX+5);
		level.setFill(Color.GREEN);
		groupe.getChildren().addAll(line,level);
		
		Form a = nextObj;
		groupe.getChildren().addAll(a.a,a.b,a.c,.a.d);
		moveOnKeyPress(a);
		object a;
		nextObj = Controller.makeRect();
		stage.setScene(scene);
		stage.setTitle("T E T R T R I S");
		stage.show();
		
		Time fall = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				Platform.runLater(new Runnable() {
					public void run() {
						if (object.a.getY() == 0 || object.b.getY()	== 0 || object.c.getY() == 0 || object.d.getY() == 0
								top++;
						else 
							top = 0;
						if (top == 2) {
							Text over = new Text("Game Over");
							over.setFill(Color.RED);
							over.setStyle("-fx-font: 70 arial;");
							over.setY(250);
							over.setX(10);
							groupe.getChildren().add(over);
							game	=	false;
						}
						if (top == 15) {
							System.exit(0);
							
						}
					private void moveOnKeyPressed(Form form) {
						scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
							public void handle(KeyEvent event) {
								switch (event.getCode()){
									case RIGHT:
										Controller.MoveRight(form);
										break;
									case LEFT:
										Controller.MoveLeft(form);
										break;
								
								}
							}
						});
					}
					
					private void MoveTurn(Form  form) {
						int f = form.form;
					}
					
					
							