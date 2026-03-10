import documentos.Documento;
import fabricas.FabricaDocumento;
import fabricas.FabricaPDF;
import fabricas.FabricaPlanilha;
import fabricas.FabricaWord;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------");

        System.out.println("======= TESTE: PDF =======");
        FabricaDocumento fabricaPDF = new FabricaPDF();
        Documento documentoPDF = fabricaPDF.criarDocumento();
        documentoPDF.gerar();

        System.out.println("--------------------------");

        System.out.println("===== TESTE: Planilha =====");
        FabricaDocumento fabricaPlanilha = new FabricaPlanilha();
        Documento documentoPlanilha = fabricaPlanilha.criarDocumento();
        documentoPlanilha.gerar();

        System.out.println("--------------------------");

        System.out.println("======= TESTE: Word =======");
        FabricaDocumento fabricaWord = new FabricaWord();
        Documento documentoWord = fabricaWord.criarDocumento();
        documentoWord.gerar();

        System.out.println("--------------------------");
    }
}