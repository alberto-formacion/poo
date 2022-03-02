package matrices;

public class Main {

	public static void main(String[] args) {

		//String[] matriz = new String[2];
		String[][] matriz = new String[2][2];
		
		matriz[0][0] = "F1 C1";
		matriz[0][1] = "F1 C2";
		
		matriz[1][0] = "F2 C1";
		matriz[1][1] = "F2 C2";
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.println(matriz[i][j]);
			}
		}


	}

}
