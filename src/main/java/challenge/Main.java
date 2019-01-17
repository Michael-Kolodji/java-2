package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public List<State> listThe10largestStatesInBrazil() {
		List<State> lisState = lisState();
		
		lisState.sort(Comparator.comparing(State::getExtensao).reversed());
		
		return lisState.subList(0, 10);
	}
	
	public List<State> lisState() {
		
		String csvFile = "src/main/resources/data.csv";
		String line = "";
		String cvsSplitBy = ",";
		List<State> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				String[] register = line.split(cvsSplitBy);

				State jogador = new State(register[0], register[1]);
				jogador.setExtensao(Double.valueOf(register[2]));
				list.add(jogador);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}


}
