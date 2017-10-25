public class HelloWord{
	public static void main(String[] args){
		System.out.println("Hello Danny");
		Chicken chicken;
		//inicializar el objeto
		chicken = new Chicken();
		chicken.initializaData("Lucy","cafe",2);
		chicken.print();
		//s.o.p´(chicken.name)-->no funciona la variable es privada
	}
	
}