package lanchonete;
public class Main {
    public static void main(String[] args){

        Item item1 = new Item("Passaporte de can=rne de boi", 12.99, 1);
        Item item2 = new Item("Passaporte de frango", 11.99, 2);
        Item item3 = new Item("coca-cola", 5.99, 4);
        Item item4 = new Item("Guaraná", 4.99, 4);

        Carrinho c = new Carrinho();

        c.adicionarItem(item2);
        c.adicionarItem(item1);
        c.adicionarItem(item3);
        c.adicionarItem(item4);

        c.removerItem(4);
        c.adicionarItem(item3);

        c.calcularPreco();
        
    }
}