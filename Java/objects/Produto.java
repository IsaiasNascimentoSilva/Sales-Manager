package objects;

import java.util.Objects;

/**
 * 
 * @author Isaias.Silva
 * @description Representa um produto de um bar
 *
 */

public class Produto {
	private String name;
	private double preco;
	private EstadoP status;
	
	public Produto(String name, double preco) {
		super();
		this.name = name;
		this.preco = preco;
		this.status = EstadoP.DEVENDO;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public EstadoP getStatus() {
		return status;
	}

	public void setStatus() {
		this.status = EstadoP.PAGO;
	}


}
