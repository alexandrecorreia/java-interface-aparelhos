package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {

    public static void main(String[] args) {
        
        /**
         * Interface impressora, deskejet, laserjet e equipamento multifuncional
         */
        
        //Impressora impressora = new Deskjet();
        //Impressora impressora = new Laserjet();
        //Impressora impressora = new EquipamentoMultifuncional();
        //impressora.imprimir();

        /**
         * Equipamento Multifuncional
         */
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        /*Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        */

        /**
         * Outros testes
         */

         Deskjet deskjet = new Deskjet();
         Scanner scanner = new Scanner();
         Xerox xerox = new Xerox();


         Impressora impressora = deskjet;
         Digitalizadora digitalizadora = scanner;
         Copiadora copiadora = xerox;

         impressora.imprimir();
         digitalizadora.digitalizar();;
         copiadora.copiar();
    }
}
