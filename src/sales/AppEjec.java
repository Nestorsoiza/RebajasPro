package sales;

public class AppEjec {
	public static void main(String[] args) {
		Producto[] productos = new Producto[5];
		
		productos[0] = new Perecedero("Queso untar", 2.35, 2);
		productos[1] = new NoPercedero("lomo", 4.56, "Fresco");
		productos[2] = new Producto("Pan", 3.0);
		productos[3] = new Perecedero("Merluza", 9.65, 2);
		productos[4] = new Perecedero("Hummus", 3.35, 1);
		
		double total = 0;
		for (Producto producto : productos) {
			int i = 0;
			total += productos[i].calcular(5);
		}
		System.out.println("El total es " + total);
	}
}
