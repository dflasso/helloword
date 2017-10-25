public class Chicken{
		//Atributos
		private String name;
		private String color;
		private int age;
		//metodos
		public void layAnEgg(){
			System.out.println("The chicken lay an egg");
		}
		public void poop(){
			System.out.println("The Chicken poop");
		}
		public void drink(){
			System.out.println("The chicken drink");
		}
		public void print(){
			System.out.println("The name of the chicken" +name+ ", color  " +color+ ", age  " +age);
		}
		public void initializaData(String name,String color,int age){
			this.name=name;
			this.color=color;
			this.age=age;
		}
}