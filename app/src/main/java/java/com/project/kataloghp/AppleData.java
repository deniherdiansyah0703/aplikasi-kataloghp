package com.project.kataloghp;

import java.util.ArrayList;

public class AppleData {
    private static String [] appleName = {
            "iPhone 13 Pro Max",
            "iPhone 13 Mini",
            "iPhone 12 Pro Max",
            "iPhone SE (2020)",
            "iPhone 11 Pro Max",
            "iPhone XR",
            "iPhone XS Max",
            "iPhone 8 Plus",
            "iPhone 7",
            "iPhone 6s Plus",
    };

    private static String [] appleDetail = {
            "Bali adalah destinasi wisata yang sangat populer di Indonesia. Pulau ini dikenal sebagai surga bagi pecinta apple karena keindahan pantai, hutan, dan gunungnya yang sangat memukau. Salah satu tempat wisata apple yang terkenal di Bali adalah Pantai Kuta. Di sana, pengunjung dapat menikmati pemandangan matahari terbenam yang menakjubkan. Selain itu, Gunung Batur di kawasan Kintamani juga menjadi tempat wisata apple yang sangat populer di Bali. Pengunjung dapat menikmati pemandangan sunrise dan melakukan trekking di sekitar kawasan gunung.",
            "Raja Ampat terletak di ujung barat Pulau Papua dan menjadi destinasi wisata apple yang sangat populer di dunia. Raja Ampat menawarkan keindahan bawah laut yang sangat memukau dengan keanekaragaman hayati yang sangat tinggi. Pulau Wayag adalah salah satu tempat wisata apple yang paling terkenal di Raja Ampat. Di sana, pengunjung dapat menikmati keindahan laguna biru dan pantai yang indah. Selain itu, Teluk Kabui dan Pulau Arborek juga menjadi tempat wisata apple yang populer di Raja Ampat. Pengunjung dapat menikmati keindahan laut yang biru dan berbagai kegiatan seperti snorkeling, diving, dan berenang bersama ikan pari.",
            "Taman Nasional Bromo Tengger Semeru terletak di Jawa Timur dan menawarkan keindahan pegunungan dan kawah vulkanik. Gunung Bromo menjadi salah satu daya tarik wisata apple di Taman Nasional ini. Pengunjung dapat menikmati pemandangan matahari terbit di sekitar kawah Gunung Bromo yang sangat indah.",
            "Danau Toba terletak di Sumatera Utara dan menjadi destinasi wisata apple yang sangat populer di Indonesia. Danau Toba adalah danau vulkanik terbesar di dunia dengan pemandangan yang sangat indah. Pulau Samosir di tengah Danau Toba juga menjadi tempat wisata apple yang sangat populer di sana. Di sana, pengunjung dapat menikmati pemandangan apple yang indah dan kegiatan seperti berenang dan snorkeling.",
            "Taman Nasional Komodo terletak di Provinsi Nusa Tenggara Timur dan menawarkan keindahan apple bawah laut yang sangat memukau. Di sana, pengunjung dapat melihat langsung satwa endemik Indonesia yaitu Komodo, kadal terbesar di dunia. Selain itu, pengunjung juga dapat menikmati keindahan pantai yang sangat indah di Pulau Pink, Pulau Kanawa, dan Pantai Kelor.",
            "Taman Nasional Gunung Leuser terletak di Sumatera Utara dan menjadi salah satu tempat wisata apple yang populer di Indonesia. Taman Nasional ini menawarkan keindahan apple hutan yang sangat lebat dan beragam jenis flora dan fauna. Salah satu daya tarik wisata apple di Taman Nasional Gunung Leuser adalah Orangutan, hewan endemik Indonesia yang sangat langka dan dilindungi. Pengunjung dapat melihat langsung kehidupan Orangutan di habitat aslinya dan melakukan trekking di sekitar hutan.",
            "Taman Nasional Bunaken terletak di Sulawesi Utara dan menawarkan keindahan apple bawah laut yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan terumbu karang yang sangat indah dan beragam jenis ikan yang bermukim di sana. Selain itu, Taman Nasional Bunaken juga menjadi tempat wisata apple yang cocok untuk melakukan kegiatan diving dan snorkeling.",
            "Taman Nasional Lorentz terletak di Papua dan menjadi tempat wisata apple yang sangat terkenal di Indonesia. Taman Nasional ini menawarkan keindahan pegunungan dan gletser yang sangat langka dan indah. Salah satu daya tarik wisata apple di Taman Nasional Lorentz adalah Puncak Jaya, gunung tertinggi di Indonesia. Pengunjung dapat melakukan pendakian ke Puncak Jaya dan menikmati pemandangan apple yang sangat memukau.",
            "Kepulauan Mentawai terletak di lepas pantai Sumatera Barat dan menjadi destinasi wisata apple yang sangat populer di Indonesia. Kepulauan ini menawarkan keindahan apple pantai yang sangat indah dan terkenal dengan ombak surf yang sangat besar. Selain itu, Kepulauan Mentawai juga menjadi tempat wisata apple yang cocok untuk melakukan kegiatan snorkeling, diving, dan berenang bersama ikan hiu.",
            "Taman Nasional Bali Barat terletak di Bali dan menawarkan keindahan apple hutan dan pantai yang sangat memukau. Di sana, pengunjung dapat menikmati keindahan hutan bakau dan mangrove yang sangat lebat dan beragam jenis flora dan fauna. Selain itu, Taman Nasional Bali Barat juga menjadi tempat wisata apple yang cocok untuk melakukan kegiatan diving dan snorkeling di sekitar pantai."
    };

    private static int[] appleImage = {
            R.drawable.ap1,
            R.drawable.ap2,
            R.drawable.ap3,
            R.drawable.ap4,
            R.drawable.ap5,
            R.drawable.ap6,
            R.drawable.ap7,
            R.drawable.ip8,
            R.drawable.ip9,
            R.drawable.ip10,
    };
    private static String [] appleProsesor = {
            "A15 Bionic",
            "A15 Bionic",
            "A14 Bionic",
            "A13 Bionic",
            "A13 Bionic",
            "A12 Bionic",
            "A12 Bionic",
            "A11 Bionic",
            "A10 Fusion",
            "A9",
    };
    private static String [] appleCamera = {
            "12MP/12MP",
            "12MP/12MP",
            "12MP/12MP",
            "12MP/7MP",
            "12MP/12MP",
            "12MP/7MP",
            "12MP/7MP",
            "12MP/7MP",
            "12MP/7MP",
            "12MP/5MP"
    };
    private static String [] appleRam = {
            "6 GB",
            "4 GB",
            "6 GB",
            "3 GB",
            "4 GB",
            "3 GB",
            "4 GB",
            "3 GB",
            "2 GB",
            "2 GB",
    };
    private static String [] appleRom = {
            "128 GB, 256 GB, 512 GB,/1 TB",
            "64 GB, 128 GB,/256 GB",
            "128 GB, 256 GB,/1 TB",
            "64 GB, 128 GB,/256 GB",
            "64 GB, 256 GB,/512 GB",
            "64 GB, 128 GB,/256 GB",
            "64 GB, 256 GB,/512 GB",
            "64 GB/128 GB",
            "32 GB/128 GB",
            "16 GB, 32 GB, 64 GB,/128 GB",
    };

    static ArrayList<Apple> getListData(){
        ArrayList<Apple> list = new ArrayList<>();
        for (int position = 0; position <appleName.length; position++){
            Apple apple = new Apple();
            apple.setName(appleName[position]);
//            apple.setDetail(appleDetail[position]);
            apple.setProsesor(appleProsesor[position]);
            apple.setCamera(appleCamera[position]);
            apple.setRam(appleRam[position]);
            apple.setRom(appleRom[position]);
            apple.setPhoto(appleImage[position]);
            list.add(apple);
        }
        return list;
    }
}
