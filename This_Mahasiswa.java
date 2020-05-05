public class This_Mahasiswa{
	String nama, prodi;
	int NIM;
	
	public This_Mahasiswa(String nm, String prodi, int nim){
	this.nama= nm;
	this.prodi = prodi;
	this.NIM= nim;
	}
	
	public static void main(String[] args){
		This_Mahasiswa Mhs = new This_Mahasiswa("Yulianti A","Teknik Informatika",125);
		System.out.print("Biodata Mahasiswa : ");
		System.out.print("\nNama    : "+Mhs.nama+"\nProdi   : "+Mhs.prodi+"\nStambuk : "+Mhs.NIM);
	}
}