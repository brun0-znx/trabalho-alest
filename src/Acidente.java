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
	
	public Acidente(String umNomeCompleto, String umLog, String umNomeLog, String umTipoAcidente, LocalDateTime umaData, String umDiaSemana, int umFeridos, int umFatais, int umAuto, int umTaxis, int umaLotacao, int umOnibusUrb, int umOnibusInt, int umCaminhao, int umaMoto, int umaCarroca, int umaBicicleta, String umTempo, String umTurno, String umaRegiao) {
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

	public String getNomeLog() {
		return nomeLog;
	}

	public String getLog() {
		return log;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public String getTempo() {
		return tempo;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public String getTipoAcidente() {
		return tipoAcidente;
	}

	public String getTurno() {
		return turno;
	}

	public String getRegiao() {
		return regiao;
	}

	public int getMoto() {
		return moto;
	}

	public int getOnibusUrb() {
		return onibusUrb;
	}

	public int getBicicleta() {
		return bicicleta;
	}

	public int getCaminhao() {
		return caminhao;
	}

	public int getCarroca() {
		return carroca;
	}

	public int getTaxis() {
		return taxis;
	}

	public int getAuto() {
		return auto;
	}

	public int getOnibusInt() {
		return onibusInt;
	}

	public int getLotacao() {
		return lotacao;
	}

	public int getFatais() {
		return fatais;
	}

	public int getFeridos() {
		return feridos;
	}

	public LocalDateTime getData() {
		return data;
	}
}