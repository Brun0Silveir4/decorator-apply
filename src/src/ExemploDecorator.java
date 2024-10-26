package src;

public class ExemploDecorator {
	public static void main(String[] args) {
		Bebida cafe = new Cafe();
		Bebida chocolate = new Chocolate();
		Bebida cafe2 = new Cafe();
		
		cafe = new LeiteDecorator(cafe);
		cafe = new AcucarDecorator(cafe);
		
		cafe2 = new AcucarDecorator(cafe2);
		cafe2 = new ChantillyDecorator(cafe2);
		
		chocolate = new ChantillyDecorator(chocolate);
		
		System.out.println("Bebida: " + cafe.obterDescricao());
		System.out.println("Custo total: R$" + cafe.obterCusto());
		
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("");
		
		System.out.println("Bebida: " + chocolate.obterDescricao());
		System.out.println("Custo total: R$" + chocolate.obterCusto());
		
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("");
		
		System.out.println("Bebida: " + cafe2.obterDescricao());
		System.out.println("Custo total: R$" + cafe2.obterCusto());
	}
}
