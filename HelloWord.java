public class HelloWord{
	public static void main(String[] args){
		System.out.println("Hello Danny");
		//declaracion del primer objeto
		Chicken chickenFirst;
		//inicializar el primer objeto
		chickenFirst = new Chicken();
		chickenFirst.initializaData("Lucy","cafe",2);
		chickenFirst.print();
		//s.o.p´(chicken.name)-->no funciona la variable es privada
		chickenFirst.affirm();
		chickenFirst.layAnEgg();
		chickenFirst.affirm();
		chickenFirst.poop();
		chickenFirst.affirm();
		chickenFirst.drink();
		//
		//declaracion del segundo objeto
		Chicken chickenSecond;
		//inicializar el segundo objeto
		chickenSecond = new Chicken();
		chickenSecond.separate();
		chickenSecond.initializaData("Pepita","negra",1);
		chickenSecond.print();
		chickenSecond.affirm();
		chickenSecond.layAnEgg();
		chickenSecond.affirm();
		chickenSecond.poop();
		chickenSecond.negate();
		chickenSecond.drink();
		//
		//declaracion del tercero  objeto
		Chicken chickenThird;
		//inicializar el tercer objeto
		chickenThird = new Chicken();
		//llamada a los metodos
		chickenThird.separate();
		chickenThird.initializaData("Turuleca","blanca",3);
		chickenThird.print();
		chickenThird.negate();
		chickenThird.layAnEgg();
		chickenThird.affirm();
		chickenThird.poop();
		chickenThird.affirm();
		chickenThird.drink();
		//
		//declaracion del cuarto objeto
		Chicken chickenFourth;
		//inicializar el cuarto objeto
		chickenFourth = new Chicken();
		chickenFourth.separate();
		chickenFourth.initializaData("de los huevos de oro","amarilla",2);
		chickenFourth.print();
		chickenFourth.affirm();
		chickenFourth.layAnEgg();
		chickenFourth.negate();
		chickenFourth.poop();
		chickenFourth.affirm();
		chickenFourth.drink();
	}
	
}