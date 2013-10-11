package com.doca.historia;

import java.util.Random;

public class historias {
	
	// member variables - properties about the object
	public String [] mAnswers = {
			
 
			"necesito que me hagas olvidarlo todo",
			"tu le encuentras sentido a mi desastre",			
			"quiza el amor nos quedo muy grande",			
			"nos sobro tiempo y nos falto rapidez",
			"mis dias felices son contigo",
			"sabes quien eres",	
			
			"todo iba tan bien que parecia una mentira ",	
			"ella se encerro en su mundo y el no tenia llave para entrar ",
			"la pregunta es : de verdad crees que me importa ",
			
			"quiza soy mas fragil de lo que ven ",
			"porque les cuesta tanto sonreir ",
			"a veces, solo te queda acostubrarte a la idea que ya nada sera igual ",
			"estoy cansada de los constantes no se ",
			"nadie repite mas errores que yo ",
			"el problema empieza cuando los latidos se aceleran ",
			"quiza fue amor de un dia ",
			"uno de muchos abrazos ",
			"y bueno nada, nuestras vidas tomaron diferentes rumbos ",
			"el da–o de a–os no se repara en dias ",
			
			"esta bien, no me escuches. algun dia tendre la razon y lo admitiras ",
			"abstente de decir lo que podria doler ",
			"que tan malo podria ser ",
			"me perdere en mi mundo ",
			"sabes , eres exactamente lo que queria ",
			"sabes , eres exactamente lo que me merecia",
			"que voy a hacer contigo, no te quiero cerca pero tampoco lejos ",
			"lo que beses sera tuyo ",
			"y creiste que no daria la batalla ",
			"el problema esta, en que a veces no se ve la luz al final del tunel ... ",
			
			"no puedo evitar que una sonrisa se escape si me miras mucho tiempo ",
			"sin ella, la vida de el ahora seria un completo desaste ",
			"sabes que so–e? que tu so–abas conmigo ",
			"ya te mencione lo mucho que me encantas ",
			"demasiado feliz como para creerlo ",
			"sabes algo? de vez en cuando te extra–o ",
			"hasta donde serias capaz de llegar por mi ",
			"no se si existira la persona perfecta pero existes tu y con eso me basta ",
			"mis palabras animan a todos, menos a mi ",
			"no dejes que me acostumbre a tu ausencia ",
			
			"casate con te quiera, no con quien tu quieras ",
			"sera esto lo que llaman amor ",
			"la casualidad no quiere que nos encontremos ",
			"mi mundo se paraliza cada que me dices que me amas ",
			"cuando estoy de buen humor, el mundo es un lugar mejor ",
			"yo se la verdad ",
			"arriesgate. la vida a veces no da segundas oportunidades ",
			"a un gran corazon, ninguna ingratitud lo cierra ",
			"sonrie, nadie necesita saber que no estas bien ",
			"si algo no te deja avanzar, dejalo atras ",
			

			
			"si ves que aun sonrio cuando me miras, algo estas haciendo bien ",
			"usted tiene derecho a ser un fulano cualquiera hasta que demuestre lo contrario ",
			"y sabes que, esto ya lo vivi una vez ",
			"fiu fiu ",
			"no se trata de lo que alguna vez fuiste sino de lo que quieres llegar a ser ",
			"ten mas de lo que muestras; habla menos de lo que sabes ",
			"todo pasa por algo - dijo tratando de hacerse sentir mejor ",
			"yo tambien pienso en ti ",
			"respira ",
			"se puede escribir - te quiero - con una linea del teclado ",
			
			"esas ganas de que pase algo , algo magico, algo que cambie el rumbo de mi vida, pero que me haga feliz ",
			"y entonces miras a tu alrededor: estas con mil personas y tienes las sensacion de no tener a nadie contigo ",
			"para que nada nos separe, que nada nos una ",
			"no creas ver felicidad o tristeza  en una sonrisa, buscala en los ojos ",
			"quieres evitar problemas?  aprende a decir no ",
			"cinco minutos bastan para so–ar una vida ",
			"pienso mucho, hablo poco ",
			
			"y entonces, sin darte cuenta, te enamoras de las canciones y las esuchas una y otra vez ",
			"le mire como quien mira algo que queria desde hace tiempo ya. Te extra–e sabias? dije con torpeza ",
			"hemos platicado de tantas cosas en mi cabeza ",
			"llegara cuando olvides que lo querias ",
			"algun dia, yo lo se ",
			"le miro bien, pero nunca se que decirle ",
			"gracias por sonreir, no tienes idea de lo que vale para mi una sonrisa tuya ",
			"estaremos bien ",
			"es el - que hubiera pasado si ... - lo que me desvela ",
			"sus acciones valen mas que mil promesas , asi como las tuyas ",
			
			
			"sabes ",
			
			
	};
	
	// Methods - abilities;things the object can do
	public String getAnswers() {
		
		
		// el botton fue clicked asi que update con una answer
		String answer = "";
		
		//agrega una respuesta random , si, no depende
		Random randomGenerator = new Random(); //contruye un nuevo Random
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		//answer = Integer.toString(randomNumber);
		// convert numero a texto random
		
		
		/*if (randomNumber == 0) {
			answer = "Sip";
			
		}
		else if (randomNumber == 1) {
			answer = "Nop";
			
		}
		else if (randomNumber == 2) {
			answer = "Alomejor";
			
		}
		else {
			answer = "perdon esto es un error";
		}  
		todo esto lo cambio por la sig linea*/
		
		answer = mAnswers[randomNumber];
		
		return answer ;
	}

}
