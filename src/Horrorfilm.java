public final class Horrorfilm extends Film {
  private boolean voltBenneSzellem;
  private boolean voltBenneSzornyeteg;

  public Horrorfilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, String mufaj, int koltsegvetes, boolean voltBenneSzellem, boolean voltBenneSzornyeteg) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, mufaj, koltsegvetes);
    this.voltBenneSzellem = voltBenneSzellem;
    this.voltBenneSzornyeteg = voltBenneSzornyeteg;
  }

  public Horrorfilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, String mufaj, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, mufaj, koltsegvetes);
  }

  public Horrorfilm(String nyilvantartasiSzam, String cim, int evSzam, int hossz, int koltsegvetes) {
    super(nyilvantartasiSzam, cim, evSzam, hossz, koltsegvetes);
  }

  public boolean isVoltBenneSzellem() {
    return voltBenneSzellem;
  }

  public void setVoltBenneSzellem(boolean voltBenneSzellem) {
    this.voltBenneSzellem = voltBenneSzellem;
  }

  public boolean isVoltBenneSzornyeteg() {
    return voltBenneSzornyeteg;
  }

  public void setVoltBenneSzornyeteg(boolean voltBenneSzornyeteg) {
    this.voltBenneSzornyeteg = voltBenneSzornyeteg;
  }

  @Override
  public int getMufajErtekeles() {
    if (this.voltBenneSzellem) {
      return 2;
    }
    if (this.voltBenneSzornyeteg) {
      return 3;
    }
    return 0;

  }
}

