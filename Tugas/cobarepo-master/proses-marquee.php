<?php
include("config.php");

$isi_marquee = $_POST['isi_marquee'];

$sql = "UPDATE marquee SET isi_marquee='$isi_marquee' WHERE id_marquee=3 ";
$query = mysqli_query($db, $sql);

//apakah query update berhasil?
if ($query) {
	
} else {
	//kalau gagal tampilkan pesan
	die("Gagal menyimpan perubahan...");
}

?>