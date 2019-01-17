package challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import challenge.models.Jogador;

public class Main {

	public List<State> listThe10largestStatesInBrazil() {
		return new ArrayList<>();
	}
	
	public List<State> lisState() {
		
		String csvFile = "src/main/resources/data.csv";
		String line = "";
		String cvsSplitBy = ",";
		List<State> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				String[] register = line.split(cvsSplitBy);
				if (!register[0].contains("ID")) {

					

					State jogador = new State();
					list.add(jogador);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}


}
