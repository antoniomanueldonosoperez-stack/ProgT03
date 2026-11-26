package tema03.ejercicioFinal;

public class Producto {

	private Long id;
	private String nombre;
	private Double precio;
	private Integer stock;

	public Producto() {

	}

	public Producto(Long id, String nombre, Double precio, Integer stock) {
		setId(id);
		setNombre(nombre);
		setPrecio(precio);
		setStock(stock);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {

		if (id == null || id <= 0) {
			throw new IllegalArgumentException("El id no puede ser null o ser menor o igual que cero");
		}
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.trim().length() < 2) {
			throw new IllegalArgumentException("El nombre no puede ser null o tener menos de 2 caracteres");
		}
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		if (precio == null || precio <= 0.0) {
			throw new IllegalArgumentException("El precio no puede ser null o ser menor o igual que 0.0");
		}
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		if (stock != null && stock < 0) {
			throw new IllegalArgumentException("El stock no puede ser negativo");

		}
		this.stock = stock;
	}

	public void aplicarDescuento(Double porcentaje) {
		if (porcentaje == null || porcentaje < 0.1 || porcentaje > 0.9) {
			throw new IllegalArgumentException("El porcentaje debe estar entre 0.01 y 0.09");
		}

		Double descuento = porcentaje * precio;
		precio = precio / descuento;
	}

}
