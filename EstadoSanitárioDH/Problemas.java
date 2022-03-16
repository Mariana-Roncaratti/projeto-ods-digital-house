package EstadoSanitárioDH;

public class Problemas {

	// Atributos
	int numMoradores;
	int esgoto;
	int destinoLixo;
	String media;
	Character problemaAgua;
	Character cheiro;
	Character alaga;
	Character lixo;
	Character coletaRegular;
	Character satisfacaoColeta;
	Character varricao;
	Character satisfacaoVarricao;
	Character doencaFamilia;

	private int pontuacao = 0;

	// Getters and Setters
	public int getPontuacao() {
		return pontuacao;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public int getEsgoto() {
		return esgoto;
	}

	public void setEsgoto(int esgoto) {
		this.esgoto = esgoto;
	}

	public int getNumMoradores() {
		return numMoradores;
	}

	public void setNumMoradores(int numMoradores) {
		this.numMoradores = numMoradores;
	}

	public int getDestinoLixo() {
		return destinoLixo;
	}

	public void setDestinoLixo(int destinoLixo) {
		this.destinoLixo = destinoLixo;
	}

	public Character getProblemaAgua() {
		return problemaAgua;
	}

	public void setProblemaAgua(Character problemaAgua) {
		this.problemaAgua = problemaAgua;
	}

	public Character getCheiro() {
		return cheiro;
	}

	public void setCheiro(Character cheiro) {
		this.cheiro = cheiro;
	}

	public Character getAlaga() {
		return alaga;
	}

	public void setAlaga(Character alaga) {
		this.alaga = alaga;
	}

	public Character getLixo() {
		return lixo;
	}

	public void setLixo(Character lixo) {
		this.lixo = lixo;
	}

	public Character getColetaRegular() {
		return coletaRegular;
	}

	public void setColetaRegular(Character coletaRegular) {
		this.coletaRegular = coletaRegular;
	}

	public Character getSatisfacaoColeta() {
		return satisfacaoColeta;
	}

	public void setSatisfacaoColeta(Character satisfacaoColeta) {
		this.satisfacaoColeta = satisfacaoColeta;
	}

	public Character getVarricao() {
		return varricao;
	}

	public void setVarricao(Character varricao) {
		this.varricao = varricao;
	}

	public Character getSatisfacaoVarricao() {
		return satisfacaoVarricao;
	}

	public void setSatisfacaoVarricao(Character satisfacaoVarricao) {
		this.satisfacaoVarricao = satisfacaoVarricao;
	}

	public Character getDoencaFamilia() {
		return doencaFamilia;
	}

	public void setDoencaFamilia(Character doencaFamilia) {
		this.doencaFamilia = doencaFamilia;
	}

	// Método Pergunta 1
	public void calculaPontuacaoMoradores(int numMoradores) {

		if (numMoradores >= 0 && numMoradores <= 3) {
			this.pontuacao = this.pontuacao + 1;
		} else if (numMoradores >= 4 && numMoradores <= 8) {
			this.pontuacao = this.pontuacao + 2;
		} else {
			this.pontuacao = this.pontuacao + 3;
		}
	}

	// Método Perguntas 2, 4, 5, 6, 8, 9, 10, 11, 12
	public void somaPontuacao(Character resposta) {

		this.pontuacao = this.pontuacao + 1;
	}

	// Método Perguntas 3 e 7
	public void pontuacaoSoma(int resultado) {

		this.pontuacao = this.pontuacao + 1;
	}

}
