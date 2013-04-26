/**
* Abstração de uma Aplicação capaz de manipular
* documentos.
*/
  abstract class Aplicacao {
 
      private Documento doc;
 
      /**
      * Abstração do Factory Method
      */
       abstract Documento criaDocumento();
 
       void novoDocumento() {
           this.doc = this.criaDocumento();
       }
 
       void abrirDocumento() {
           this.doc.abrir();
       }
  }
 
/**
* Abstração de um Documento.
*/
  abstract class Documento {
 
      void abrir() {
          System.out.println("Documento:Abrir documento!");
      }
 
      void fechar() {
          System.out.println("Documento:Fechar documento!");
      }
 
      void gravar() {
          System.out.println("Documento:Gravar documento!");
      }
  }
 
/**
* Esta classe concreta contém a implementação
* de uma aplicação capaz de manipular documentos
* do tipo MeuDocumento.
*/
  class MinhaAplicacao extends Aplicacao {
 
        /**
         * Uma implementação do Factory Method. Este método é 
         * especializado na criação de documentos do tipo MeuDocumento
         */
        Documento criaDocumento() {
            return new MeuDocumento();
        }
  }
 
/**
* Esta classe concreta contém a implementação
* de um tipo de documento específico.
*/
  class MeuDocumento extends Documento {
 
  }