package pajaritos;

public class Loro extends Ave{
	
	private String region;
	private String color;
	
	public Loro(String sexo, int edad, String region, String color) {
		super(sexo, edad);
		this.region = region;
		this.color = color;
	}
	
	public Loro(String sexo, int edad, DatosPersonales nombres, String region, String color) {
		super(sexo, edad, nombres);
		this.region = region;
		this.color = color;
	}

	@Override
	public void cantar() {
		System.out.println("Canto como un Loro");
		
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

	public String getRegion() {
		switch(region) {
		case "N":
			return "Norte";
		case "S":
			return "Sur";
		case "E":
			return "Este";
		case "O":
			return "Oeste";
		default:
			return "Región desconocida";
		}
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
