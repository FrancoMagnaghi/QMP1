public class Prenda {
  string tipo;
  Categoria categoria;
  string material;
  string colorPpal;
  string colorSecu;


  // CONSTRUCTOR PARA UN SOLO COLOR
  public Prenda(string tipo, Categoria categoria, string material, string colorPpal){
    this.tipo = tipo;
    this. categoria = categoria;
    this.material = material;
    this.colorPpal = colorPpal;
  }

  // CONSTRUCTOR PARA 2 COLORES
  public Prenda(string tipo, Categoria categoria, string material, string colorPpal, string colorSecu){
    this.tipo = tipo;
    this. categoria = categoria;
    this.material = material;
    this.colorPpal = colorPpal;
    this.colorSecu = colorSecu;
  }

}


public class Categoria{
  enum {PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIOS}
}

//--------------

public class Atuendo{
  ArrayList<Prenda> prendas = new ArrayList<> prendas;


}