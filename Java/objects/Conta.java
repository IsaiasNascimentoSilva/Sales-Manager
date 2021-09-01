package objects;

import java.util.ArrayList;
import java.util.Objects;

/**
 * 
 * @author Isaias.Silva
 * @description Representa a conta de um cliente
 *
 */

public class Conta {
	private int id;
	private ArrayList<Produto> produtos;
	
	public Conta(int id) {
		super();
		this.id = id;
		this.produtos = new ArrayList<Produto>();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return id == other.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void addProduto(Produto produto) {
		this.produtos.add(produto);
	}
	

}
