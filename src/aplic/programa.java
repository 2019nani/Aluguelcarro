package aplic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Aluguelcarro;
import entidades.Veiculo;
import services.Brasiltaxaservicos;
import services.Servicoaluguel;

public class programa {

	public static void main(String[] args)throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		System.out.println("Entre com os dados do aluguel");
		System.out.println("modelo do carro");
		String modelocarro = sc.nextLine();
		System.out.println("Data chegada (dd/MM/yyyy hh:ss) : ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.println("Data retirada (dd/MM/yyyy hh:ss): ");
		Date saida = sdf.parse(sc.nextLine());
		Aluguelcarro cr = new Aluguelcarro(inicio, saida, new Veiculo(modelocarro));
		System.out.println("Entre com o preco por hora ");
		double precoporhora = sc.nextDouble();
		System.out.println("Entre com o preco por dia");
		double precopordia = sc.nextDouble();
		Servicoaluguel fr = new Servicoaluguel(precopordia, precoporhora, new Brasiltaxaservicos());
		fr.processoPagamento(cr);
		System.out.println("Pagamento ");
		System.out.println("Pagamento basico: " + String.format("%.2f",cr.getPagamento().getBasicopagamento()));
		System.out.println("Taxa: " + String.format("%.2f",cr.getPagamento().getTaxa()));
		System.out.println("Pagamento total: " + String.format("%.2f",cr.getPagamento().getTotalPagamento()));
		
		sc.close();
		
	}

}
