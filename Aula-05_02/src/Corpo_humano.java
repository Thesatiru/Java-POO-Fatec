public class Corpo_humano {
    private  float massa;
    public float densidade;
    public float volume;

    public void setMassa(float massa){
        this.massa = massa;
    }
    public void setVolume(float volume){
        this.volume = volume;

    }
    public void setDensidade(float volume){
        this.volume = volume;

    }

    public void calcularDensidade(){
        densidade = massa/volume;
    }
    public float getDensidade(){
        return this.densidade;
    }
        
    }