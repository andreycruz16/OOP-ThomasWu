package temperatureConvesion;

public class TempConvert {
	private int celsius, fahrenheit;
	
	public TempConvert(){
		celsius = 0;
		fahrenheit = 0;	
	}
	public void toCelsius(int fah){
		celsius = (int) ((0.56) * (fah - 32));
	}
	public void toFahrenheit(int cel){
		fahrenheit = (int) (1.8 * cel + 32);
	}
	public int getCelsius(){
		return celsius;
	}
	public int getFahrenheit(){
		return fahrenheit;
	}
}//xx
