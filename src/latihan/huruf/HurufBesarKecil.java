package latihan.huruf;
import java.util.Scanner;
public class HurufBesarKecil {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Masukan Kalimat : ");
		String kalimat = reader.next();
		System.out.println("");
		System.out.println("====Hasil Formatting====");
		System.out.println("Huruf Besar : " + kalimat.toUpperCase());
		System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
		reader.close();

	}

}
