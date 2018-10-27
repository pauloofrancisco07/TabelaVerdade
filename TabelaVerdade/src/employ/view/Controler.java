package employ.view;


import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.scene.control.Label;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.fxml.*;
import javafx.scene.control.TextField ;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Button;

public class Controler {
	
	private final ObservableList <String> data = FXCollections.observableArrayList("o");
	
	
	public static final String 	s="S ", r = "R ", q="Q ", p = "P ", imp = "-> ", 
								add = "^ ", conj = "V ", ouE = "! ",seSo = "<--> ",
								neg = "~ ",parA = "( ",parF = ") ";
	

    @FXML
    private Button apagar;
	
    @FXML
    private TextField campo;
    
    @FXML
    private Label label;
    
    @FXML
    private TableView<String> tabela;

    @FXML
	private TableColumn coluna;
    
	 private ObservableList<Valores> valorTabela = FXCollections.observableArrayList();
		    	
	 @FXML
	 private void calcular() {
		
		 tabela.setEditable(true);
		 
		String[] valor = campo.getText().split(" ");
		
		List<String> prep = new LinkedList<String>();
		
		for(int i =0; i < valor.length;i++) {
			
			setColuna(new TableColumn<String, String>());
			
			tabela.getColumns().add(getColuna());
			
			if(valor[i].equals("P")||valor[i].equals("Q")||valor[i].equals("R")||valor[i].equals("S")) {
				prep.add(valor[i]);
			}
			
			getColuna().setText(valor[i]);
		}
		
		
		
	 }
	 
	@FXML
	private void remover() {
		while(!tabela.getColumns().isEmpty()){
			tabela.getColumns().clear();
		}
	}
	 
	 @FXML
	 private void adicao() {
		 campo.setText(campo.getText()+add);
	 }
	 
	 @FXML
	 private void conjuncao() {
		 campo.setText(campo.getText()+conj);
	 }
	 
	 @FXML
	 private void ouExclusivo() {
		 campo.setText(campo.getText()+ouE);
	 }
	 
	 @FXML
	 private void implicacao() {
		 campo.setText(campo.getText()+imp);
	 }
	 
	 @FXML
	 private void seSomenteSe() {
		 campo.setText(campo.getText()+seSo);
	 }
	 
	 @FXML
	 private void negacao() {
		 campo.setText(campo.getText()+neg);
	 }
	 
	 @FXML
	 private void p() {
		 campo.setText(campo.getText()+p);
	 }
	 @FXML
	 private void q() {
		 campo.setText(campo.getText()+q);
	 }
	 @FXML
	 private void r() {
		 campo.setText(campo.getText()+r);
	 }
	 @FXML
	 private void s() {
		 campo.setText(campo.getText()+s);
	 }
	 @FXML
	 private void parA() {
		 campo.setText(campo.getText()+parA);
	 }	 @FXML
	 private void parF() {
		 campo.setText(campo.getText()+parF);
	 }

	public TableColumn<String, String> getColuna() {
		return coluna;
	}

	public void setColuna(TableColumn coluna) {
		this.coluna = coluna;
	}

}
