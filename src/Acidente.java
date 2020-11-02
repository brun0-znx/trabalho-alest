import java.time.LocalDateTime;

public class Acidente {

	private String nomeCompleto;
	private String diaSemana;
	private String tipoAcidente;
	private String nomeLog;
	private String log;
	private String turno;
	private String tempo;
	private String regiao;
	private int moto;
	private int onibusUrb;
	private int feridos;
	private int bicicleta;
	private int caminhao;
	private int carroca;
	private int taxis;
	private int auto;
	private int onibusInt;
	private int lotacao;
	private int fatais;
	private LocalDateTime data;
	private int totalAcidentes;
	
	public Acidente(int umTotalAcidentes,String umNomeCompleto, String umLog, String umNomeLog, String umTipoAcidente, LocalDateTime umaData, String umDiaSemana, int umFeridos, int umFatais, int umAuto, int umTaxis, int umaLotacao, int umOnibusUrb, int umOnibusInt, int umCaminhao, int umaMoto, int umaCarroca, int umaBicicleta, String umTempo, String umTurno, String umaRegiao) {
		setTotalAcidentes(umTotalAcidentes);
		this.nomeCompleto = umNomeCompleto;
		this.log = umLog;
		this.nomeLog = umNomeLog;
		this.tipoAcidente = umTipoAcidente;
		this.data = umaData;
		this.diaSemana = umDiaSemana;
		this.feridos = umFeridos;
		this.fatais = umFatais;
		this.auto = umAuto;
		this.taxis = umTaxis;
		this.lotacao = umaLotacao;
		this.onibusUrb = umOnibusUrb;
		this.onibusInt = umOnibusInt;
		this.caminhao = umCaminhao;
		this.moto = umaMoto;
		this.carroca = umaCarroca;
		this.bicicleta = umaBicicleta;
		this.tempo = umTempo;
		this.turno = umTurno;
		this.regiao = umaRegiao;
	}

	/**
    * Adiciona o total de acidentes da lista de acidentes (rua)
    */
	public void setTotalAcidentes(int umTotalAcidentes) {
		this.totalAcidentes = this.totalAcidentes + umTotalAcidentes;
	}
	
	/**
    * Retorna o número total de acidentes da lista de acidentes (rua)
    * @return o número total de acidentes da lista de acidentes (rua)
    */
	public int getTotalAcidentes() {
		return totalAcidentes;
	}

	/**
    * Retorna o nomeLog
    * @return o nomeLog
    */
	public String getNomeLog() {
		return nomeLog;
	}

	/**
    * Retorna o log
    * @return o log
    */
	public String getLog() {
		return log;
	}

	/**
    * Retorna o nome completo
    * @return o nome completo
    */
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	/**
    * Retorna o tempo
    * @return o tempo
    */
	public String getTempo() {
		return tempo;
	}

	/**
    * Retorna o dia da semana
    * @return o dia da semana
    */
	public String getDiaSemana() {
		return diaSemana;
	}

	/**
    * Retorna o tipo do acidente
    * @return o tipo do acidente
    */
	public String getTipoAcidente() {
		return tipoAcidente;
	}

	/**
    * Retorna o turno
    * @return o turno
    */
	public String getTurno() {
		return turno;
	}

	/**
    * Retorna a região
    * @return a região
    */
	public String getRegiao() {
		return regiao;
	}

	/**
    * Retorna moto
    * @return moto
    */
	public int getMoto() {
		return moto;
	}

	/**
    * Retorna ônibus urbano
    * @return ônibus urbano
    */
	public int getOnibusUrb() {
		return onibusUrb;
	}

	/**
    * Retorna bicicleta
    * @return bicicleta
    */
	public int getBicicleta() {
		return bicicleta;
	}

	/**
    * Retorna caminhão
    * @return caminhão
    */
	public int getCaminhao() {
		return caminhao;
	}

	/**
    * Retorna carroça
    * @return carroça
    */
	public int getCarroca() {
		return carroca;
	}

	/**
    * Retorna táxi
    * @return táxi
    */
	public int getTaxis() {
		return taxis;
	}

	/**
    * Retorna automóvel
    * @return automóvel
    */
	public int getAuto() {
		return auto;
	}

	/**
    * Retorna ônibus interestadual
    * @return ônibus interestadual
    */
	public int getOnibusInt() {
		return onibusInt;
	}

	/**
    * Retorna lotação
    * @return lotação
    */
	public int getLotacao() {
		return lotacao;
	}

	/**
    * Retorna fatais
    * @return fatais
    */
	public int getFatais() {
		return fatais;
	}

	/**
    * Retorna feridos
    * @return feridos
    */
	public int getFeridos() {
		return feridos;
	}

	/**
    * Retorna data
    * @return data
    */
	public LocalDateTime getData() {
		return data;
	}
}