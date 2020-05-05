class RunGetSet{
     public static void main(String [] args){
	GetSet G = new GetSet();

	G.setNidn("0906078701");
	G.setNamadosen("Mardiyyah Hasnawi, S.Kom., M.T");
	G.setjurusan("Teknik Informatika");
	G.setfakultas("Ilmu Komputer");
	G.setemail("mardiyyah.hasnawi@umi.ac.id");

	System.out.println("Data Dosen PBO Kelas B2 Angkatan 2018 : ");
	System.out.println("Nidn	   : " + G.getNidn());
	System.out.println("NamaDosen  : " + G.getNamadosen());
	System.out.println("Jurusan	   : " + G.getjurusan());
	System.out.println("Fakultas   : " + G.getfakultas());
	System.out.println("Email	   : " + G.getemail());
	}
}