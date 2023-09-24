import java.util.Scanner;

class kasirnazwa {
  public static void main(String[] argumen) {

    boolean programBerjalan = true;
	//boolean adalah tipe data yang menyatakan true atau false

    int totalBarang1 = 0;
    int totalBarang2 = 0;
    int totalBarang3 = 0;
    int totalBarang4 = 0;
    int totalKeuntungan = 0;
	//int untuk penulisan yang berhubungan dengan bilangan.

    Scanner inputPengguna = new Scanner(System.in);
	//scanner untuk menginput variable
    int nomorBarangDibeli;
    int kuantitasBarangDibeli;
    String kataPembuka;
	//string untuk memanipulasi java

    while(programBerjalan) {
		//while untuk pengulangan dalam suatu program
      kataPembuka = "========================================================";
      kataPembuka += "\nSelamat datang di Toko nazwa collection, disini kami jual beberapa baju unntuk remaja, mau beli baju yang kaya gimana?";
      kataPembuka += "\n1. Baju hodie ($ 300) - " + totalBarang1 + " barang terjual";
      kataPembuka += "\n2. Baju kemeja($ 250) - " + totalBarang2 + " barang terjual";
      kataPembuka += "\n3. Baju blouse($ 350) - " + totalBarang3 + " barang terjual";
      kataPembuka += "\n4. Baju sweater ($ 120) - " + totalBarang4 + " barang terjual";
      kataPembuka += "\n9. ngga jadi beli soalnya kemahalan, jadi saya memilih untuk keluar saja.";
      kataPembuka += "\n\nTotal keuntungan toko saat ini $ " + totalKeuntungan + ",,, alhamdulillah saya cepet naik haji";
      kataPembuka += "\n========================================================";
      kataPembuka += "\n\nPilih nomor barang (1 / 2 / 3 / 4):";
	   kataPembuka += "\nPilih nomor pesanan:";

      System.out.println(kataPembuka);
      nomorBarangDibeli = inputPengguna.nextInt();

      if (nomorBarangDibeli == 1 || nomorBarangDibeli == 2 || nomorBarangDibeli == 3 || nomorBarangDibeli == 4) {
	// if untuk pilihan variable yang true/sesuai

        System.out.println("Barang nomor " + nomorBarangDibeli + " dipilih\nMau berapa banyak ?");
        kuantitasBarangDibeli = inputPengguna.nextInt();

        System.out.println("Barang nomor " + nomorBarangDibeli + " dibeli sejumlah " + kuantitasBarangDibeli + " buah");

        switch(nomorBarangDibeli) {
          //kode untukk memerintahkan membandingkan isi sebuah variable
		  case 1:
            totalBarang1 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 30);
            break;
          case 2:
            totalBarang2 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 20);
            break;
			//break untuk berhenti
          case 3:
            totalBarang3 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 35);
            break;
          case 4:
            totalBarang4 += kuantitasBarangDibeli;
            totalKeuntungan += (kuantitasBarangDibeli * 12);
            break;
        }

      } else if (nomorBarangDibeli == 9) {
		  // else if untuk jika pilihan variable false 
        programBerjalan = false; 
        System.out.println("Sayang sekali, kamu melewatkan barang baju yang berkualitas");
      } else {
        System.out.println("Apa yang kamu pilih tidak layak untuk dibeli");
      }
    }
  }
}
        
