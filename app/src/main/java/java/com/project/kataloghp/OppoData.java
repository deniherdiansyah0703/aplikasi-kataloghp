package com.project.kataloghp;

import java.util.ArrayList;

public class OppoData {
    private static String [] oppoName = {
            "Reno6 Z",
            "A94",
            "A54",
            "F19",
            "A12",
            "A15s",
    };

    private static String [] oppoDetail = {
            "Bali adalah destinasi wisata yang sangat populer di Indonesia. Pulau ini dikenal sebagai surga bagi pecinta oppo karena keindahan pantai, hutan, dan gunungnya yang sangat memukau. Salah satu tempat wisata oppo yang terkenal di Bali adalah Pantai Kuta. Di sana, pengunjung dapat menikmati pemandangan matahari terbenam yang menakjubkan. Selain itu, Gunung Batur di kawasan Kintamani juga menjadi tempat wisata oppo yang sangat populer di Bali. Pengunjung dapat menikmati pemandangan sunrise dan melakukan trekking di sekitar kawasan gunung.",
            "Raja Ampat terletak di ujung barat Pulau Papua dan menjadi destinasi wisata oppo yang sangat populer di dunia. Raja Ampat menawarkan keindahan bawah laut yang sangat memukau dengan keanekaragaman hayati yang sangat tinggi. Pulau Wayag adalah salah satu tempat wisata oppo yang paling terkenal di Raja Ampat. Di sana, pengunjung dapat menikmati keindahan laguna biru dan pantai yang indah. Selain itu, Teluk Kabui dan Pulau Arborek juga menjadi tempat wisata oppo yang populer di Raja Ampat. Pengunjung dapat menikmati keindahan laut yang biru dan berbagai kegiatan seperti snorkeling, diving, dan berenang bersama ikan pari.",
            "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur dan menawarkan keindahan pegunungan dan kawah vulkanik. Gunung Bromo menjadi salah satu daya tarik wisata oppo di Taman Nasional ini. Pengunjung dapat menikmati pemandangan matahari terbit di sekitar kawah Gunung Bromo yang sangat indah.",
            "Danau Toba terletak di Sumatera Utara dan menjadi destinasi wisata oppo yang sangat populer di Indonesia. Danau Toba adalah danau vulkanik terbesar di dunia dengan pemandangan yang sangat indah. Pulau Samosir di tengah Danau Toba juga menjadi tempat wisata oppo yang sangat populer di sana. Di sana, pengunjung dapat menikmati pemandangan oppo yang indah dan kegiatan seperti berenang dan snorkeling.",
            "Taman Nasional Komodo terletak di Provinsi Nusa Tenggara Timur dan menawarkan keindahan oppo bawah laut yang sangat memukau. Di sana, pengunjung dapat melihat langsung satwa endemik Indonesia yaitu Komodo, kadal terbesar di dunia. Selain itu, pengunjung juga dapat menikmati keindahan pantai yang sangat indah di Pulau Pink, Pulau Kanawa, dan Pantai Kelor.",
            "Taman Nasional Gunung Leuser terletak di Sumatera Utara dan menjadi salah satu tempat wisata oppo yang populer di Indonesia. Taman Nasional ini menawarkan keindahan oppo hutan yang sangat lebat dan beragam jenis flora dan fauna. Salah satu daya tarik wisata oppo di Taman Nasional Gunung Leuser adalah Orangutan, hewan endemik Indonesia yang sangat langka dan dilindungi. Pengunjung dapat melihat langsung kehidupan Orangutan di habitat aslinya dan melakukan trekking di sekitar hutan.",
            "Taman Nasional Bunaken terletak di Sulawesi Utara dan menawarkan keindahan oppo bawah laut yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan terumbu karang yang sangat indah dan beragam jenis ikan yang bermukim di sana. Selain itu, Taman Nasional Bunaken juga menjadi tempat wisata oppo yang cocok untuk melakukan kegiatan diving dan snorkeling.",
            "Taman Nasional Lorentz terletak di Papua dan menjadi tempat wisata oppo yang sangat terkenal di Indonesia. Taman Nasional ini menawarkan keindahan pegunungan dan gletser yang sangat langka dan indah. Salah satu daya tarik wisata oppo di Taman Nasional Lorentz adalah Puncak Jaya, gunung tertinggi di Indonesia. Pengunjung dapat melakukan pendakian ke Puncak Jaya dan menikmati pemandangan oppo yang sangat memukau.",
            "Kepulauan Mentawai terletak di lepas pantai Sumatera Barat dan menjadi destinasi wisata oppo yang sangat populer di Indonesia. Kepulauan ini menawarkan keindahan oppo pantai yang sangat indah dan terkenal dengan ombak surf yang sangat besar. Selain itu, Kepulauan Mentawai juga menjadi tempat wisata oppo yang cocok untuk melakukan kegiatan snorkeling, diving, dan berenang bersama ikan hiu.",
            "Taman Nasional Bali Barat terletak di Bali dan menawarkan keindahan oppo hutan dan pantai yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan hutan bakau dan mangrove yang sangat lebat dan beragam jenis flora dan fauna. Selain itu, Taman Nasional Bali Barat juga menjadi tempat wisata oppo yang cocok untuk melakukan kegiatan diving dan snorkeling di sekitar pantai."
    };

    private static int[] oppoImage = {
            R.drawable.op1,
            R.drawable.op2,
            R.drawable.op3,
            R.drawable.op4,
            R.drawable.op5,
            R.drawable.op6,

    };
    private static String [] oppoProsesor = {
            "MediaTek Dimensity 800U 5G",
            "MediaTek Helio P95",
            "MediaTek Helio P35",
            "Qualcomm Snapdragon 662",
            "MediaTek Helio P35",
            "MediaTek Helio P35",
    };
    private static String [] oppoCamera = {
            "Belakang quad camera 64 MP + 8 MP + 2 MP + 2 MP, depan 32 MP",
            "Belakang quad camera 48 MP + 8 MP + 2 MP + 2 MP, depan 32 MP",
            "Belakang triple camera 13 MP + 2 MP + 2 MP, depan 16 MP",
            "Belakang triple camera 48 MP + 2 MP + 2 MP, depan 16 MP",
            "Belakang dual camera 13 MP + 2 MP, depan 5 MP",
            "Belakang triple camera 13 MP + 2 MP + 2 MP, depan 8 MP",
    };
    private static String [] oppoRam = {
            "8 GB",
            "8 GB",
            "4/6/8 GB",
            "6 GB",
            "3/4 GB",
            "4 GB",
    };
    private static String [] oppoRom = {
            "128 GB",
            "128 GB",
            "64/128 GB",
            "128 GB",
            "32/64 GB",
            "64 GB",
    };

    static ArrayList<Oppo> getListData(){
        ArrayList<Oppo> list = new ArrayList<>();
        for (int position = 0; position <oppoName.length; position++){
            Oppo oppo = new Oppo();
            oppo.setName(oppoName[position]);
//            oppo.setDetail(oppoDetail[position]);
            oppo.setProsesor(oppoProsesor[position]);
            oppo.setCamera(oppoCamera[position]);
            oppo.setRam(oppoRam[position]);
            oppo.setRom(oppoRom[position]);
            oppo.setPhoto(oppoImage[position]);
            list.add(oppo);
        }
        return list;
    }
}
