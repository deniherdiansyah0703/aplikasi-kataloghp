package com.project.kataloghp;

import java.util.ArrayList;

public class VivoData {
    private static String [] vivoName = {
            "Y53s",
            "Y20s",
            "Y12s",
            "Y12i",
            "V21 5G",
            "Y30",
    };

    private static String [] vivoDetail = {
            "Bali adalah destinasi wisata yang sangat populer di Indonesia. Pulau ini dikenal sebagai surga bagi pecinta vivo karena keindahan pantai, hutan, dan gunungnya yang sangat memukau. Salah satu tempat wisata vivo yang terkenal di Bali adalah Pantai Kuta. Di sana, pengunjung dapat menikmati pemandangan matahari terbenam yang menakjubkan. Selain itu, Gunung Batur di kawasan Kintamani juga menjadi tempat wisata vivo yang sangat populer di Bali. Pengunjung dapat menikmati pemandangan sunrise dan melakukan trekking di sekitar kawasan gunung.",
            "Raja Ampat terletak di ujung barat Pulau Papua dan menjadi destinasi wisata vivo yang sangat populer di dunia. Raja Ampat menawarkan keindahan bawah laut yang sangat memukau dengan keanekaragaman hayati yang sangat tinggi. Pulau Wayag adalah salah satu tempat wisata vivo yang paling terkenal di Raja Ampat. Di sana, pengunjung dapat menikmati keindahan laguna biru dan pantai yang indah. Selain itu, Teluk Kabui dan Pulau Arborek juga menjadi tempat wisata vivo yang populer di Raja Ampat. Pengunjung dapat menikmati keindahan laut yang biru dan berbagai kegiatan seperti snorkeling, diving, dan berenang bersama ikan pari.",
            "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur dan menawarkan keindahan pegunungan dan kawah vulkanik. Gunung Bromo menjadi salah satu daya tarik wisata vivo di Taman Nasional ini. Pengunjung dapat menikmati pemandangan matahari terbit di sekitar kawah Gunung Bromo yang sangat indah.",
            "Danau Toba terletak di Sumatera Utara dan menjadi destinasi wisata vivo yang sangat populer di Indonesia. Danau Toba adalah danau vulkanik terbesar di dunia dengan pemandangan yang sangat indah. Pulau Samosir di tengah Danau Toba juga menjadi tempat wisata vivo yang sangat populer di sana. Di sana, pengunjung dapat menikmati pemandangan vivo yang indah dan kegiatan seperti berenang dan snorkeling.",
            "Taman Nasional Komodo terletak di Provinsi Nusa Tenggara Timur dan menawarkan keindahan vivo bawah laut yang sangat memukau. Di sana, pengunjung dapat melihat langsung satwa endemik Indonesia yaitu Komodo, kadal terbesar di dunia. Selain itu, pengunjung juga dapat menikmati keindahan pantai yang sangat indah di Pulau Pink, Pulau Kanawa, dan Pantai Kelor.",
            "Taman Nasional Gunung Leuser terletak di Sumatera Utara dan menjadi salah satu tempat wisata vivo yang populer di Indonesia. Taman Nasional ini menawarkan keindahan vivo hutan yang sangat lebat dan beragam jenis flora dan fauna. Salah satu daya tarik wisata vivo di Taman Nasional Gunung Leuser adalah Orangutan, hewan endemik Indonesia yang sangat langka dan dilindungi. Pengunjung dapat melihat langsung kehidupan Orangutan di habitat aslinya dan melakukan trekking di sekitar hutan.",
            "Taman Nasional Bunaken terletak di Sulawesi Utara dan menawarkan keindahan vivo bawah laut yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan terumbu karang yang sangat indah dan beragam jenis ikan yang bermukim di sana. Selain itu, Taman Nasional Bunaken juga menjadi tempat wisata vivo yang cocok untuk melakukan kegiatan diving dan snorkeling.",
            "Taman Nasional Lorentz terletak di Papua dan menjadi tempat wisata vivo yang sangat terkenal di Indonesia. Taman Nasional ini menawarkan keindahan pegunungan dan gletser yang sangat langka dan indah. Salah satu daya tarik wisata vivo di Taman Nasional Lorentz adalah Puncak Jaya, gunung tertinggi di Indonesia. Pengunjung dapat melakukan pendakian ke Puncak Jaya dan menikmati pemandangan vivo yang sangat memukau.",
            "Kepulauan Mentawai terletak di lepas pantai Sumatera Barat dan menjadi destinasi wisata vivo yang sangat populer di Indonesia. Kepulauan ini menawarkan keindahan vivo pantai yang sangat indah dan terkenal dengan ombak surf yang sangat besar. Selain itu, Kepulauan Mentawai juga menjadi tempat wisata vivo yang cocok untuk melakukan kegiatan snorkeling, diving, dan berenang bersama ikan hiu.",
            "Taman Nasional Bali Barat terletak di Bali dan menawarkan keindahan vivo hutan dan pantai yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan hutan bakau dan mangrove yang sangat lebat dan beragam jenis flora dan fauna. Selain itu, Taman Nasional Bali Barat juga menjadi tempat wisata vivo yang cocok untuk melakukan kegiatan diving dan snorkeling di sekitar pantai."
    };

    private static int[] vivoImage = {
            R.drawable.vi1,
            R.drawable.vi2,
            R.drawable.vi3,
            R.drawable.vi4,
            R.drawable.vi5,
            R.drawable.vi6,
    };
    private static String [] vivoProsesor = {
            "Qualcomm Snapdragon 480 5G",
            "Qualcomm Snapdragon 460",
            "MediaTek Helio P35",
            "MediaTek Helio G35",
            "MediaTek Dimensity 800U 5G",
            "MediaTek Helio G95",
    };
    private static String [] vivoCamera = {
            "Belakang triple camera 50 MP + 2 MP + 2 MP, depan 16 MP",
            "Belakang triple camera 13 MP + 2 MP + 2 MP, depan 8 MP",
            "Belakang dual camera 13 MP + 2 MP, depan 5 MP",
            "Belakang dual camera 13 MP + 2 MP, depan 8 MP",
            "Belakang triple camera 64 MP + 8 MP + 2 MP, depan 44 MP",
            "Belakang quad camera 48 MP + 8 MP + 2 MP + 2 MP, depan 16 MP",
    };
    private static String [] vivoRam = {
            "8 GB",
            "4/6 GB",
            "3/4 GB",
            "2/3 GB",
            "8 GB",
            "4/6 GB",
    };
    private static String [] vivoRom = {
            "128 GB",
            "128 GB",
            "32/64 GB",
            "32 GB",
            "128 GB",
            "128 GB"
    };

    static ArrayList<Vivo> getListData(){
        ArrayList<Vivo> list = new ArrayList<>();
        for (int position = 0; position <vivoName.length; position++){
            Vivo vivo = new Vivo();
            vivo.setName(vivoName[position]);
//            vivo.setDetail(vivoDetail[position]);
            vivo.setProsesor(vivoProsesor[position]);
            vivo.setCamera(vivoCamera[position]);
            vivo.setRam(vivoRam[position]);
            vivo.setRom(vivoRom[position]);
            vivo.setPhoto(vivoImage[position]);
            list.add(vivo);
        }
        return list;
    }
}
