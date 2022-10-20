public class PersonBaru{
	public static void main(String[] args){
	//membuat object Anton
	Person anton = new Person();
	
	/*memanggil atribut dan memberi nilai*/
	anton.nama = "Anton";
	anton.jenisKelamin = "Laki-laki";
	anton.umur = 23;
	
	System.out.println("Nama: " + anton.nama);
	System.out.println("Jenis Kelamin: " + anton.jenisKelamin);
	System.out.println("Umur: " + anton.umur);
	
	//membuat object Riko
	Person riko = new Person();
	/*memanggil atribut dan memberi nilai*/
	riko.nama = "Riko";
	riko.jenisKelamin = "Laki-laki";
	riko.umur = 16;
	
	System.out.println("Nama: " + riko.nama);
	System.out.println("Jenis Kelamin: " + riko.jenisKelamin);
	System.out.println("Umur: " + riko.umur);
	}
}
