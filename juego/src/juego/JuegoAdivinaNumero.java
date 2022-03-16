package juego;

public class JuegoAdivinaNumero { //extiende de Juego
	
	//crear un atributo numeroAdivinar de tipo entero
	
	//crear un constructor de JuegoAdivinaNumero que recibe por parametro el numero de vidas y el numero a adivinar
		//llamamos al constructor del padre con el parametro de numero de vidas
		//asignamos el valor de numero a adivinar a la variable numeroAdivinar de la clase

	//sobreescribimos el metodo jugar del padre (Juego)
		//reiniciar partida
		//crear una variable llamanda seguirJugando de tipo boolean inicializada a false 
		//do{
			//pedir un numero al usuario por consola y guardar ese numero en una variable de tipo entero numero
			//si el numero es igual a numeroAdivinar
				//mostrar un mensaje de acertasre
				//llamar al metodo actualizarRecord
				//poner la variable seguirJugando a false
			//en caso contrario
				//se llama al metodo quitarVida y se guarda el retorno en seguirJugando
				//si el numero es mayor a numeroAdivinar
					//mostrar mensaje "El numero a adivinar es menor"
				//en caso contrario
					//mostrar mensaje "El numero a adivinar es mayor"
	//} while(seguirJugando sea true);
}
