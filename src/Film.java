public  class Film {
  private final String nyilvantartasiSzam;
  private String cim;
  private int evSzam;
  private int hossz;
  private String mufaj;
  private int koltsegvetes;

  public Film(String nyilvantartasiSzam, String cim, int evSzam, int hossz, String mufaj, int koltsegvetes) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
    this.cim = cim;
    this.evSzam = evSzam;
    this.hossz = hossz;
    this.setMufaj(mufaj);
    this.koltsegvetes = koltsegvetes;
  }

  public Film(String nyilvantartasiSzam, String cim, int evSzam, int hossz, int koltsegvetes) {
    this.nyilvantartasiSzam = nyilvantartasiSzam;
    this.cim = cim;
    this.evSzam = evSzam;
    this.hossz = hossz;
    this.koltsegvetes = koltsegvetes;
    this.mufaj = "idk";
  }

  public String getMufaj() {
    return mufaj;
  }

  public final void setMufaj(String mufaj) {
    if (mufaj != null && !mufaj.equals("")) {
      this.mufaj = mufaj;
    } else {
      this.mufaj = "idk";
    }
  }

  public final String getNyilvantartasiSzam() {
    return nyilvantartasiSzam;
  }

  public final String getCim() {
    return cim;
  }

  public final void setCim(String cim) {
    this.cim = cim;
  }

  public final int getEvSzam() {
    return evSzam;
  }

  public final void setEvSzam(int evSzam) {
    this.evSzam = evSzam;
  }

  public final int getHossz() {
    return hossz;
  }

  public final void setHossz(int hossz) {
    this.hossz = hossz;
  }

  public final int getKoltsegvetes() {
    return koltsegvetes;
  }

  public final void setKoltsegvetes(int koltsegvetes) {
    this.koltsegvetes = koltsegvetes;
  }
  public final int getFilmkockak(){
    return this.hossz*24;
  }
  public final int getKategoria(){
    if (this.koltsegvetes<1000){return 0;}
    if (this.koltsegvetes<10000){return 1;}
    if (this.koltsegvetes<100000){return 2;}
    if (this.koltsegvetes<1000000){return 3;}
    if (this.koltsegvetes<10000000){return 4;}
    return 5;
  }
  public int getMufajErtekeles(){
    return 0;
  }
  public final int getErtekeles(){
    return this.getKategoria()+this.getMufajErtekeles();
  }

  @Override
  public String toString() {
    return "Film{" +
        "nyilvantartasiSzam='" + nyilvantartasiSzam + '\'' +
        ", cim='" + cim + '\'' +
        ", evSzam=" + evSzam +
        ", hossz=" + hossz +
        ", mufaj='" + mufaj + '\'' +
        ", koltsegvetes=" + koltsegvetes +
        '}';
  }
}

//a film évszáma
// a film műfaja (ami egy műfajra korlátozódik, ami a megrendelő szerint domináns)
// a film hossza (másodpercben)
// a film költségvetése (egész dollárban)
// Készítsd el ezeknek az információknak a lekérdező és beállító függvényeit, majd készíts az oszályhoz kostruktorokat
//is. Legyen egy olyan ami minden értéket megkap és legyen egy olyan is, ami nem kap műfajt (mert a megrendelő
//annyira összezavarodott, hogy nem tudta megfogalmazni). Ebben az esetben legyen a műfaj értéke “idk”.