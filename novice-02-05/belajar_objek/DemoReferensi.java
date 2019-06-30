package belajar_objek;

class Bank{
    double teller;
    double hrd;
    double clerk;
}

class DemoReferensi{
    public static void main(String[] args){
        double number_person1, number_person2;
        Bank swasta, pimpinan; //mendeklarasikan variabel referensi ke objek Bank dengan dengan nama swasta dan pimpinan.

        swasta = new Bank(); //melakukan instasiasi dan memasukkan referensi ke variabel swasta.
        pimpinan = swasta; //memasukkan swasta ke dalam pimpinan. Artinya variabel pimpinan berperan senagai refernsi.
        //ke objek yang sedang ditunjuk oleh swasta. Dengan demikian, variabel swasta dan pimpinan masing" menunjuk ke objek Bank yang sama.


        swasta.teller = 1;
        swasta.hrd = 2;
        swasta.clerk = 2;

        number_person1 = swasta.teller + swasta.hrd + swasta.clerk;
        number_person2 = pimpinan.teller + pimpinan.hrd + pimpinan.clerk;

        System.out.println("person1 :"+number_person1);
        System.out.println("person2 :"+number_person2);
    }
}