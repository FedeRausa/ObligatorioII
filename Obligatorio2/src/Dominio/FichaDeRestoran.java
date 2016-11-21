
package Dominio;


public class FichaDeRestoran {
   private Evaluacion eval;
   private Cliente usu;
   private Restoran Resto;

    public FichaDeRestoran(Evaluacion eval, Cliente usu, Restoran Resto) {
        this.eval = eval;
        this.usu = usu;
        this.Resto = Resto;
    }

    public FichaDeRestoran() {
    }

    public Evaluacion getEval() {
        return eval;
    }

    public void setEval(Evaluacion eval) {
        this.eval = eval;
    }

    public Cliente getUsu() {
        return usu;
    }

    public void setUsu(Cliente usu) {
        this.usu = usu;
    }

    public Restoran getResto() {
        return Resto;
    }

    public void setResto(Restoran Resto) {
        this.Resto = Resto;
    }
   
   
   
   
   
}
