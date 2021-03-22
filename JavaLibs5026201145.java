import javax.swing.JOptionPane;

public class JavaLibs5026201145 {
    public static void main (String[] args) {
	
	String nama = JOptionPane.showInputDialog("Siapa namamu? Panggilan aja ya");

	int tahun = Integer.parseInt(JOptionPane.showInputDialog("Sebutkan tahun lahirmu"));

	String warnaToko = JOptionPane.showInputDialog("Warna favorit?");

	String barangTas = JOptionPane.showInputDialog("Sebutkan 1 barang yang selalu ada di tasmu");

	int diskon = Integer.parseInt(JOptionPane.showInputDialog("Pilih angka favorit antara 10 hingga 90, misal 25"));

	int hargaAsli = Integer.parseInt(JOptionPane.showInputDialog("Berapa pengeluaranmu untuk sekali jalan-jalan? Misal 50000"));

	int hargaDiskon = hargaAsli * (100 - diskon) / 100;

	String hadiah = JOptionPane.showInputDialog("Apa hewan favoritmu?");

	double desimal = Double.parseDouble(JOptionPane.showInputDialog("Pilih satu bilangan desimal antara 1 sampai 5, misal 2.5"));

	String artisFav = JOptionPane.showInputDialog("Sebutkan satu nama artis favoritmu");

	String keluarga = JOptionPane.showInputDialog("Sebutkan satu anggota keluargamu, misal Ibu");

	String hariFav = JOptionPane.showInputDialog("Apa hari yang paling kamu sukai?");

	int jamTidur = Integer.parseInt(JOptionPane.showInputDialog("Berapa jam kamu biasa tidur?"));

	int waktuBangun = Integer.parseInt(JOptionPane.showInputDialog("Jam berapa kamu biasa bangun di pagi hari?"));


	JOptionPane.showMessageDialog(null, "   Selamat datang di toko kecantikan " +nama +"! Toko kami sudah berdiri sejak tahun " +tahun
					+"\ndengan warna " +warnaToko +" sebagai ciri khas ikonik toko " +nama +". Toko " +nama +" menjual" 
					+"\nsegala kebutuhan di bidang kecantikan, seperti lipstick, bedak, pelembab, dan " +barangTas +"."
					+"\nTidak perlu ragu, tidak perlu resah karena seluruh barang kami terjangkau dan kami sedang memberikan"
					+"\ndiskon sebesar " +diskon +" persen. " +barangTas +" dengan harga asli " +hargaAsli +" dapat ditebus"
					+"\ndengan harga " +hargaDiskon + " saja! Tidak hanya diskon, kami juga memberikan hadiah spesial"
					+"\n berupa " +hadiah +" untuk yang beruntung. Tentunya toko kami hanya menjual barang-barang asli dari"
					+"\npemasok yang terpercaya dengan bintang " +desimal +". Oh ya, bagi kalian yang belum tahu, " +artisFav
					+"\npernah kesini loh! Jadi ayo ajak " +keluarga +"mu untuk berbelanja di toko " +nama +"! Kami buka"
					+"\nsetiap hari kecuali hari " +hariFav +" selama " +jamTidur +" jam mulai dari pukul " +waktuBangun +" pagi. "
					+"\nKami tunggu kehadiranmu dan " +keluarga +"mu!");

	System.out.println("   Selamat datang di toko kecantikan " +nama +"! Toko kami sudah berdiri sejak tahun " +tahun
				+"\ndengan warna " +warnaToko +" sebagai ciri khas ikonik toko " +nama +". Toko " +nama +" menjual" 
				+"\nsegala kebutuhan di bidang kecantikan, seperti lipstick, bedak, pelembab, dan " +barangTas +"."
				+"\nTidak perlu ragu, tidak perlu resah karena seluruh barang kami terjangkau dan kami sedang memberikan"
				+"\ndiskon sebesar " +diskon +" persen. " +barangTas +" dengan harga asli " +hargaAsli +" dapat ditebus"
				+"\ndengan harga " +hargaDiskon + " saja! Tidak hanya diskon, kami juga memberikan hadiah spesial"
				+"\nberupa " +hadiah +" untuk yang beruntung. Tentunya toko kami hanya menjual barang-barang asli dari"
				+"\npemasok yang terpercaya dengan bintang " +desimal +". Oh ya, bagi kalian yang belum tahu, " +artisFav
				+"\npernah kesini loh! Jadi ayo ajak " +keluarga +"mu untuk berbelanja di toko " +nama +"! Kami buka"
				+"\nsetiap hari kecuali hari " +hariFav +" selama " +jamTidur +" jam mulai dari pukul " +waktuBangun +" pagi. "
				+"\nKami tunggu kehadiranmu dan " +keluarga +"mu!");
 

    }
}