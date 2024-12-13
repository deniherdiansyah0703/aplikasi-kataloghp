package com.project.kataloghp;

import java.util.ArrayList;

public class XiaomiData {
    private static String [] xiaomiName = {
            "Redmi Note 10 Pro",
            "Redmi 9T",
            "Mi 11",
            "Poco X3 Pro",
            "Redmi Note 9",
            "Mi 10T Pro",
    };

    private static String [] xiaomiDetail = {
            "Bali adalah destinasi wisata yang sangat populer di Indonesia. Pulau ini dikenal sebagai surga bagi pecinta xiaomi karena keindahan pantai, hutan, dan gunungnya yang sangat memukau. Salah satu tempat wisata xiaomi yang terkenal di Bali adalah Pantai Kuta. Di sana, pengunjung dapat menikmati pemandangan matahari terbenam yang menakjubkan. Selain itu, Gunung Batur di kawasan Kintamani juga menjadi tempat wisata xiaomi yang sangat populer di Bali. Pengunjung dapat menikmati pemandangan sunrise dan melakukan trekking di sekitar kawasan gunung.",
            "Raja Ampat terletak di ujung barat Pulau Papua dan menjadi destinasi wisata xiaomi yang sangat populer di dunia. Raja Ampat menawarkan keindahan bawah laut yang sangat memukau dengan keanekaragaman hayati yang sangat tinggi. Pulau Wayag adalah salah satu tempat wisata xiaomi yang paling terkenal di Raja Ampat. Di sana, pengunjung dapat menikmati keindahan laguna biru dan pantai yang indah. Selain itu, Teluk Kabui dan Pulau Arborek juga menjadi tempat wisata xiaomi yang populer di Raja Ampat. Pengunjung dapat menikmati keindahan laut yang biru dan berbagai kegiatan seperti snorkeling, diving, dan berenang bersama ikan pari.",
            "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur dan menawarkan keindahan pegunungan dan kawah vulkanik. Gunung Bromo menjadi salah satu daya tarik wisata xiaomi di Taman Nasional ini. Pengunjung dapat menikmati pemandangan matahari terbit di sekitar kawah Gunung Bromo yang sangat indah.",
            "Danau Toba terletak di Sumatera Utara dan menjadi destinasi wisata xiaomi yang sangat populer di Indonesia. Danau Toba adalah danau vulkanik terbesar di dunia dengan pemandangan yang sangat indah. Pulau Samosir di tengah Danau Toba juga menjadi tempat wisata xiaomi yang sangat populer di sana. Di sana, pengunjung dapat menikmati pemandangan xiaomi yang indah dan kegiatan seperti berenang dan snorkeling.",
            "Taman Nasional Komodo terletak di Provinsi Nusa Tenggara Timur dan menawarkan keindahan xiaomi bawah laut yang sangat memukau. Di sana, pengunjung dapat melihat langsung satwa endemik Indonesia yaitu Komodo, kadal terbesar di dunia. Selain itu, pengunjung juga dapat menikmati keindahan pantai yang sangat indah di Pulau Pink, Pulau Kanawa, dan Pantai Kelor.",
            "Taman Nasional Gunung Leuser terletak di Sumatera Utara dan menjadi salah satu tempat wisata xiaomi yang populer di Indonesia. Taman Nasional ini menawarkan keindahan xiaomi hutan yang sangat lebat dan beragam jenis flora dan fauna. Salah satu daya tarik wisata xiaomi di Taman Nasional Gunung Leuser adalah Orangutan, hewan endemik Indonesia yang sangat langka dan dilindungi. Pengunjung dapat melihat langsung kehidupan Orangutan di habitat aslinya dan melakukan trekking di sekitar hutan.",
            "Taman Nasional Bunaken terletak di Sulawesi Utara dan menawarkan keindahan xiaomi bawah laut yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan terumbu karang yang sangat indah dan beragam jenis ikan yang bermukim di sana. Selain itu, Taman Nasional Bunaken juga menjadi tempat wisata xiaomi yang cocok untuk melakukan kegiatan diving dan snorkeling.",
            "Taman Nasional Lorentz terletak di Papua dan menjadi tempat wisata xiaomi yang sangat terkenal di Indonesia. Taman Nasional ini menawarkan keindahan pegunungan dan gletser yang sangat langka dan indah. Salah satu daya tarik wisata xiaomi di Taman Nasional Lorentz adalah Puncak Jaya, gunung tertinggi di Indonesia. Pengunjung dapat melakukan pendakian ke Puncak Jaya dan menikmati pemandangan xiaomi yang sangat memukau.",
            "Kepulauan Mentawai terletak di lepas pantai Sumatera Barat dan menjadi destinasi wisata xiaomi yang sangat populer di Indonesia. Kepulauan ini menawarkan keindahan xiaomi pantai yang sangat indah dan terkenal dengan ombak surf yang sangat besar. Selain itu, Kepulauan Mentawai juga menjadi tempat wisata xiaomi yang cocok untuk melakukan kegiatan snorkeling, diving, dan berenang bersama ikan hiu.",
            "Taman Nasional Bali Barat terletak di Bali dan menawarkan keindahan xiaomi hutan dan pantai yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan hutan bakau dan mangrove yang sangat lebat dan beragam jenis flora dan fauna. Selain itu, Taman Nasional Bali Barat juga menjadi tempat wisata xiaomi yang cocok untuk melakukan kegiatan diving dan snorkeling di sekitar pantai."
    };

    private static int[] xiaomiImage = {
            R.drawable.xi1,
            R.drawable.xi2,
            R.drawable.xi3,
            R.drawable.xi4,
            R.drawable.xi5,
            R.drawable.xi6,
    };
    private static String [] xiaomiProsesor = {
            "Qualcomm Snapdragon 732G",
            "Qualcomm Snapdragon 662",
            "Qualcomm Snapdragon 888",
            "Qualcomm Snapdragon 860",
            "MediaTek Helio G85",
            "Qualcomm Snapdragon 865",
    };
    private static String [] xiaomiCamera = {
            "Belakang quad camera 64 MP + 8 MP + 5 MP + 2 MP, depan 16 MP",
            "Belakang quad camera 48 MP + 8 MP + 2 MP + 2 MP, depan 8 MP",
            "Belakang triple camera 108 MP + 13 MP + 5 MP, depan 20 MP",
            "Belakang quad camera 48 MP + 8 MP + 2 MP + 2 MP, depan 20 MP",
            "Belakang quad camera 48 MP + 8 MP + 2 MP + 2 MP, depan 13 MP",
            "Belakang triple camera 108 MP + 13 MP + 5 MP, depan 20 MP",
    };
    private static String [] xiaomiRam = {
            "6/8 GB",
            "4/6 GB",
            "8/12 GB",
            "6/8 GB",
            "3/4 GB",
            "8/12 GB",
    };
    private static String [] xiaomiRom = {
            "64/128 GB",
            "64/128 GB",
            "128/256 GB",
            "128/256 GB",
            "64 GB",
            "128/256 GB"
    };

    static ArrayList<Xiaomi> getListData(){
        ArrayList<Xiaomi> list = new ArrayList<>();
        for (int position = 0; position <xiaomiName.length; position++){
            Xiaomi xiaomi = new Xiaomi();
            xiaomi.setName(xiaomiName[position]);
//            xiaomi.setDetail(xiaomiDetail[position]);
            xiaomi.setProsesor(xiaomiProsesor[position]);
            xiaomi.setCamera(xiaomiCamera[position]);
            xiaomi.setRam(xiaomiRam[position]);
            xiaomi.setRom(xiaomiRom[position]);
            xiaomi.setPhoto(xiaomiImage[position]);
            list.add(xiaomi);
        }
        return list;
    }
}
