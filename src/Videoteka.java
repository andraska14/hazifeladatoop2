public class Videoteka {
  private Film[] filmek;

  public Film[] getFilmek() {
    return filmek;
  }

  public void setFilmek(Film[] filmek) {
    this.filmek = filmek;
  }

  public Videoteka(int meret) {
    this.filmek = new Film[meret];
  }

  public void addFilm(Film film) {
    if (this.filmek[this.filmek.length - 1] != null) {
      throw new RuntimeException();
    }
    for (int i = 0; i < this.filmek.length; i++) {
      if (this.filmek[i] == null) {
        this.filmek[i] = film;
        break;
      }
    }

  }

  public void listaz() {
    for (int i = 0; i < filmek.length; i++) {
      if (filmek[i] != null) {
        System.out.println(filmek[i].toString());

      }
    }
  }
  public void filmekMufajSzerint(String mufaj){
    for(int i=0; i<this.filmek.length;i++){
      Film film= this.filmek[i];
      if(film!=null && film.getMufaj()==mufaj){
        System.out.println(film.getCim());
      }
    }
  }



}
