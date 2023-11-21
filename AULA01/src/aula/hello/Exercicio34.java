package aula.hello;

public class Exercicio34 {
public static void main(String[] args) {
		
        double percentualIcms = 17.5 / 100;

        double percentualIpi = 7.0 / 100;

        double percentualPis = 3.75 / 100;

        double percentualCofins = 4.0 / 100;

        double valorBaseNotaFiscal = 1372.22;

        double valorIcms = valorBaseNotaFiscal * percentualIcms;
        System.out.println("Valor do imposto de ICMS: " + valorIcms);

        double valorIpi = valorBaseNotaFiscal  * percentualIpi;
        System.out.println("Valor do imposto de IPI: " + valorIpi);

        double valorPis = valorBaseNotaFiscal  * percentualPis;
        System.out.println("Valor do imposto de PIS: " + valorPis);

        double valorCofins = valorBaseNotaFiscal  * percentualCofins;
        System.out.println("Valor do imposto de COFINS: " + valorCofins);

        double valorTotalDaNotaFiscal = valorBaseNotaFiscal + valorIcms;

        System.out.println("Valor total da Nota Fiscal: " + valorTotalDaNotaFiscal);
}

}
