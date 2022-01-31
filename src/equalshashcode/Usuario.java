package equalshashcode;

public class Usuario {
    
    String name;
    String email;
    
    /*Gerar equals e hashcode automático: 
    Botão direito > Source Action > Generate Hashcode() and Equals()...*/
    public int hashCode() {
        return this.name.length();
    }

    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;
        if (outro.name.equals(this.name) && outro.email.equals(this.email)){
            return true;
        }else {
            return false;
        }
        
    }

}