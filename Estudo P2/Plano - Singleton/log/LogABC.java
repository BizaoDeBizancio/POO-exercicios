package log;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogABC implements AutoCloseable{

	private int sequencia = 0; // Nao altere para static
    private static LogABC log = null;
	private BufferedWriter br;

	private LogABC() throws IOException {
		br = new BufferedWriter(new FileWriter("log.txt"));
	}
    
    public static LogABC getLog() throws IOException {
        if(log == null) {
            log = new LogABC();
        }
        
        return log;
    }
	
	public void registrarAcao(String acao) {
		try {
			br.write("[" + ++sequencia + "] " + acao);
			br.newLine();
		} catch (Exception e) {
			System.out.println("Erro ao registrar acao: " + e);
		}
	}
	
	public void fecharLog() throws IOException {
		br.close();
	}
    
    public void close() throws IOException{
        fecharLog();
    }
	
}