package com.example.wargaperumahantpi

data class DataWarga(
    var namaLengkap: String,
    var nomorRumah: String,
    var usia: Int,
)

fun getDataWarga(): List<DataWarga>{
    return listOf(
        DataWarga("Budi Santoso", "A1 No. 05", 34),
        DataWarga("Budi Santoso", "A1 No. 05", 34),
        DataWarga("Budi Santoso", "A1 No. 05", 34),
        DataWarga("Budi Santoso", "A1 No. 05", 34),
        DataWarga("Budi Santoso", "A1 No. 05", 34),
        DataWarga("Budi Santoso", "A1 No. 05", 34),
        DataWarga("Budi Santoso", "A1 No. 05", 34),

    )
}