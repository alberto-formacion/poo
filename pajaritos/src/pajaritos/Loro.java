package pajaritos;

public class Loro extends Ave{
	
	public String region;
	public String color;
	
	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
	
	public void deDondeEres() {
		switch(region) {
		case "N":
			System.out.println("Norte");
			break;
		case "S":
			System.out.println("Sur");
			break;
		case "E":
			System.out.println("Este");
			break;
		case "O":
			System.out.println("Oeste");
			break;
		default:
			System.out.println("Región desconocida");
		}
	}

}
