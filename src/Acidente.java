import java.time.LocalDateTime;

public class Acidente {

	private String diaSemana;
	private String tipoAcidente;
	private String nomeLog;
	private String log;
	private String turno;
	private String tempo;
	private String regiao;
	private int moto;
	private int onibusUrb;
	private int feriados;
	private int bicicleta;
	private int caminhao;
	private int carroca;
	private int taxis;
	private int auto;
	private int onibusInt;
	private int lotacao;
	private int fatais;
	private LocalDateTime data;
	
	public Acidente(String umLog, String umNomeLog, String umTipoAcidente, LocalDateTime umaData, String umDiaSemana, int umFeriados, int umFatais, int umAuto, int umTaxis, int umaLotacao, int umOnibusUrb, int umOnibusInt, int umCaminhao, int umaMoto, int umaCarroca, int umaBicicleta, String umTempo, String umTurno, String umaRegiao) {
		this.log = umLog;
		this.nomeLog = umNomeLog;
		this.tipoAcidente = umTipoAcidente;
		this.data = umaData;
		this.diaSemana = umDiaSemana;
		this.feriados = umFeriados;
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

	public int getAcidenteMoto() {
		return 0;
	}

}
