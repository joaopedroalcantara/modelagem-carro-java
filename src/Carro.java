public class Carro {
    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void defineModelo(String modelo){
        this.modelo = modelo;
    }

    public void mostraPreco(double preco1, double preco2, double preco3){
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void fichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco do ano 1: " + preco1);
        System.out.println("Preco do ano 2: " + preco2);
        System.out.println("Preco do ano 3: " + preco3);
        System.out.println("Maior preço: " + devolceMaiorPreco());
        System.out.println("Menor preço: " + devolveMenorPreco());
    }

    public double devolveMenorPreco(){
        double menorPreco;
        menorPreco = preco1;

        if (menorPreco >= preco2){
            menorPreco = preco2;
        }

        if (menorPreco >= preco3){
            menorPreco = preco3;
        }

        return menorPreco;

    }

    public double devolceMaiorPreco() {
        double maiorPreco = preco1;
        if (maiorPreco <= preco2) {
            maiorPreco = preco2;
        }

        if (maiorPreco <= preco3) {
            maiorPreco = preco3;
        }

        return maiorPreco;
    }


}




