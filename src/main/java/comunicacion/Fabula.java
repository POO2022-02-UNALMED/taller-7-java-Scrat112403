package comunicacion;

public class Fabula extends Escrito{
	
	private String enseñanza;
    private String interpretacion;

	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza= enseñanza;
		this.interpretacion = interpretacion;
	}
	

    public String getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza) {
        this.enseñanza= enseñanza;
    }

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	@Override
    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas()*1*palabrasPagina;
    }
    

    @Override
    public String interpretacion() {
        return getInterpretacion();
    }
    
    @Override
    public String toString() {
        return "super.getOrigen()+"\n"+
        super.getTitulo()+"\n"+
        super.getAutor()+"\n"+
        super.getPaginas()+"\n"+
        getEnseñanza();
    }
}
