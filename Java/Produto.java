/**
 * Reresenta um produto
 * 
 */

public Class Produto{
    private String nome; //Nome do produto
    private int id; //Identificador do produto
    private double preco; //Seu valor
    private Estado situacao;

    public void Produto(String nome, int id, double valor) {
        this.nome = nome;
        this.preco = valor;
        this.id = id;
        this.situacao = DEVENDO;
        
    }
    /**
     * Retorna o nome do produto
     */
    public String getName() {
        return this.nome;
        
    }
    //Retorna identificador do produto
    public int getId() {
        return this.id;
    }
    //Retorna preco do produto
    public double getPreco() {
        return this.preco;
    }
    //Atualiza preco do produto
    public void setPreco(dooble newPreco) {
        this.preco = newPreco;
    }
    //Atualiza situação do produto
    public void setSituacao() {
        this.situacao = PAGO;
    }

    enum Estado{
        PAGO,
        DEVENDO
    }
}