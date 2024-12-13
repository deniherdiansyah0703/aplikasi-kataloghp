package com.project.kataloghp;

import java.util.ArrayList;

public class SamsungData {
    private static String [] samsungName = {
            "Galaxy S21",
            "Galaxy S20 FE",
            "Galaxy A52",
            "Galaxy M62",
            "Galaxy Note20 Ultra",
            "Galaxy A32",
            "Galaxy A72",
            "Galaxy A12",
            "Galaxy A22 5G",
            "Galaxy M32",
    };

    private static String [] samsungDetail = {
            "Bali adalah destinasi wisata yang sangat populer di Indonesia. Pulau ini dikenal sebagai surga bagi pecinta samsung karena keindahan pantai, hutan, dan gunungnya yang sangat memukau. Salah satu tempat wisata samsung yang terkenal di Bali adalah Pantai Kuta. Di sana, pengunjung dapat menikmati pemandangan matahari terbenam yang menakjubkan. Selain itu, Gunung Batur di kawasan Kintamani juga menjadi tempat wisata samsung yang sangat populer di Bali. Pengunjung dapat menikmati pemandangan sunrise dan melakukan trekking di sekitar kawasan gunung.",
            "Raja Ampat terletak di ujung barat Pulau Papua dan menjadi destinasi wisata samsung yang sangat populer di dunia. Raja Ampat menawarkan keindahan bawah laut yang sangat memukau dengan keanekaragaman hayati yang sangat tinggi. Pulau Wayag adalah salah satu tempat wisata samsung yang paling terkenal di Raja Ampat. Di sana, pengunjung dapat menikmati keindahan laguna biru dan pantai yang indah. Selain itu, Teluk Kabui dan Pulau Arborek juga menjadi tempat wisata samsung yang populer di Raja Ampat. Pengunjung dapat menikmati keindahan laut yang biru dan berbagai kegiatan seperti snorkeling, diving, dan berenang bersama ikan pari.",
            "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur dan menawarkan keindahan pegunungan dan kawah vulkanik. Gunung Bromo menjadi salah satu daya tarik wisata samsung di Taman Nasional ini. Pengunjung dapat menikmati pemandangan matahari terbit di sekitar kawah Gunung Bromo yang sangat indah.",
            "Danau Toba terletak di Sumatera Utara dan menjadi destinasi wisata samsung yang sangat populer di Indonesia. Danau Toba adalah danau vulkanik terbesar di dunia dengan pemandangan yang sangat indah. Pulau Samosir di tengah Danau Toba juga menjadi tempat wisata samsung yang sangat populer di sana. Di sana, pengunjung dapat menikmati pemandangan samsung yang indah dan kegiatan seperti berenang dan snorkeling.",
            "Taman Nasional Komodo terletak di Provinsi Nusa Tenggara Timur dan menawarkan keindahan samsung bawah laut yang sangat memukau. Di sana, pengunjung dapat melihat langsung satwa endemik Indonesia yaitu Komodo, kadal terbesar di dunia. Selain itu, pengunjung juga dapat menikmati keindahan pantai yang sangat indah di Pulau Pink, Pulau Kanawa, dan Pantai Kelor.",
            "Taman Nasional Gunung Leuser terletak di Sumatera Utara dan menjadi salah satu tempat wisata samsung yang populer di Indonesia. Taman Nasional ini menawarkan keindahan samsung hutan yang sangat lebat dan beragam jenis flora dan fauna. Salah satu daya tarik wisata samsung di Taman Nasional Gunung Leuser adalah Orangutan, hewan endemik Indonesia yang sangat langka dan dilindungi. Pengunjung dapat melihat langsung kehidupan Orangutan di habitat aslinya dan melakukan trekking di sekitar hutan.",
            "Taman Nasional Bunaken terletak di Sulawesi Utara dan menawarkan keindahan samsung bawah laut yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan terumbu karang yang sangat indah dan beragam jenis ikan yang bermukim di sana. Selain itu, Taman Nasional Bunaken juga menjadi tempat wisata samsung yang cocok untuk melakukan kegiatan diving dan snorkeling.",
            "Taman Nasional Lorentz terletak di Papua dan menjadi tempat wisata samsung yang sangat terkenal di Indonesia. Taman Nasional ini menawarkan keindahan pegunungan dan gletser yang sangat langka dan indah. Salah satu daya tarik wisata samsung di Taman Nasional Lorentz adalah Puncak Jaya, gunung tertinggi di Indonesia. Pengunjung dapat melakukan pendakian ke Puncak Jaya dan menikmati pemandangan samsung yang sangat memukau.",
            "Kepulauan Mentawai terletak di lepas pantai Sumatera Barat dan menjadi destinasi wisata samsung yang sangat populer di Indonesia. Kepulauan ini menawarkan keindahan samsung pantai yang sangat indah dan terkenal dengan ombak surf yang sangat besar. Selain itu, Kepulauan Mentawai juga menjadi tempat wisata samsung yang cocok untuk melakukan kegiatan snorkeling, diving, dan berenang bersama ikan hiu.",
            "Taman Nasional Bali Barat terletak di Bali dan menawarkan keindahan samsung hutan dan pantai yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan hutan bakau dan mangrove yang sangat lebat dan beragam jenis flora dan fauna. Selain itu, Taman Nasional Bali Barat juga menjadi tempat wisata samsung yang cocok untuk melakukan kegiatan diving dan snorkeling di sekitar pantai."
    };

    private static int[] samsungImage = {
            R.drawable.sam1,
            R.drawable.sam2,
            R.drawable.sam3,
            R.drawable.sam4,
            R.drawable.sam5,
            R.drawable.sam6,
            R.drawable.sam7,
            R.drawable.sam8,
            R.drawable.sam9,
            R.drawable.sam10,
    };
    private static String [] samsungProsesor = {
            "Qualcomm Snapdragon 888",
            "Qualcomm Snapdragon 865",
            "Qualcomm Snapdragon 720G",
            "Exynos 9825",
            "Exynos 990",
            "MediaTek Helio G80",
            "Qualcomm Snapdragon 720G",
            "MediaTek Helio P35",
            "MediaTek Dimensity 700 5G",
            "MediaTek Helio G80",
    };
    private static String [] samsungCamera = {
            "Belakang triple camera 64 MP + 12 MP + 12 MP, depan 10 MP",
            "Belakang triple camera 12 MP + 12 MP + 8 MP, depan 32 MP",
            "Belakang quad camera 64 MP + 12 MP + 8 MP + 2 MP, depan 16 MP",
            "Belakang quad camera 64 MP + 12 MP + 5 MP + 5 MP, depan 32 MP",
            "Belakang triple camera 108 MP + 12 MP + 12 MP, depan 10 MP",
            "Belakang triple camera 48 MP + 2 MP + 2 MP, depan 13 MP",
            "Belakang quad camera 64 MP + 8 MP + 12 MP + 2 MP, depan 32 MP",
            "Belakang dual camera 13 MP + 2 MP, depan 5 MP",
            "Belakang triple camera 48 MP + 5 MP + 2 MP, depan 8 MP",
            "Belakang quad camera 64 MP + 8 MP + 2 MP + 2 MP, depan 20 MP",
    };
    private static String [] samsungRam = {
            "8/12 GB",
            "6/8 GB",
            "4/6/8 GB",
            "6/8 GB",
            "12 GB",
            "3/4 GB",
            "8 GB",
            "3/4 GB",
            "4/6/8 GB",
            "4/6 GB",
    };
    private static String [] samsungRom = {
            "128/256 GB",
            "128 GB",
            "128 GB",
            "128 GB",
            "256 GB",
            "32/64 GB",
            "128/256 GB",
            "32/64 GB",
            "128 GB",
            "128 GB"
    };

    static ArrayList<Samsung> getListData(){
        ArrayList<Samsung> list = new ArrayList<>();
        for (int position = 0; position <samsungName.length; position++){
            Samsung samsung = new Samsung();
            samsung.setName(samsungName[position]);
//            samsung.setDetail(samsungDetail[position]);
            samsung.setProsesor(samsungProsesor[position]);
            samsung.setCamera(samsungCamera[position]);
            samsung.setRam(samsungRam[position]);
            samsung.setRom(samsungRom[position]);
            samsung.setPhoto(samsungImage[position]);
            list.add(samsung);
        }
        return list;
    }
}
