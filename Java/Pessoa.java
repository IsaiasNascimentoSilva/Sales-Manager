/**
 * Reresenta uma pessoa fisica
 */

 public Class abstract Pessoa{
     private String name;
     private String cpf;

     public void Pessoa(String name, String cpf) {
         this.name = name;
         this.cpf = cpf;
         
     }
     //Retorna o nome da pessoa
     public String getName() {
         return this.name;
     }


 }