public final class WesternFilm extends Film{
  public WesternFilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, String mufaj, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, mufaj, koltsegvetes);
  }

  public WesternFilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, koltsegvetes);

  }
  private boolean voltakBenneIndianok;

  public boolean isVoltakBenneIndianok() {
    return voltakBenneIndianok;
  }

  public void setVoltakBenneIndianok(boolean voltakBenneIndianok) {
    this.voltakBenneIndianok = voltakBenneIndianok;
  }
  @Override
  public int getMufajErtekeles(){
    return this.voltakBenneIndianok ? 5 : 0;
  }

}
