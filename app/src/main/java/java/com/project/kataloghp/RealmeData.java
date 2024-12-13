package com.project.kataloghp;

import java.util.ArrayList;

public class RealmeData {
    private static String [] realmeName = {
            "Narzo 30 Pro",
            "C25",
            "C11 (2021)",
            "8 Pro",
            "7 5G",
            "7i"
    };

    private static String [] realmeDetail = {
            "Bali adalah destinasi wisata yang sangat populer di Indonesia. Pulau ini dikenal sebagai surga bagi pecinta realme karena keindahan pantai, hutan, dan gunungnya yang sangat memukau. Salah satu tempat wisata realme yang terkenal di Bali adalah Pantai Kuta. Di sana, pengunjung dapat menikmati pemandangan matahari terbenam yang menakjubkan. Selain itu, Gunung Batur di kawasan Kintamani juga menjadi tempat wisata realme yang sangat populer di Bali. Pengunjung dapat menikmati pemandangan sunrise dan melakukan trekking di sekitar kawasan gunung.",
            "Raja Ampat terletak di ujung barat Pulau Papua dan menjadi destinasi wisata realme yang sangat populer di dunia. Raja Ampat menawarkan keindahan bawah laut yang sangat memukau dengan keanekaragaman hayati yang sangat tinggi. Pulau Wayag adalah salah satu tempat wisata realme yang paling terkenal di Raja Ampat. Di sana, pengunjung dapat menikmati keindahan laguna biru dan pantai yang indah. Selain itu, Teluk Kabui dan Pulau Arborek juga menjadi tempat wisata realme yang populer di Raja Ampat. Pengunjung dapat menikmati keindahan laut yang biru dan berbagai kegiatan seperti snorkeling, diving, dan berenang bersama ikan pari.",
            "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur dan menawarkan keindahan pegunungan dan kawah vulkanik. Gunung Bromo menjadi salah satu daya tarik wisata realme di Taman Nasional ini. Pengunjung dapat menikmati pemandangan matahari terbit di sekitar kawah Gunung Bromo yang sangat indah.",
            "Danau Toba terletak di Sumatera Utara dan menjadi destinasi wisata realme yang sangat populer di Indonesia. Danau Toba adalah danau vulkanik terbesar di dunia dengan pemandangan yang sangat indah. Pulau Samosir di tengah Danau Toba juga menjadi tempat wisata realme yang sangat populer di sana. Di sana, pengunjung dapat menikmati pemandangan realme yang indah dan kegiatan seperti berenang dan snorkeling.",
            "Taman Nasional Komodo terletak di Provinsi Nusa Tenggara Timur dan menawarkan keindahan realme bawah laut yang sangat memukau. Di sana, pengunjung dapat melihat langsung satwa endemik Indonesia yaitu Komodo, kadal terbesar di dunia. Selain itu, pengunjung juga dapat menikmati keindahan pantai yang sangat indah di Pulau Pink, Pulau Kanawa, dan Pantai Kelor.",
            "Taman Nasional Gunung Leuser terletak di Sumatera Utara dan menjadi salah satu tempat wisata realme yang populer di Indonesia. Taman Nasional ini menawarkan keindahan realme hutan yang sangat lebat dan beragam jenis flora dan fauna. Salah satu daya tarik wisata realme di Taman Nasional Gunung Leuser adalah Orangutan, hewan endemik Indonesia yang sangat langka dan dilindungi. Pengunjung dapat melihat langsung kehidupan Orangutan di habitat aslinya dan melakukan trekking di sekitar hutan.",
            "Taman Nasional Bunaken terletak di Sulawesi Utara dan menawarkan keindahan realme bawah laut yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan terumbu karang yang sangat indah dan beragam jenis ikan yang bermukim di sana. Selain itu, Taman Nasional Bunaken juga menjadi tempat wisata realme yang cocok untuk melakukan kegiatan diving dan snorkeling.",
            "Taman Nasional Lorentz terletak di Papua dan menjadi tempat wisata realme yang sangat terkenal di Indonesia. Taman Nasional ini menawarkan keindahan pegunungan dan gletser yang sangat langka dan indah. Salah satu daya tarik wisata realme di Taman Nasional Lorentz adalah Puncak Jaya, gunung tertinggi di Indonesia. Pengunjung dapat melakukan pendakian ke Puncak Jaya dan menikmati pemandangan realme yang sangat memukau.",
            "Kepulauan Mentawai terletak di lepas pantai Sumatera Barat dan menjadi destinasi wisata realme yang sangat populer di Indonesia. Kepulauan ini menawarkan keindahan realme pantai yang sangat indah dan terkenal dengan ombak surf yang sangat besar. Selain itu, Kepulauan Mentawai juga menjadi tempat wisata realme yang cocok untuk melakukan kegiatan snorkeling, diving, dan berenang bersama ikan hiu.",
            "Taman Nasional Bali Barat terletak di Bali dan menawarkan keindahan realme hutan dan pantai yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan hutan bakau dan mangrove yang sangat lebat dan beragam jenis flora dan fauna. Selain itu, Taman Nasional Bali Barat juga menjadi tempat wisata realme yang cocok untuk melakukan kegiatan diving dan snorkeling di sekitar pantai."
    };

    private static int[] realmeImage = {
            R.drawable.re1,
            R.drawable.re2,
            R.drawable.re3,
            R.drawable.re4,
            R.drawable.re5,
            R.drawable.re6,
    };
    private static String [] realmeProsesor = {
            "MediaTek Dimensity 800U 5G",
            "MediaTek Helio G70",
            "MediaTek Helio G35",
            "Qualcomm Snapdragon 720G",
            "MediaTek Dimensity 800U 5G",
            "Qualcomm Snapdragon 662",
    };
    private static String [] realmeCamera = {
            "Belakang triple camera 48 MP + 8 MP + 2 MP, depan 16 MP",
            "Belakang triple camera 13 MP + 2 MP + 2 MP, depan 8 MP",
            "Belakang dual camera 13 MP + 2 MP, depan 5 MP",
            "Belakang quad camera 108 MP + 8 MP + 2 MP + 2 MP, depan 16 MP",
            "Belakang triple camera 48 MP + 8 MP + 2 MP, depan 16 MP",
            "Belakang quad camera 64 MP + 8 MP + 2 MP + 2 MP, depan 16 MP",
    };
    private static String [] realmeRam = {
            "6/8 GB",
            "4/6 GB",
            "2/3 GB",
            "8/12 GB",
            "6 GB",
            "4/8 GB",
    };
    private static String [] realmeRom = {
            "64/128 GB",
            "64 GB",
            "32 GB",
            "128/256 GB",
            "128 GB",
            "64/128 GB",
    };

    static ArrayList<Realme> getListData(){
        ArrayList<Realme> list = new ArrayList<>();
        for (int position = 0; position <realmeName.length; position++){
            Realme realme = new Realme();
            realme.setName(realmeName[position]);
//            realme.setDetail(realmeDetail[position]);
            realme.setProsesor(realmeProsesor[position]);
            realme.setCamera(realmeCamera[position]);
            realme.setRam(realmeRam[position]);
            realme.setRom(realmeRom[position]);
            realme.setPhoto(realmeImage[position]);
            list.add(realme);
        }
        return list;
    }
}
