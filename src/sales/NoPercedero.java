package sales;

public class NoPercedero extends Producto {
	private String tipo;

	public NoPercedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return super.toString() + "NoPercedero [tipo=" + tipo + "]";
	}

	
	
	
}
