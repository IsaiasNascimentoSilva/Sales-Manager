/**
 * Reresenta uma conta, contendo os produtos consumidos
 * e o valor a ser pago
 */
import java.util.ArrayList;
import Produto;

 public Class Conta{
     private ArrayList<Produto> produts;
     private double value;
     private String date;

     public void Conta(String date) {
         this.produts = new ArrayList<Produto>();
         this.value = 0.0;
         this.date = date;
     }

     //Retorna os produtos
     public ArrayList<Produto> getProduts() {
         return this.produts;
     }

     //Adiciona produto
     public String addProdut(Produto newProduto) {
         this.produts.add(newProduto);
         this.value += newProduto.getPreco;
         return newProduto.getName;
     }

     //Atualiza o valor a ser pago
     public void setValue(double newValue) {
         this.value -= newValue
     }

     //Retorna valor a ser pago
     public double getValue() {
         return this.value;
     }

 }