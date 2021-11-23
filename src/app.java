public class app {
  public static void main(String[] args) {
    Videoteka tesztvideoteka= tesztAdatok();
    tesztvideoteka.listaz();
    tesztvideoteka.filmekMufajSzerint("krimi");


  }
  public static Videoteka tesztAdatok(){
    Videoteka videoteka = new Videoteka(10);
    Horrorfilm Furesz = new Horrorfilm("12","Fűresz",1991,6800,12);
    WesternFilm VoltEgyszerEgyVadnyugat  = new WesternFilm("13","Volt egyszer egy vadnyugat",1958,7400,21);
    RomantikusFilm Titanic  = new RomantikusFilm("192","Titanic",1999, 7600,150);
    Horrorfilm Halloween = new Horrorfilm("176","Halloween",1979,6600,22);
    RomantikusFilm IgazabolSzerelem = new RomantikusFilm("133","Igazabol szerelem",1991,6800,12);
    Horrorfilm Madarak = new Horrorfilm("12","Madarak",1961,5700,300);
    Madarak.setMufaj("krimi");
    WesternFilm EgyMareknyiDollar = new WesternFilm("322","Egy maréknyi dollár",1967,5700,350);
    RomantikusFilm AnyamNyakan = new RomantikusFilm("232","Anyám nyakán",2008,6100,72);
    Horrorfilm Pentek13 = new Horrorfilm("321","Péntek 13",2014,6340,91);
    WesternFilm AljasNyolcas  = new WesternFilm("72","Aljas Nyolcas",2017,7300,250);
    videoteka.addFilm(Furesz);
    videoteka.addFilm(Titanic);
    videoteka.addFilm(Halloween);
    videoteka.addFilm(Madarak);
    videoteka.addFilm(EgyMareknyiDollar);
    videoteka.addFilm(AljasNyolcas);
    videoteka.addFilm(AnyamNyakan);
    videoteka.addFilm(IgazabolSzerelem);
    videoteka.addFilm(Pentek13);
    videoteka.addFilm(VoltEgyszerEgyVadnyugat);
    return videoteka;

  }

}
