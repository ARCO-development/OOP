package conversor;

public class KelvinRankine implements ConversorTemperatura{
    
    @Override
    public double converteTemperatura(double temperatura) {
        return temperatura * 1.8;
    }
}
