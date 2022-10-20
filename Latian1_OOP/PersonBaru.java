public class PersonBaru{
	public static void main(String[] args){
	//membuat object Anton
	Person Anton = new Person();
	
	/*memanggil atribut dan memberi nilai*/
	Anton.nama = "Anton";
	Anton.jenisKelamin = "Laki-laki";
	Anton.umur = 23;
	
	System.out.println("Nama: " + Anton.nama);
	System.out.println("Jenis Kelamin: " + Anton.jenisKelamin);
	System.out.println("Umur: " + Anton.umur);
	
	//membuat object Riko
	Person Riko = new Person();
	/*memanggil atribut dan memberi nilai*/
	Riko.nama = "Riko";
	Riko.jenisKelamin = "Laki-laki";
	Riko.umur = 16;
	
	System.out.println("Nama: " + Riko.nama);
	System.out.println("Jenis Kelamin: " + Riko.jenisKelamin);
	System.out.println("Umur: " + Riko.umur);
	}
}
