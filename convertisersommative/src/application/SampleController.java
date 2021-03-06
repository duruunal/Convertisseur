/**
 * @author duruunal
 * Date: 5 Mars 2021
 * Proffeseur:Janvier Zagabe
 * Nom de sommative: Mercredi  3 mars, Convertisseur d'unites
 * Date de rendir: Avant minuit pendant la 5 mars
 * 
 * Instructions:Vous devez construire une application java qui permet d’effectuer la conversion des unités impériales en unités du système métrique et vice versa. 
 * Étant donné le fait qu’il existe plusieurs unités de mesure, le travail final devra inclure plusieurs unités de mesure dont : la longueur, le volume, la pression, 
 * la température, le débit, la masse, la surface, l’énergie etc.
 * 
 * Vous devez choisir 3 à 5 unités de mesure et présenter dans une interface conviviale.
 * Vous devez inclure des boutons (ex. bouton de fermeture) ou d’autres éléments supplémentaires.
 * 
 * Dans votre application, il faudra s’assurer que:
 * L’usager peut convertir de n’importe quelle unité vers une autre
 * Les valeurs non numériques ne sont pas acceptées
 * L’interface est conviviale et facile à utiliser
 * L’apparence esthétique est acceptable
 * Les unités choisies viennent d’au moins deux systèmes différents (ex.système métrique et système impérial)
 * 
 * Le travail devra être personnel. Toute similarité entre les codes sera sanctionnée (notes en moins). 
 * Vous devez vous assurer de respecter les règles de base de laprogrammation concernant la présentation (entête, 
 * description,commentaires etc.)
 *
 *Description: Ce code consiste à créer un convertisseur d'unité; un processus dans lequel les différentes unités disponibles 
 *dans le monde peuvent être converties les unes dans les autres avec un processus de multiplication ou de division par un 
 *facteur numérique. Ce code se compose de nombreuses parties de 4 unités de mesure différentes qui sont la devise, la longueur, 
 *le poids et la température. Chacune de ces quatre unités de mesure se compose de 4 systèmes de mesure différents spécifiques.
 *Les devises présentées par ce code sont le dollar canadien (CAD), le dollar américain (USD), l'euro (EUR) et la livre britannique 
 *(GBP). Les longueurs que ce code présente sont le kilomètre (km), le mètre (m), le centimètre (cm) et le pouce (pouce). Les poids 
 *que ce code présente sont le kilogramme (kg), le miligramme (mg), le gramme (g) et la livre (lbs). Les températures que présente ce
 * code sont le celcius (° C) le fahrenheit (° F) le kelvin (K) et le rankine (° R). Ce code se compose de 290 lignes
 */


//nom de package
package application;

//les imports pour la programme
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.text.Text;


public class SampleController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    //pour le monnaie
    @FXML
    private ComboBox<String> combobox2;

    @FXML
    private ComboBox<String> combobox1;

    
    //pour la longueur
    @FXML
    private ComboBox<String> combobox4;

    @FXML
    private ComboBox<String> combobox3;

    
    //pour la longueur
    @FXML
    private TextField text3;

    @FXML
    private TextField text4;

    
    //pour le monnaie
    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    
    //pour la temperature
    @FXML
    private TextField text7;

    @FXML
    private TextField text8;

    
    //pour le poids
    @FXML
    private TextField text5;

    @FXML
    private TextField text6;

    
    //pour le poids
    @FXML
    private ComboBox<String> combobox6;

    @FXML
    private ComboBox<String> combobox5;

    
    //pour la temperature
    @FXML
    private ComboBox<String> combobox8;

    @FXML
    private ComboBox<String> combobox7;
    
    
  //Pour avoir un button de quiter application
    @FXML
    private void Fermerappication()
    {
    	Alert alert=new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("ATTENTION ! !");
    	alert.setTitle("confirmant");
    	alert.setContentText("Voulez vous vraiment quitter ce programme ?");
    	Optional<ButtonType> result=alert.showAndWait();
    	if(result.get()==ButtonType.OK)
    	{
    		System.exit(0);
    	}
    	}
    
    //titres de application
    @FXML
    private Text titre;
    @FXML
    private Text titre1;
    @FXML
    private Text titre2;
    @FXML
    private Text titre3;
    @FXML
    private Text titre4;
    @FXML
    private Text titre5;
    
    
    //variables présentes comme des option dans la combobox de le monnaie
    private ObservableList<String> liste = (ObservableList<String>)FXCollections.observableArrayList("CAD", "USD", "EUR", "GBP");
  
    
    //variables présentes comme des option dans la combobox de la longueur
    private ObservableList<String> liste1 = (ObservableList<String>)FXCollections.observableArrayList("km", "m", "cm", "inch");
   
    
    //variables présentes comme des option dans la combobox de le poids
    private ObservableList<String> liste2 = (ObservableList<String>)FXCollections.observableArrayList("kg", "mg", "g", "lbs");
    
    
    //variables présentes comme des option dans la combobox de la temperature
    private ObservableList<String> liste3 = (ObservableList<String>)FXCollections.observableArrayList("°C", "°F", "K", "°R");

    
    //valeurs de le monnaie
    double []monnaie= {1.0,0.79,0.66,0.57};
    
    //valeurs de la longueur
    double []longueur= {1.0,1000.0,100000.0,39370.0};
    
    //valeurs de le poids
    double []poids= {1.0,1000000.0,1000.0,2.205};
    
    //valeurs de la temperature
    double []temperature= {1.0,33.8,274.15,493.47};
    
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		 //pour le monnaie
		combobox1.setItems(liste);
		combobox2.setItems(liste);
		
		//pour la  longueur
		combobox3.setItems(liste1);
		combobox4.setItems(liste1);
		
		//pour le poids
		combobox5.setItems(liste2);
		combobox6.setItems(liste2);
		
		//pour la temperature
		combobox7.setItems(liste3);
		combobox8.setItems(liste3);
		
		 //pour le monnaie
		combobox1.getSelectionModel().selectFirst();
		combobox2.getSelectionModel().selectFirst();
		
		//pour la longueur
		combobox3.getSelectionModel().selectFirst();
		combobox4.getSelectionModel().selectFirst();
		
		//pour le poids
		combobox5.getSelectionModel().selectFirst();
		combobox6.getSelectionModel().selectFirst();
		
		//pour la temperature
		combobox7.getSelectionModel().selectFirst();
		combobox8.getSelectionModel().selectFirst();	
	}
	

//calcules pour le monnaie
@FXML
void calculer()
{
	convertir(text1,text2,combobox1,combobox2,monnaie);
}

@FXML
void calculer1()
{
	convertir(text2,text1,combobox2,combobox1,monnaie);
}

//calcules pour la longueur
@FXML
void calculer2()
{
	convertir(text3,text4,combobox3,combobox4,longueur);
}


@FXML
void calculer3()
{
	convertir(text4,text3,combobox4,combobox3,longueur);
}

@FXML
void calculer4()
{
	convertir(text5,text6,combobox5,combobox6,poids);
}


//calcules pour le poids
@FXML
void calculer5()
{
	convertir(text6,text5,combobox6,combobox5,poids);
}


//calcules pour la temperature
@FXML	
void calculer6()
{
	convertir(text7,text8,combobox7,combobox8,temperature);
}

@FXML	
void calculer7()
{
	convertir(text8,text7,combobox8,combobox7,temperature);
}


//calcules pour la conversion de monnaie, longueur, poids, et temperature
public void convertir(TextField texta,TextField textb,ComboBox boxa,ComboBox boxb, double [] tab)
{
	int item1=boxa.getSelectionModel().getSelectedIndex();
	int item2=boxb.getSelectionModel().getSelectedIndex();
	double taux=tab[item2]/tab[item1];
	double res=taux*(Double.parseDouble(texta.getText()));
	//textb.setText(String.format("%.2f", res));
	textb.setText(Double.toString(res));
}

}	