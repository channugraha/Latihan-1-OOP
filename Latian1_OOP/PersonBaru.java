public class PersonBaru{
	public static void main(String[] args){
	//membuat object Anton
	Person personAnton = new Person();
	
	/*memanggil atribut dan memberi nilai*/
	personAnton.nama = "Anton";
	personAnton.jenisKelamin = "Laki-laki";
	personAnton.umur = 23;
	
	System.out.println("Nama: " + personAnton.nama);
	System.out.println("Jenis Kelamin: " + personAnton.jenisKelamin);
	System.out.println("Umur: " + personAnton.umur);
	
	//membuat object Riko
	Person personRiko = new Person();
	
	/*memanggil atribut dan memberi nilai*/
	personRiko.nama = "Riko";
	personRiko.jenisKelamin = "Laki-laki";
	personRiko.umur = 16;
	
	System.out.println("Nama: " + personRiko.nama);
	System.out.println("Jenis Kelamin: " + personRiko.jenisKelamin);
	System.out.println("Umur: " + personRiko.umur);
	}
}