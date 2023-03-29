import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class GeradorDeFigurinhas {

    public void cria() throws Exception {
        // leitura da imagem
        BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.png"));

        // cria uma nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 200;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para novo imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 0);

        // escrever uma frase na nova imagem

        // escrever a nova imagem em um arquivo
    }

}
