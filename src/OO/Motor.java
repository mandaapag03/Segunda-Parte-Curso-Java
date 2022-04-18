package OO;

public class Motor {
    double fatorDeInjecao = 1;
    boolean ligado = true;

    int giros(){
        if(!ligado){
            return 0;
        }
        else{
            return (int)Math.round(fatorDeInjecao * 3000);
        }
    }
}
