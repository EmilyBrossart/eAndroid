package com.brossart.quizbowl;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {
	
	private Button gButton;
	private String question = "This man penned a work in which twenty-one dead pilots and the suicide of Larry weigh on the conscience of Joe Keller and eventually drive him to suicide, All My Sons. This author also wrote a play in which Rebecca Nurse and John Proctor are among those accused of witchcraft and one about the father of Biff and Happy who commits suicide for insurance money, Willy Loman. For 10 points, identify this author of The Crucible and Death of a Salesman.";
	private String answer = "Miller";
	TreeMap<String, String> dataSet = new TreeMap<String, String>();
	String[] questionSet;
	double r = Math.random();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		final TextView newQuestion = (TextView) findViewById(R.id.textView3);
		newQuestion.setText(question);
		final TextView goat = (TextView) findViewById(R.id.textView4);
		final TextView sheep = (TextView) findViewById(R.id.textView5);
		final EditText ET = (EditText) findViewById(R.id.editText1);
		Button B1 = (Button) findViewById(R.id.button1);
		B1.setOnClickListener(new View.OnClickListener() {

		                public void onClick(View v) {
		                    ET.setVisibility(View.INVISIBLE);
		                    if(ET.getText().toString().equalsIgnoreCase(answer))
		                    {
		                    	goat.setText("Correct!");
		                    	sheep.setText("");
		                    } else {
		                		sheep.setText("Incorrect. The answer is " + answer + ".");
		                		goat.setText("");
		                    }
		                    ET.setVisibility(View.VISIBLE);
		                } });
		gButton = (Button) findViewById(R.id.button2);
        gButton.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
        		int n = (int)r*dataSet.size();
        		questionSet = new String[dataSet.size()];
        		questionSet = (String[]) dataSet.keySet().toArray();
        		question = questionSet[n];
        		newQuestion.setText("question");
        		ET.setText("");
        		goat.setText("");
        		sheep.setText("");
        		answer = "Lima";
        	}
        	
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}

	@Override
	public void dataInput()
	{
		dataSet.put("He created a relief with Herod being shown the head of John the Baptist that contained round arches and a equestrian satue of Gamelatta. This sculptor also created a flat relief of a knight killing a dragon set below a statue of that knigt. In addition to his St. George, he created a wooden scupturer of a woman with hollow cheeks and statue where a boy is standing with a foot on the head of Goliath.  For 10 points, name this sculptor of a Mary Madgalene and  a bronze, pre-pubescent David.", "Donatello");
		dataSet.put("Book 3 of one of this man's works states “To Carthage I came” and describes his studies there, and he blames pagans for the world's problems in another. This man describes how he followed Manichaeism for nine years in one work, and Book 9 of that work mentions the death of this man’s mother Monica. This author of City of God was baptized by Saint Ambrose of Milan. For 10 points, name this fifth century Roman saint who described his youthful sins and later conversion in his Confessions.", "Saint Augustine of Hippo");
		dataSet.put("This quantity divided by surface area is equal to surface tension. For a redox reaction, this quantity is defined as the Faraday constant times the number of moles of electrons times the electric potential, and negative values of this quantity indicate that a reaction is spontaneous.  Defined as the change in enthalpy minus the product of temperature and change in entropy, for 10 points, name this thermodynamic quantity symbolized G, a measure of available useful work in a system.", "Gibbs free energy");
		dataSet.put("This nation includes the Merida and Sierra de Perija mountain ranges and the Catatumbo River. Major cities in this nation include Ciudad Guyana, Barquisimento, and, despite not being Spain, Valencia. This nation contains most of the Orinoco River, and two thirds of this nation’s oil production occurs at its largest lake, which is also the largest lake in South America, Lake Maracaibo. For 10 points, name this nation with capital at Caracas.", "Venezuela");
		dataSet.put("This man completed White Negress, and he was also known for such outdoor sculptures as Table of Silence.  He also designed a funerary pillar at Targu Jiu which stands nearly a hundred feet tall, the Endless Column. He is perhaps more famous for extremely phallic sculptures such as Princess X, and he made a large number of copies of his Sleeping Muse. For 10 points, name this Romanian sculptor of Bird in Space series.", "Brancusi");
		dataSet.put("This man clashed with David Ricardo on the subject of the Corn Laws, as well as on the title subject of this man’s work An Inquiry into the Nature and Progress of Rent. One of his theories states that one societal quantity grows geometrically while another grows arithmetically. For 10 points, name this British economist who theorized in An Essay on the Principle of Population that the world’s population growth would outstrip its ability to produce food.", "Malthus");
		dataSet.put("One character in this work is a consul named Sharpless, to whom the titular character declares that her child's name is Sorrow. Another character is a marriage broker named Goro, who shows a house to a naval officer.  That officer marries the title character and later deserts her to marry an American named, prompting to kill herself with her father's knife. Lieutenant Pinkerton is a character in, for 10 points, what Giacomo Puccini opera about a Japanese woman?", "Madame Butterfly");
		dataSet.put("This figure defeats a fire-breathing monster beneath the Aventine Hill, Cacus, in the Aeneid. Lovers of this figure included Iole and Deianira, who gave him a robe poisoned with the blood of Nessus, killing him. After his death, his bow and arrows were taken up by Philoctetes. Also notable for diverting a river to clean the Augean stables and for fighting the Nemean Lion, this is, for 10 points, what Greek hero who slew the Hydra as part of twelve labors employing his incredible strength?", "Hercules");
		dataSet.put("One character in this play becomes depressed after learning that Rosaline has taken a vow of celibacy, while another says “ask for me tomorrow, and you shall find me a grave man” after he is mortally wounded by Tybalt. In this play, a message about a faked death is delayed by a quarantine and Friar Lawrence marries two characters, one of whom compares the other to a rose while below her balcony. For 10 points, name this Shakespearean play about star-crossed lovers.", "Romeo and Juliet");
		dataSet.put("Derivation from the second law of thermodynamics yields that this quantity is equal to change in energy over the change in entropy.  Root mean square speed is defined as the square root of three times the gas constant times this quantity over molecular mass. An isothermal process is one in which this quantity stays constant.  Measuring the average amount of kinetic energy, for 10 points, name this quantity that can be measured in Rankines, Kelvins, and degrees Celsius.", "temperature");
		dataSet.put("These people were Christianized by St. Olaf and their presence in England began with the attack on Lindisfarne Abbey. They established a settlement at L’Anse aux Meadows, which may have been part of Vinland. Famous members of this people include Leif Erikson and Erik the Red. For 10 points, name these fierce Scandinavian warriors and explorers, who, contrary to popular belief, did not wear horned helmets.","Vikings");
		dataSet.put(".“The History of Astronomy” is one of his Essays on Philosophical Subjects, and another work by this man talks about “different progress of opulence” and “the nature, accumulation, and employment of stock” and includes a parable about a butcher, baker, and brewer, whose self-interests promote general welfare. This man also defined a metaphor for the self-regulating nature of free markets. For 10 points, name this Scot who created the “invisible hand,” the author of The Wealth of Nations.", "Smith");
		dataSet.put("One form of this property is divided by thermal diffusivity in expression of the Prandtl number. When this property’s value equals zero, the Navier-Stokes equations simplify into Euler’s equations, and the Reynolds number is the ratio of inertial forces to this property. Its kinematic variety is measured in stokes, while its dynamic variety is measured in poise. Newtonian fluids have a constant value of, for 10 points, what measure of a fluid’s resistance to flow?", "viscosity");
		dataSet.put("This artist designed a series of paired Corinthian columns for the dome of St. Peter’s Basilica and a never-built pyramid for the tomb of Pope Julius II. That tomb contains his sculpture of a horned biblical figure with a large beard. In addition to Moses, he also carved a sculpture of Mary cradling Jesus in her lap, as well as a huge sculpture of a biblical figure holding a slingshot. For 10 points, name this sculptor of the Vatican Pieta and the huge marble David.", "Michelangelo");
		dataSet.put("This man’s first symphony is nicknamed “Classical” for paying homage to Mozart, and he composed the score for the film Alexander Nevsky.  One of his operas has the witch Fata Morganna cause a prince to be enamored of fruit, The Love for Three Oranges.  Another of his works contains a “troika” the Lieutenant Kije Suite.  In one of his works, the bassoon represents the title character’s grandfather.  For ten points, identify this composer of Peter and the Wolf.", "Prokofiev");
		dataSet.put("One god of this people killed his sister shortly after being born to a mother who was impregnated by a ball of feathers. That god is often represented as a hummingbird, while another god's name means “Smoking Mirror.” These people sacrificed children to their rain god and worshipped another deity whose name means “feathered serpent.” For 10 points, name this Latin American civilization whose gods included Huitzilopochtli, Tezcatlipoca, Tlaloc, and Quetzalcoatl.", "Aztec");
		dataSet.put("This band recorded a song that mentions "four thousand holes in Blackburn, Lancashire" and ends with a single chord being sustained for forty-five seconds. This song, “A Day in the Life”, is the final track of the album that also features “Lovely Rita” and “With a Little Help from My Friends”. For 10 points, name this British band, featuring John Lennon and Paul McCartney, that recorded Sgt. Pepper's Lonely Hearts Club Band and songs such as “Yesterday” and “Hey Jude”.", "The Beatles");
		dataSet.put("This group of elements commonly provides the leaving group in an SN2 reaction. These elements form PTFE when they bond with an alkyl group. They bond with hydrogen to form compounds such as hydrastatic acid and another acid that has the ability to dissolve glass. The most electronegative element is a member of this group. With 7 valence electrons and ions known as halides, for 10 points, name these group seventeen elements including astatine, chlorine, and fluorine.", "halogens");
		dataSet.put("One of his poems is based on the tale of a mythological shepherd loved by Selene, and its first line states “A thing of beauty is a joy forever.”  In addition to “Endymion,” one of his poems states that the title creature “was not born for death, Immortal Bird,” and another beginning “Thou still unravished bride of quietness!” concludes “Beauty is truth, truth beauty.” For 10 points, name this Romantic poet of “Ode to a Nightingale” and “Ode on a Grecian Urn.”", "Keats");
	}
}


/*
 * final EditText ET = (EditText) findViewById(R.id.EnterText);
Button B1 = (Button) findViewById(R.id.EnterButton);
B1.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    ET.setVisibility(View.INVISIBLE);
                    if(ET.getText().toString() == "BYE")
                    {
                        //do something if it is "BYE"
                    } else {
                        Context context = getApplicationContext();
                    CharSequence text = "Please enter BYE";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show(); 
                    }
                    ET.setVisibility(View.VISIBLE);
                } });
 */
