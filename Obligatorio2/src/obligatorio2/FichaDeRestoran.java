
package obligatorio2;


public class FichaDeRestoran {
   private Evaluacion eval;
   private Usuario usu;
   private Restoran Resto;

    public FichaDeRestoran(Evaluacion eval, Usuario usu, Restoran Resto) {
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

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }

    public Restoran getResto() {
        return Resto;
    }

    public void setResto(Restoran Resto) {
        this.Resto = Resto;
    }
   
   
   
   
   
}
