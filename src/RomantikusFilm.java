public final class RomantikusFilm extends Film{
  private int hazassagokSzama;

  public RomantikusFilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, String mufaj, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, mufaj, koltsegvetes);
  }

  public RomantikusFilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, koltsegvetes);
  }

  public int getHazassagokSzama() {
    return hazassagokSzama;
  }

  public void setHazassagokSzama(int hazassagokSzama) {
    this.hazassagokSzama = hazassagokSzama;
  }
  @Override
  public int getMufajErtekeles(){
    return this.hazassagokSzama>5? 5 : this.hazassagokSzama;
  }
}
